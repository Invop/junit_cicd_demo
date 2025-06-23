package org.example;

public class MathUtils {
    public static int add(int a, int b) {
        return a + b;
    }

    public static boolean isPositive(int number) {
        return number > 0;
    }

    public static double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Ділення на нуль!");
        }
        return (double) a / b;
    }

}