public class StockObserver implements Observer {

    private int observerID;
    private static int observerIdGenerator = 0;

    public StockObserver(Subject stockSubject) {
        stockSubject.register(this);
        observerID=++observerIdGenerator;
    }

    @Override
    public void update(double ibmPrice, double applePrice, double googlePrice) {
        System.out.println("StockObserver [observerID=" + observerID + ", googlePrice=" + googlePrice + ", ibmPrice=" + ibmPrice
        + ", applePrice=" + applePrice + "]");
    }

}
