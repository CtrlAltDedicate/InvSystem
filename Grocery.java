package inventory;

/// Represents a grocery item in the inventory.
/// Specific attributes: weight and expiration date.
public class Grocery extends Product {
    private double weight;
    private String expirationDate;

    // Constructor for Grocery product
    public Grocery(String name, double price, double weight, String expirationDate) {
        super(name, price);
        this.weight = weight;
        this.expirationDate = expirationDate;
    }

    // Specific details for grocery
    @Override
    public String getDetails() {
        return toString() + ", Weight: " + weight + "kg, Expiration Date: " + expirationDate;
    }
}

