import java.io.Serializable;
public class Product implements Serializable{
    //Getting into Practice: Input/Output
    //Exercise 2: Objects Serialization

    private long id;
    private String name;
    private String brand;
    private double price;
    private String description;
    private int stock;

    public Product(long id, String name, String brand, double price, String description, int stock) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.description = description;
        this.stock = stock;
    }

    public long getId() {
        return id;
    }

    @Override
    public String toString() {
        return id + " | " + name + " | " + brand + " | " + price + " | " + stock + " | " + description;
    }

}

