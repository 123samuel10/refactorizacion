package org.example;

public class EmailService {
    public void sendOrderConfirmation(String email, String orderDetails) {
        if (isValidEmail(email)) {
            System.out.println("Sending order confirmation to " + email);
            System.out.println("Order details: " + orderDetails);
        } else {
            System.out.println("Error: Invalid email address.");
        }
    }

    private boolean isValidEmail(String email) {
        // Validación simple de correo electrónico
        return email.contains("@") && email.contains(".");
    }
}
