package net.junit.annotations;

import net.junit.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("🔁 BeforeEach Demonstration with Calculator")
public class BeforeEachDemoTest {

    Calculator calc;

    @BeforeEach
    void setUp() {
        calc = new Calculator();
        System.out.println("✅ Calculator initialized before each test");
    }

    @Test
    @DisplayName("➕ Test Addition")
    void testAdd() {
        int result = calc.add(5, 3);
        assertEquals(8, result);
    }

    @Test
    @DisplayName("➖ Test Subtraction")
    void testSubtract() {
        int result = calc.substract(10, 4);
        assertEquals(6, result);
    }

    @Test
    @DisplayName("✖️ Test Multiplication")
    void testMultiply() {
        int result = calc.mul(6, 7);
        assertEquals(42, result);
    }

    @Test
    @DisplayName("➗ Test Division")
    void testDivide() {
        int result = calc.div(20, 4);
        assertEquals(5, result);
    }
}
