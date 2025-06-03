package inventory;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductManager {
    private ArrayList<Product> products = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void addProduct() {
        System.out.println("Choose category: 1. Electronics 2. Clothing 3. Grocery");
        int choice = scanner.nextInt();
        scanner.nextLine(); // consume newline

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter price: ");
        double price = scanner.nextDouble();
        scanner.nextLine(); // consume newline

        switch (choice) {
            case 1:
                System.out.print("Enter brand: ");
                String brand = scanner.nextLine();
                System.out.print("Enter warranty (months): ");
                int warranty = scanner.nextInt();
                products.add(new Electronics(name, price, brand, warranty));
                break;
            case 2:
                System.out.print("Enter size: ");
                String size = scanner.nextLine();
                System.out.print("Enter material: ");
                String material = scanner.nextLine();
                System.out.print("Enter color: ");
                String color = scanner.nextLine();
                products.add(new Clothing(name, price, size, material, color));
                break;
            case 3:
                System.out.print("Enter weight (kg): ");
                double weight = scanner.nextDouble();
                scanner.nextLine();
                System.out.print("Enter expiration date: ");
                String date = scanner.nextLine();
                products.add(new Grocery(name, price, weight, date));
                break;
        }
        System.out.println("Product added!");
    }

    public void searchProduct() {
        System.out.print("Enter name to search: ");
        String searchName = scanner.nextLine();

        for (Product p : products) {
            if (p.getName().equalsIgnoreCase(searchName)) {
                System.out.println(p.getDetails());
                return;
            }
        }
        System.out.println("Product not found.");
    }

    public void listProducts() {
        for (Product p : products) {
            System.out.println(p.getDetails());
        }
    }

    public void modifyProduct() {
        System.out.print("Enter name of product to modify: ");
        String searchName = scanner.nextLine();

        for (Product p : products) {
            if (p.getName().equalsIgnoreCase(searchName)) {
                System.out.print("Enter new name: ");
                p.setName(scanner.nextLine());

                System.out.print("Enter new price: ");
                p.setPrice(scanner.nextDouble());
                scanner.nextLine();
                System.out.println("Product updated.");
                return;
            }
        }
        System.out.println("Product not found.");
    }
}

