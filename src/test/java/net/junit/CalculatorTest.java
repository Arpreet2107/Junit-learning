package net.junit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import net.junit.Calculator;

@DisplayName("Calculator Operations Test")
public class CalculatorTest {
    @DisplayName("Test Addition of Two Numbers")
    @Test
    void addTest(){
        Calculator calc = new Calculator();
        int add = calc.add(2,3);

        assertEquals(5,add);
    }

    @DisplayName("Test Addition of Two Numbers")
    @Test
    void substractionTest(){
        Calculator calc = new Calculator();
        int sub = calc.substract(2,3);

        assertEquals(5,sub);
    }

    @DisplayName("Test Addition of Two Numbers")
    @Test
    void mulTest(){
        Calculator calc = new Calculator();
        int mul = calc.mul(2,3);

        assertEquals(5,mul);
    }

    @DisplayName("Test Addition of Two Numbers")
    @Test
    void divTest(){
        Calculator calc = new Calculator();
        int div = calc.div(2,3);

        assertEquals(5,div);
    }


//    @Test
//    public void addTest(){
//        Calculator calculator = new Calculator();
//        int actualResult = calculator.add(20, 29 );
//
//        assertEquals( 49, actualResult);
//    }

}