import java.text.DecimalFormat;

public class StockRandom {

    public static void getRandomPrice(
        StockSubject stockSubject, String stockName, double stockPrice) {

        double randomValue = (Math.random() * 0.06) - 0.03;
        DecimalFormat df = new DecimalFormat("#.##");
        stockSubject.setIbmPrice(Double.valueOf(df.format(randomValue + stockPrice)));
        
    }

}
