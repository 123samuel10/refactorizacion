package org.example;

public class SalesManager {
    private ProductManager productManager;
    private int totalProducts = 0;

    public SalesManager(ProductManager productManager) {
        this.productManager = productManager;
    }

    public void logSale(String productId, int quantity) {
        if (productManager.getProducts().containsKey(productId) && productManager.getProducts().get(productId) >= quantity) {
            productManager.addProduct(productId, -quantity);
            totalProducts -= quantity;
            System.out.println("Sale logged: " + productId + ", Quantity: " + quantity);
        } else {
            System.out.println("Error: Not enough stock for product " + productId);
        }
    }

    public int getTotalProducts() {
        return totalProducts;
    }
}
