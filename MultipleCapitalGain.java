import java.math.BigDecimal;
import java.util.ArrayList;

/**
 * A class that calculate capital gain of a list of trades using many list of prices that stocks
 * were traded by date in each company.
 * 
 * @author tduong created: October 27, 2021
 */
public class MultipleCapitalGain {
    private class Pair<L, W> {
        // the key. Once set it canot be changed
        public final L price;
        // the value
        public W quantity;

        // Create a key value pair.
        Pair(L ky, W val) {
            price = ky;
            quantity = val;
        }
    }
    
    public MultipleCapitalGain() {}

    public static void main(String[] args) {
        ReadCSV ec = new ReadCSV();
        String[] companies = {"A", "B", "C"};
        MultipleCapitalGain rslt = new MultipleCapitalGain();

        // read the trade file and store
        ArrayList<Trade> tradeList = ec.tradeCollection("bsABC.csv");

        // store the stock prices of each company as a pair of company and array of prices in Map
        Map151 compPrice = rslt.readCompPrice(companies);

        // create a stack for each company and store the company - purchase stack pair in a Map
        Map151<String,ArrayStackHW5<Pair<Double, Integer>>> compPurchase = rslt.storePurchase(companies);

        // calculate total capital gain and remaiming stocks
        System.out.println("Total captital gain: " + rslt.readTrade(tradeList, compPrice, companies, compPurchase));

    }

    /**
     * Store the stock prices of each company as a pair of company and array of prices in Map
     * 
     * @param companies the array of companies
     * @return a Map151 of companies (key) and an array list of their stock prices (value).
     */
    private Map151 readCompPrice(String[] companies) {
        ReadCSV ec = new ReadCSV();
        Map151 compPrice = new Map151();
        for (String company : companies) {
            ArrayList<Stock> stockPrice = ec.stockCollection(company + ".csv");
            compPrice.put(company, stockPrice);
        }
        return compPrice;
    }


    /**
     * Create a stack for each company and store the company - purchase stack pair in a Map151
     * 
     * @param companies the array of companies
     * @return a Map151 of companies (key) and an underlying stack for the potential purchases (value).
     */
    private Map151<String,ArrayStackHW5<Pair<Double, Integer>>> storePurchase(String[] companies) {
        Map151<String,ArrayStackHW5<Pair<Double, Integer>>> compPurchase = new Map151();
        for (String company : companies) {
            ArrayStackHW5<Pair<Double, Integer>> underlyingStack = new ArrayStackHW5<Pair<Double, Integer>>();
            compPurchase.put(company,underlyingStack);
        }
        return compPurchase;
    }

    /**
     * Read the list of trades and the Map that contains companies and their price lists. Print the remaining stocks.
     * 
     * @param tradeList the list of trades
     * @param compPrice a Map151 of companies (key) and an array list of their stock prices (value).
     * @param companies the array of companies 
     * @param compPurchase a Map151 of companies (key) and an underlying stack for the purchases (value)
     * @return the total capital gain for the whole trade list
     */
    private double readTrade(ArrayList<Trade> tradeList, Map151 compPrice, String[] companies, Map151 compPurchase) {
        double allGain = 0;
        int remQuan = 0;
        // calculate the gain 
        for (Trade trade : tradeList) {
            for (String company : companies) {
                if (trade.getCompany().equals(company)) {
                    ArrayList<Stock> priceList = (ArrayList<Stock>) compPrice.get(company);
                    allGain += calculateGain(trade, priceList, company, compPurchase);
                }
            }
            remQuan += trade.getQuantity();
        }

        System.out.println("Shares remaiming " + remQuan);
        return allGain;
    }

    /**
     * Read a trade and the list of stock prices and calculate the 
     * net total gain for that trade.
     * 
     * @param trade the trade of interest
     * @param priceList the list of stock prices
     * @param company the company that the stocks belong to
     * @param compPurchase a Map151 of companies (key) and an underlying stack for the purchases (value)
     * @return the capital gain for making that trade
     */
    private double calculateGain(Trade trade, ArrayList<Stock> priceList, String company, Map151 compPurchase) {
        double totalGain = 0;

        if (trade.getQuantity() > 0) {
            buyStock(trade, priceList, company, compPurchase);
        } else {
            double sell_gain = sellStock(trade, trade.getDate(), priceList, company, compPurchase);
            totalGain += sell_gain;
        }
        return totalGain;
        //System.out.println(trade.getDate() + " Total net Capital Gains in " + company + " " +  totalGain);

    }

    /**
     * Add the price and quantity bought to the purchase stack.
     * 
     * @param tr the trade that buy stock
     * @param priceList the list of stock prices - use this list to find the price for the trade
     * @param company the company that the stocks belong to
     * @param compPurchase a Map151 of companies (key) and an underlying stack for the purchases (value)
     */
    private void buyStock(Trade tr, ArrayList<Stock> priceList, String company, Map151<String,ArrayStackHW5<Pair<Double, Integer>>> compPurchase) {
        double buy_price = priceList.get(tr.getDate() - 1).getPrice();
        Pair<Double, Integer> buy = new Pair(buy_price, tr.getQuantity());
        ArrayStackHW5<Pair<Double, Integer>> underlyingStack = compPurchase.get(company);
        underlyingStack.push(buy);
        compPurchase.put(company,underlyingStack);
    }

    /**
     * Calculate the capital net gain when make a sell trade by multiplying the quantity to sell and
     * the most recent stock price(s)
     * 
     * @param trade the trade that sell stocks
     * @param date the date of sell trade 
     * @param priceList the list of stock prices - use this list to find the price for the trade
     * @param company the company that the stocks belong to
     * @param compPurchase a Map151 of companies (key) and an underlying stack for the purchases (value)
     * @return capital gain for the sale
     */
    private Double sellStock(Trade trade, int date, ArrayList<Stock> priceList, String company, Map151<String,ArrayStackHW5<Pair<Double, Integer>>> compPurchase) {
        ArrayStackHW5<Pair<Double, Integer>> underlying = compPurchase.get(company);
        double sell_price = priceList.get(trade.getDate() - 1).getPrice();
        int sell_quant = trade.getQuantity()*(-1);
        double recent_price = underlying.peek().price;
        int recent_quant = underlying.peek().quantity;
        double totalGain = 0;

        while (sell_quant > recent_quant) {
            sell_quant -= recent_quant;
            double gain = recent_quant*(sell_price - recent_price);
            totalGain += gain;
            System.out.println(date + " Sell " + recent_quant + " from " + company + " net " + gain);
            underlying.pop();
            recent_price = underlying.peek().price;
            recent_quant = underlying.peek().quantity;
        } 
        underlying.pop();
        Pair<Double, Integer> update = new Pair(recent_price, recent_quant - sell_quant);
        underlying.push(update);
        double gain = sell_quant* (sell_price - recent_price);
        totalGain += gain;
        System.out.println( date + " SELL " + sell_quant +  " from " + company + " net " + gain);
        
        return totalGain;

    }

}
