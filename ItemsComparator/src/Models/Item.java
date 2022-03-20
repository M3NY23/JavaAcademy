package Models;

public class Item {

    public String id;
    public String name;
    public Double price;

    public Item(String id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return ("(" + id + ", " + name + ", " + price + ")");
    }

}
