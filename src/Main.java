// Main.java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Warehouse warehouse = new Warehouse("Central Warehouse");

        System.out.println("=== Aggregation demo: Products and Warehouse ===");
        System.out.println("You can create Product objects (they can exist independently)");
        System.out.println("and choose to add them to the Warehouse (aggregation).");

        while (true) {
            System.out.print("\nCreate a new product? (y/n): ");
            String create = sc.nextLine().trim();
            if (!create.equalsIgnoreCase("y")) break;

            System.out.print("Product name: ");
            String name = sc.nextLine().trim();

            System.out.print("Price: ");
            double price;
            try {
                price = Double.parseDouble(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Invalid price — using 0.0");
                price = 0.0;
            }

            Product p = new Product(name, price);
            System.out.print("Add this product to the warehouse? (y/n): ");
            String add = sc.nextLine().trim();
            if (add.equalsIgnoreCase("y")) {
                warehouse.addProduct(p);
                System.out.println("Added to warehouse.");
            } else {
                System.out.println("Product created but NOT added to warehouse (exists independently).");
            }
        }

        System.out.println("\n--- Warehouse contents ---");
        warehouse.listProducts();
        System.out.println("Total products in warehouse: " + warehouse.getCount());

        // Demonstrate independent object that is not inside the container
        Product detached = new Product("DetachedSeed", 0.0);
        System.out.println("\nDetached product (exists independently):");
        detached.display();

        sc.close();
    }
}
