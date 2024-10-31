package org.example;

import java.util.HashMap;
import java.util.Map;

public class ProductManager {
    private Map<String, Integer> products = new HashMap<>();

    public void addProduct(String productId, int quantity) {
        products.put(productId, products.getOrDefault(productId, 0) + quantity);
    }

    public void removeProduct(String productId) {
        products.remove(productId);
    }

    public Map<String, Integer> getProducts() {
        return products;
    }
}
