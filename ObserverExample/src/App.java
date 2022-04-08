public class App {
    public static void main(String[] args) throws Exception {
        
        StockSubject stockSubject = new StockSubject();
        StockObserver observer1 = new StockObserver(stockSubject);
        stockSubject.setApplePrice(127);
        stockSubject.setGooglePrice(230);
        stockSubject.setIbmPrice(305);

        StockRandom.getRandomPrice(stockSubject, "IBM", 305);
    }
}
