public class StockObserver implements Observer {

    private int observerID;
    private static int observerIdGenerator = 0;

    public StockObserver(Subject stockSubject) {
        stockSubject.register(this);
        observerID=++observerIdGenerator;
    }

    @Override
    public void update(Stock stock) {
        System.out.println("Observer ID: "+observerID+" "+stock.toString());
    }   

}
