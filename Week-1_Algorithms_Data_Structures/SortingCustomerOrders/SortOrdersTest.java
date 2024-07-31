package SortingCustomerOrders;

// SortOrdersDemo.java
import java.util.Arrays;

public class SortOrdersTest {
    public static void main(String[] args) {
        Order[] orders = {
                new Order("001", "Alice", 250.0),
                new Order("002", "Bob", 150.0),
                new Order("003", "Charlie", 300.0),
                new Order("004", "David", 200.0),
                new Order("005", "Eve", 100.0)
        };

        // Bubble Sort
        Order[] bubbleSortedOrders = Arrays.copyOf(orders, orders.length);
        BubbleSort.bubbleSort(bubbleSortedOrders);
        System.out.println("Bubble Sort Result:");
        for (Order order : bubbleSortedOrders) {
            System.out.println(order);
        }

        // Quick Sort
        Order[] quickSortedOrders = Arrays.copyOf(orders, orders.length);
        QuickSort.quickSort(quickSortedOrders, 0, quickSortedOrders.length - 1);
        System.out.println("\nQuick Sort Result:");
        for (Order order : quickSortedOrders) {
            System.out.println(order);
        }
    }
}

