import java.util.ArrayList;
import java.util.List;

public class StockSubject implements Subject {

    Stock stock;

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
        observers.stream().forEach(observer -> observer.update(stock));
    }

    public void setStockPrice(double price) {
        this.stock.setPrice(price);
        notifyObserver();
    }
    
}
