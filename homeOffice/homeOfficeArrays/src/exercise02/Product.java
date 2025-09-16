package exercise02;

public class Product {
    //Attributes
    private String name;
    private double price;
    private Object product01;

    //Constructors
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    //Get and set

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

    //toString method
    @Override
    public String toString() {
        return "Name: " + name + "\nPrice: " + price;
    }
}
