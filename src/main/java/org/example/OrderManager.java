package org.example;

import java.util.ArrayList;
import java.util.List;

public class OrderManager {
    private List<String> orders = new ArrayList<>();
    private SalesManager salesManager;

    public OrderManager(SalesManager salesManager) {
        this.salesManager = salesManager;
    }

    public void createOrder(String productId, int quantity) {
        salesManager.logSale(productId, quantity);
        orders.add("Product ID: " + productId + ", Quantity: " + quantity);
        System.out.println("Order created: " + productId + ", Quantity: " + quantity);
    }

    public void displayOrders() {
        System.out.println("Current Orders:");
        orders.forEach(System.out::println);
    }
}
