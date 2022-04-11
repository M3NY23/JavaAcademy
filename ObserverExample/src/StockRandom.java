import java.text.DecimalFormat;

public class StockRandom {

    public static void getRandomPrice(Stock stock) {

        double randomValue = (Math.random() * 0.06) - 0.03;
        DecimalFormat df = new DecimalFormat("#.##");
        stock.setPrice(Double.valueOf(df.format(randomValue + stock.getPrice())));
        
    }

}
