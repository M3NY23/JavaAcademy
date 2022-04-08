import java.util.ArrayList;
import java.util.List;

public class StockSubject implements Subject {

    private double ibmPrice;
    private double applePrice;
    private double googlePrice;

    private List<Observer> observers = new ArrayList<>();

    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void ungister(Observer observer) {
        observers.remove(observer);
        
    }

    @Override
    public void notifyObserver() {
        observers.stream().forEach(observer -> observer.update(ibmPrice, applePrice, googlePrice));
    }

    public void setIbmPrice(double ibmPrice) {
        this.ibmPrice = ibmPrice;
        notifyObserver();
    }

    public void setApplePrice(double applePrice) {
        this.applePrice = applePrice;
        notifyObserver();
    }

    public void setGooglePrice(double googlePrice) {
        this.googlePrice = googlePrice;
        notifyObserver();
    }

}
