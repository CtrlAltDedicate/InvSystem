package inventory;

/// Represents an electronic product in the inventory.
/// Specific attributes: brand and warranty period.
public class Electronics extends Product {
    private String brand;
    private int warrantyPeriod;

    // Constructor that initializes Electronics with all necessary details
    public Electronics(String name, double price, String brand, int warrantyPeriod) {
        super(name, price);
        this.brand = brand;
        this.warrantyPeriod = warrantyPeriod;
    }

    // Getter for brand
    public String getBrand() {
        return brand;
    }

    // Getter for warranty period
    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }

    // Specific details for an electronic item
    @Override
    public String getDetails() {
        return toString() + ", Brand: " + brand + ", Warranty: " + warrantyPeriod + " months";
    }
}
