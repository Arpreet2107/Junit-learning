package net.junit.annotations;

import net.junit.Factorial;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest  {
    @Test
    public void factorialTest(){
        Factorial fact= new Factorial();
        int actualResult = fact.factorial(5);

        assertEquals(120 , actualResult);
    }
}