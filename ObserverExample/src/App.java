import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) throws Exception {
        
        List<Stock> stocks = new ArrayList<Stock>(); 

        stocks.add(new Stock("lenovo", 230.50));
        stocks.add(new Stock("apple", 260.99));
        stocks.add(new Stock("asus", 240.50));

    
        StockObserver observer1 = new StockObserver(stocks.get(2));
        StockObserver observer2 = new StockObserver(stocks.get(0));
        // StockObserver observer3 = new StockObserver(stocks.get(1));

        StockRandom.getRandomPrice(stocks.get(2));
        StockRandom.getRandomPrice(stocks.get(0)); 
        StockRandom.getRandomPrice(stocks.get(1));  

    }
}
