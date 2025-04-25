package net.junit.annotations;

import net.junit.Calculator;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("🚀 BeforeAll Demonstration with Calculator")
public class BeforeAllDemoTest {

    static Calculator calc;

    @BeforeAll
    static void init() {
        calc = new Calculator();
        System.out.println("🔧 Calculator initialized once before all tests.");
    }

    @Test
    @DisplayName("➕ Test Add")
    void testAdd() {
        int result = calc.add(1, 2);
        assertEquals(3, result);
    }

    @Test
    @DisplayName("➖ Test Subtract")
    void testSub() {
        int result = calc.substract(5, 2);
        assertEquals(3, result);
    }

    @Test
    @DisplayName("✖️ Test Multiply")
    void testMul() {
        int result = calc.mul(3, 3);
        assertEquals(9, result);
    }

    @Test
    @DisplayName("➗ Test Divide")
    void testDiv() {
        int result = calc.div(8, 2);
        assertEquals(4, result);
    }
}
