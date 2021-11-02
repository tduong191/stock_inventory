/**
 * A class that holds a trade information like quantity, date, and company that the trade is associated.
 * 
 * @param int date of the trade
 * @param String company that the stock price belongs to
 * @param int quantity of the stocks bought/sold
 * @author tduong 
 * Created: Oct 23, 2021
 */
public class Trade {
    private int date;
    private String company;
    private int quantity;

    public Trade(String[] info) {
        company = info[0];
        quantity = Integer.parseInt(info[1]);
        date = Integer.parseInt(info[2].replace(" ", ""));

    }

    public int getQuantity() {
        return this.quantity;
    }

    public int getDate() {
        return this.date;
    }

    public String getCompany() {
        return this.company;
    }
}
