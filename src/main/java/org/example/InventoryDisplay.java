package org.example;

public class InventoryDisplay {
    private ProductManager productManager;

    public InventoryDisplay(ProductManager productManager) {
        this.productManager = productManager;
    }

    public void displayInventory() {
        System.out.println("Total products: " + productManager.getProducts().values().stream().mapToInt(Integer::intValue).sum());
        productManager.getProducts().forEach((id, quantity) -> System.out.println("Product ID: " + id + ", Quantity: " + quantity));
    }


}
