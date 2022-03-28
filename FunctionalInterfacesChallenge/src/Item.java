public class Item {
    
    private int id;
    private double price;
    private String name, description, manufacturer;

    public Item(int id, double price, String name, String description, String manufacturer) {
        this.setId(id);
        this.setPrice(price);
        this.setName(name);
        this.setDescription(description);
        this.setManufacturer(manufacturer);
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Item [description=" + description + ", id=" + id + ", manufacturer=" + manufacturer + ", name=" + name
                + ", price=" + price + "]";
    }

}
