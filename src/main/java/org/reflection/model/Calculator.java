package org.reflection.model;

public class Calculator {
    public void sum(int a, int b) {
        int result = a + b;
        System.out.println("Sum: " + a + " and " + "b = " + result);
    }
    public void substraction(int a, int b) {
        int result = a - b;
        System.out.println("Subtraction: " + a + " and " + "b = " + result);
    }
    public void multiplication(int a, int b) {
        int result = a * b;
        System.out.println("Multiplication: " + a + " and " + "b = " + result);
    }
    public void division(double a, double b) {
        double result = a / b;
        System.out.println("Division: " + a + " and " + "b = " + result);
    }
}
