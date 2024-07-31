package InventoryManagementSystem;

public class InventoryManagementTest {
        public static void main(String[] args) {
            Inventory inventory = new Inventory();

            Product product1 = new Product("101", "Laptop", 10, 999.99);
            Product product2 = new Product("102", "Smartphone", 50, 499.99);

            inventory.addProduct(product1);
            inventory.addProduct(product2);

            inventory.displayInventory();

            inventory.updateProduct("101", 5, 949.99);
            System.out.println("After updating:");
            inventory.displayInventory();

            inventory.deleteProduct("102");
            System.out.println("After deletion:");
            inventory.displayInventory();
        }
}
