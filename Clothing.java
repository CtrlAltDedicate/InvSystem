package inventory;

/// Represents a clothing item in the inventory.
/// Specific attributes: size, material, and color.
public class Clothing extends Product {
    private String size;
    private String material;
    private String color;

    // Constructor for Clothing product
    public Clothing(String name, double price, String size, String material, String color) {
        super(name, price);
        this.size = size;
        this.material = material;
        this.color = color;
    }

    // Specific details for clothing
    @Override
    public String getDetails() {
        return toString() + ", Size: " + size + ", Material: " + material + ", Color: " + color;
    }
}
