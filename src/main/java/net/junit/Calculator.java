package net.junit;

public class Calculator {
    public int add(int a, int b){
        return a+b;
    }
    public int substract(int a, int b){
        return a-b;
    }
    public int mul(int a, int b){
        return a*b;
    }
    public int div(int a, int b){
        if(b==0){
            throw new ArithmeticException("Divisino by zero");
        }
        return a/b;
    }

}
