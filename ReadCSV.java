import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * A class that knows how to read CSV files. Note that this class does not know
 * how to read general csv files, but only very simple ones.
 * 
 * @author gtowell created: August 1, 2021
 */
public class ReadCSV {
    public static void main(String[] args) {
        ReadCSV ec = new ReadCSV();
        // ArrayList<Stock> stockPrice = ec.stockCollection("A.csv");
        //ArrayList<Trade> tradeList = ec.tradeCollection("baA.csv");
        // System.out.println(stockPrice.get(0).getPrice());
        //System.out.println(tradeList.get(0).getDate());
    }

    public ReadCSV() {
    }

    /**
     * Read the given csv file and return its contents as an arraylist of string
     * arrays.
     * 
     * @param filename the file to read
     * @return the arraylist
     */
    public ArrayList<String[]> csvCollection(String filename) {
        ArrayList<String[]> rslt = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename));) {
            while (br.ready()) {
                String l = br.readLine();
                String[] brokenLine = l.split(",", 25);
                rslt.add(brokenLine);
            }
        //    System.out.println("Lines all read ");
        } catch (FileNotFoundException fnf) {
            System.err.println("Could not open the file" + fnf);
        } catch (IOException ioe) {
            System.err.println("Reading problem" + ioe);
        }
        return rslt;
    }

    /**
     * Read a csv file and echo its contents out to the screen.
     * 
     * @param filename the csv file to read
     */
    public void echoCSV(String filename) {
        try (BufferedReader br = new BufferedReader(new FileReader(filename));) {
            int lineCount = 0;
            while (br.ready()) {
                String l = br.readLine();
                lineCount++;
                String[] brokenLine = l.split(",", 25);
                System.out.println(lineCount + "    ");
                for (int i = 0; i < brokenLine.length; i++) {
                    System.out.print(" " + i + ":" + brokenLine[i]);
                }
            }
        //    System.out.println("Lines all read ");
        } catch (FileNotFoundException fnf) {
            System.err.println("Could not open the file" + fnf);
        } catch (IOException ioe) {
            System.err.println("Reading problem" + ioe);
        }
    }

    /**
     * Read the given csv stock file and return its contents as an array list of stocks.
     * 
     * @param filename the file to read
     * @return the array list
     */
    public ArrayList<Stock> stockCollection(String filename) {
        ArrayList<Stock> rslt = new ArrayList<Stock>();
        ArrayList<String[]> arr = csvCollection(filename);
        for (int i = 1; i < arr.size(); i++) {
            Stock stk = new Stock(arr.get(i));
            rslt.add(stk);
        }
        return rslt;
    }

    /**
     * Read the given csv trade file and return its contents as an array list of trades.
     * 
     * @param filename the file to read
     * @return the array list
     */
    public ArrayList<Trade> tradeCollection(String filename) {
        ArrayList<Trade> rslt = new ArrayList<Trade>();
        ArrayList<String[]> arr = csvCollection(filename);
        for (int i = 0; i < arr.size(); i++) {
            Trade stk = new Trade(arr.get(i));
            rslt.add(stk);
        }
        return rslt;
    }


}
