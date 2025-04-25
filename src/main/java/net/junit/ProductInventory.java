package net.junit;

import java.util.HashMap;
import java.util.Map;

public class ProductInventory {
    private final Map<String, Product> products = new HashMap<>();

    // Add product to inventory
    public void addProduct(Product product) {
        if (product == null) {
            throw new IllegalArgumentException("Product cannot be null");
        }
        products.put(product.getId(), product);
    }

    // Find product by ID (returns null if not found)
    public Product findProductById(String id) {
        return products.get(id);
    }

    // Find product by name (returns null if not found)
    public Product findProductByName(String name) {
        return products.values().stream()
                .filter(p -> p.getName().equalsIgnoreCase(name))
                .findFirst()
                .orElse(null);
    }

    // Special case: Get expired product (returns null if none expired)
    public Product getFirstExpiredProduct() {
        return products.values().stream()
                .filter(Product::isExpired)
                .findFirst()
                .orElse(null);
    }
}

class Product {
    private final String id;
    private final String name;
    private final boolean expired;

    public Product(String id, String name, boolean expired) {
        this.id = id;
        this.name = name;
        this.expired = expired;
    }

    // Getters
    public String getId() { return id; }
    public String getName() { return name; }
    public boolean isExpired() { return expired; }
}