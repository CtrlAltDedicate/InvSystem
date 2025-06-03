package inventory;

/// Abstract base class for all products in the inventory.
/// Common attributes: name and price.
public abstract class Product {
    private String name;
    private double price;

    // Constructor to initialize shared fields for all product types
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Getter for product name
    public String getName() {
        return name;
    }

    // Getter for product price
    public double getPrice() {
        return price;
    }

    // Setter for product name
    public void setName(String name) {
        this.name = name;
    }

    // Setter for product price
    public void setPrice(double price) {
        this.price = price;
    }

    // Abstract method to get details, implemented by subclasses
    public abstract String getDetails();

    // A string representation of the product (basic)
    @Override
    public String toString() {
        return "Name: " + name + ", Price: $" + price;
    }
}
