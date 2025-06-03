package inventory;

public class Grocery extends Product {
    private double weight;
    private String expirationDate;

    public Grocery(String name, double price, double weight, String expirationDate) {
        super(name, price);
        this.weight = weight;
        this.expirationDate = expirationDate;
    }

    @Override
    public String getDetails() {
        return toString() + ", Weight: " + weight + "kg, Expiration Date: " + expirationDate;
    }
}
