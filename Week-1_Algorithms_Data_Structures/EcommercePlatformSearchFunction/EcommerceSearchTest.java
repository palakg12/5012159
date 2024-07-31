import EcommercePlatformSearchFunction.Product;
import EcommercePlatformSearchFunction.SearchAlgorithms;

import java.util.Arrays;

public class EcommerceSearchTest {
    public static void main(String[] args) {
        Product[] products = {
                new Product("101", "Laptop", "Electronics"),
                new Product("102", "Smartphone", "Electronics"),
                new Product("103", "Tablet", "Electronics"),
                new Product("104", "Headphones", "Accessories"),
                new Product("105", "Keyboard", "Accessories")
        };

        // Sorting products array by product name for binary search
        Arrays.sort(products, (p1, p2) -> p1.getProductName().compareToIgnoreCase(p2.getProductName()));

        // Linear search
        Product foundProduct = SearchAlgorithms.linearSearch(products, "Tablet");
        System.out.println("Linear Search Result: " + (foundProduct != null ? foundProduct : "Product not found"));

        // Binary search
        foundProduct = SearchAlgorithms.binarySearch(products, "Tablet");
        System.out.println("Binary Search Result: " + (foundProduct != null ? foundProduct : "Product not found"));
    }
}
