package InventoryManagementSystem;

// Inventory.java
import java.util.HashMap;

public class Inventory {
    private HashMap<String, Product> products;

    public Inventory() {
        this.products = new HashMap<>();
    }

    public void addProduct(Product product) {
        products.put(product.getProductId(), product);
    }

    public void updateProduct(String productId, int quantity, double price) {
        Product product = products.get(productId);
        if (product != null) {
            product.setQuantity(quantity);
            product.setPrice(price);
        } else {
            System.out.println("Product not found");
        }
    }

    public void deleteProduct(String productId) {
        products.remove(productId);
    }

    public Product getProduct(String productId) {
        return products.get(productId);
    }

    public void displayInventory() {
        for (Product product : products.values()) {
            System.out.println(product);
        }
    }
}

