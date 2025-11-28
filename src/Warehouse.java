// Warehouse.java
import java.util.ArrayList;
import java.util.List;

public class Warehouse {
    private String warehouseName;
    private List<Product> products; // aggregation: holds references to Product instances

    public Warehouse(String warehouseName) {
        this.warehouseName = warehouseName;
        this.products = new ArrayList<>();
    }

    // Add an existing Product to this Warehouse
    public void addProduct(Product p) {
        if (p != null) products.add(p);
    }

    // Remove a product (by reference)
    public void removeProduct(Product p) {
        products.remove(p);
    }

    // List products currently in the warehouse
    public void listProducts() {
        System.out.println("Products in " + warehouseName + ":");
        if (products.isEmpty()) {
            System.out.println("  (none)");
            return;
        }
        for (Product p : products) {
            p.display();
        }
    }

    public int getCount() {
        return products.size();
    }
}
