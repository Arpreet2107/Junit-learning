package net.junit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ProductInventoryTest {
    private ProductInventory inventory;

    @BeforeEach
    void setUp() {
        inventory = new ProductInventory();
        inventory.addProduct(new Product("P100", "Laptop", false));
        inventory.addProduct(new Product("P200", "Milk", true)); // Expired product
    }

    // ===== assertNull VARIATIONS =====

    @Test
    void testFindNonExistentProduct() {
        // 1. Basic assertNull
        assertNull(inventory.findProductById("P999"));

        // 2. With String message
        assertNull(
                inventory.findProductByName("Non-existent"),
                "Non-existent product name should return null"
        );
    }

    @Test
    void testNullInputHandling() {
        // 3. With Supplier<String> message (lazy evaluation)
        assertNull(
                inventory.findProductById(null),
                () -> "Null ID search should return null"
        );
    }

    @Test
    void testExpiredProductSearch() {
        // 4. Test when no expired products exist
        inventory = new ProductInventory(); // Reset with no expired products
        inventory.addProduct(new Product("P300", "Bread", false));

        assertNull(
                inventory.getFirstExpiredProduct(),
                "Should return null when no expired products exist"
        );

        // 5. Test with dynamic message
        String testId = "P404";
        assertNull(
                inventory.findProductById(testId),
                () -> String.format("Product ID %s should return null", testId)
        );
    }

    @Test
    void testPositiveCases() {
        // Contrast with assertNotNull
        assertNotNull(
                inventory.findProductById("P100"),
                "Existing product should not return null"
        );
    }
}