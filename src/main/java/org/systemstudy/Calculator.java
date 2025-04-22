package org.systemstudy;

public class Calculator {

    public static void main(String[] args) {
        // 调用加法方法
        int sum = add(5, 3);
        System.out.println("Sum: " + sum);

        // 调用减法方法
        int difference = subtract(5, 3);
        System.out.println("Difference: " + difference);

        // 调用乘法方法
        int product = multiply(5, 3);
        System.out.println("Product: " + product);

        // 调用除法方法
        double quotient = divide(5, 3);
        System.out.println("Quotient: " + quotient);
    }

    // 加法方法
    public static int add(int a, int b) {
        return a + b;
    }

    // 减法方法
    public static int subtract(int a, int b) {
        return a - b;
    }

    // 乘法方法
    public static int multiply(int a, int b) {
        return a * b;
    }

    // 除法方法
    public static double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero.");
        }
        return (double) a / b;
    }
}