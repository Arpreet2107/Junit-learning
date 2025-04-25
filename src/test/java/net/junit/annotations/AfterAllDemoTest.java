package net.junit.annotations;

import net.junit.Calculator;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("🧹 AfterAll Demonstration with Calculator")
public class AfterAllDemoTest {

    static Calculator calc = new Calculator();

    @Test
    @DisplayName("➕ Test Addition")
    void testAdd() {
        int result = calc.add(10, 5);
        assertEquals(15, result);
    }

    @Test
    @DisplayName("➖ Test Subtraction")
    void testSub() {
        int result = calc.substract(20, 5);
        assertEquals(15, result);
    }

    @Test
    @DisplayName("✖️ Test Multiplication")
    void testMul() {
        int result = calc.mul(2, 8);
        assertEquals(16, result);
    }

    @Test
    @DisplayName("➗ Test Division")
    void testDiv() {
        int result = calc.div(12, 3);
        assertEquals(4, result);
    }

    @AfterAll
    static void cleanup() {
        System.out.println("🧽 All tests completed. Cleanup done!");
    }
}
