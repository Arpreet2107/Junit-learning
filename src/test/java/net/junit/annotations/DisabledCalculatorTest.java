package net.junit.annotations;

import net.junit.Calculator;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DisabledCalculatorTest {

    @Test
    @DisplayName("➕ Add Test")
    void addTest() {
        Calculator calc = new Calculator();
        int add = calc.add(2, 3);
        assertEquals(5, add);
    }

    @Disabled("🚫 Disabled until bug #40 is fixed")
    @Test
    @DisplayName("➖ Subtract Test (Disabled)")
    void subTest() {
        Calculator calc = new Calculator();
        int sub = calc.substract(3, 2);
        assertEquals(1, sub);
    }

    @Test
    @DisplayName("✖️ Multiply Test")
    void mulTest() {
        Calculator calc = new Calculator();
        int mul = calc.mul(2, 3);
        assertEquals(6, mul);
    }

    @Test
    @DisplayName("➗ Divide Test")
    void divTest() {
        Calculator calc = new Calculator();
        int div = calc.div(10, 5);
        assertEquals(2, div);
    }
}
