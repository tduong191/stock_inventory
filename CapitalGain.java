import java.math.BigDecimal;
import java.util.ArrayList;

/**
 * A class that calculate capital gain of a list of trades using a list of prices of a company's stock by date.
 * 
 * @author tduong created: October 27, 2021
 */
public class CapitalGain {
    // the underlying stack for purchases
    ArrayStackHW5<Pair<Double, Integer>> underlying = new ArrayStackHW5();
    
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

    public CapitalGain() {}

    public static void main(String[] args) {
        CapitalGain result = new CapitalGain();
        ReadCSV ec = new ReadCSV();

        // read the trade file
        ArrayList<Trade> tradeList = ec.tradeCollection("baA.csv");

        // read the stock price file
        ArrayList<Stock> stockPrice = ec.stockCollection("A.csv");

        // calculate the capital gain
        result.calculateGain(tradeList, stockPrice);
    }

    /**
     * Read the list of trades and the list of stock prices and print the 
     * net total gain for all trades, and the remaining stocks.
     * 
     * @param tradeList the list of trades
     * @param stockPrice the list of stock prices
     */
    private void calculateGain(ArrayList<Trade> tradeList, ArrayList<Stock> stockPrice) {
        double totalGain = 0;
        int remQuan = 0;

        // If quantity of trade > 0, then buy stock. Else, sell stock and calculate gain.
        for (int i = 0; i < tradeList.size(); i++) {
            remQuan += tradeList.get(i).getQuantity();
            if (tradeList.get(i).getQuantity() > 0) {
                buyStock(tradeList.get(i), stockPrice); 
            } else {
                double sell_gain = sellStock(tradeList.get(i), tradeList.get(i).getDate(), stockPrice);
                totalGain += sell_gain;

            }
        }
        System.out.println("Total net Capital Gains = " + totalGain);
        System.out.println("Shares Remaining = " + remQuan);
    }


    /**
     * Add the price and quantity bought to the purchase stack.
     * 
     * @param tr the trade that buy stock
     * @param priceList the list of stock prices - use this list to find the price for the trade
     */
    private void buyStock(Trade tr, ArrayList<Stock> priceList) {
        double buy_price = priceList.get(tr.getDate() - 1).getPrice();
        Pair<Double, Integer> buy = new Pair(buy_price, tr.getQuantity());
        underlying.push(buy);
    }

    /**
     * Calculate the capital net gain when make a sell trade by multiplying the quantity to sell and
     * the most recent stock price(s)
     * 
     * @param tr the trade that sell stocks
     * @param date the date of sell trade 
     * @param priceList the list of stock prices - use this list to find the price for the trade
     * @return total capital gain
     */
    private Double sellStock(Trade tr, int date, ArrayList<Stock> priceList) {
        double sell_price = priceList.get(tr.getDate() - 1).getPrice();
        int sell_quant = tr.getQuantity()*(-1);
        double recent_price = underlying.peek().price;
        int recent_quant = underlying.peek().quantity;
        double totalGain = 0;

        // If the quantity that we want to sell is greater than the quantity of the most recent
        // purchase, then compute the gain and pop the recent purchase out of the strack. Keep doing that
        // with the remaining quatity to sell until the sell quantity is less than those recent purchase quantity.
        while (sell_quant > recent_quant) {
            sell_quant -= recent_quant;
            double gain = recent_quant*(sell_price - recent_price);
            totalGain += gain;
            System.out.println(date + " Sell " + recent_quant + " net " + gain);
            underlying.pop();
            recent_price = underlying.peek().price;
            recent_quant = underlying.peek().quantity;
        } 
        
        // If the quantity to sell is less than the quantity of the most recent purchase, then 
        // we calculate gain and update the remaining quatity of the recent purchase.
        underlying.pop();
        Pair<Double, Integer> update = new Pair(recent_price, recent_quant - sell_quant);
        underlying.push(update);
        double gain = sell_quant* (sell_price - recent_price);
        totalGain += gain;
        System.out.println( date + " SELL " + sell_quant + " net " + gain);
        
        return totalGain;
    }
}
