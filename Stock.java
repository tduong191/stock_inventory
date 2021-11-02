import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
/**
 * A class that holds stock price.
 * 
 * @param double price
 * @author tduong 
 * Created: Oct 23, 2021
 */
public class Stock {
    private Double price;

    public Stock(String[] info) {
        price = Double.parseDouble(info[4]);
    }

    public double getPrice() {
        return this.price;
    }
}
