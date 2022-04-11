import java.util.ArrayList;
import java.util.List;

public class Stock implements Subject {
    private String name;
    private double price;

    private List<Observer> observers = new ArrayList<>();

    public Stock(String name, double price) {
        this.setName(name);
        this.setPrice(price);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyObserver();
    }

    public double getPrice() {
        return price;
    }
    
    public void setPrice(double price) {
        this.price = price;
        notifyObserver();
    }

    @Override
    public String toString() {
        return "Stock [name=" + name + ", price=" + price + "]";
    }

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
        observers.stream().forEach(observer -> observer.update(this));
    }
}
