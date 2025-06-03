package inventory;

import java.util.Scanner;

/// Main class to drive the menu system and interact with the user.
public class Main {
    public static void main(String[] args) {
        ProductManager manager = new ProductManager(); // Business logic handler
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        // Main loop for menu options
        while (!exit) {
            System.out.println("\n--- Inventory Menu ---");
            System.out.println("1. Add Product");
            System.out.println("2. Search Product");
            System.out.println("3. Modify Product");
            System.out.println("4. List All Products");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Clear newline

            // Call relevant method based on user choice
            switch (choice) {
                case 1 -> manager.addProduct();
                case 2 -> manager.searchProduct();
                case 3 -> manager.modifyProduct();
                case 4 -> manager.listProducts();
                case 5 -> exit = true;
                default -> System.out.println("Invalid choice.");
            }
        }

        System.out.println("Exiting application.");
    }
}
