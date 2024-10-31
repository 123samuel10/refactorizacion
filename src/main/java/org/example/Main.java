package org.example;

public class Main {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        SalesManager salesManager = new SalesManager(productManager);
        InventoryDisplay inventoryDisplay = new InventoryDisplay(productManager);
        OrderManager orderManager = new OrderManager(salesManager);
        EmailService emailService = new EmailService();

        // Agregar productos al inventario
        productManager.addProduct("P001", 50);
        productManager.addProduct("P002", 30);

        // Mostrar inventario
        inventoryDisplay.displayInventory();

        // Crear una orden y registrar venta
        orderManager.createOrder("P001", 5);
        inventoryDisplay.displayInventory();

        // Enviar confirmación por correo
        emailService.sendOrderConfirmation("cliente@techstore.com", "Order for Product P001, Quantity: 5");

        // Mostrar órdenes
        orderManager.displayOrders();
    }
}