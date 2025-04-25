package net.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    public void addTest(){
        Calculator calculator = new Calculator();
        int actualResult = calculator.add(20, 29 );

        assertEquals( 49, actualResult);
    }
}