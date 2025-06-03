package inventory;

public class Electronics extends Product {
    private String brand;
    private int warrantyPeriod;

    public Electronics(String name, double price, String brand, int warrantyPeriod) {
        super(name, price);
        this.brand = brand;
        this.warrantyPeriod = warrantyPeriod;
    }

    public String getBrand() { return brand; }
    public int getWarrantyPeriod() { return warrantyPeriod; }

    @Override
    public String getDetails() {
        return toString() + ", Brand: " + brand + ", Warranty: " + warrantyPeriod + " months";
    }
}
