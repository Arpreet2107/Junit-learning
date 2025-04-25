package net.junit.annotations;

import net.junit.Calculator;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("🔁 AfterEach Demonstration with Calculator")
public class AfterEachDemoTest {

    Calculator calc = new Calculator();

    @Test
    @DisplayName("➕ Add Test")
    void testAdd() {
        int result = calc.add(2, 3);
        assertEquals(5, result);
    }

    @Test
    @DisplayName("➖ Subtract Test")
    void testSub() {
        int result = calc.substract(10, 5);
        assertEquals(5, result);
    }

    @Test
    @DisplayName("✖️ Multiply Test")
    void testMul() {
        int result = calc.mul(4, 5);
        assertEquals(20, result);
    }

    @Test
    @DisplayName("➗ Divide Test")
    void testDiv() {
        int result = calc.div(20, 4);
        assertEquals(5, result);
    }

    @AfterEach
    void tearDown() {
        System.out.println("🧹 Test completed. Resources cleaned or state reset.");
    }
}
