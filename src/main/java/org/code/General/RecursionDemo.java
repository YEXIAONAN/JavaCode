package org.code.General;

public class RecursionDemo {
    public static void main(String[] args) {
        int n = 10;

        // 计算累加和
        int sumResult = sum(n);
        System.out.println("1 到 " + n + " 的累加和是: " + sumResult);

        // 计算阶乘
        int factorialResult = factorial(n);
        System.out.println(n + " 的阶乘是: " + factorialResult);
    }

    // 计算累加和的递归函数
    public static int sum(int k) {
        if (k <= 0) {
            return 0;  // 递归终止条件
        } else {
            return k + sum(k - 1);  // 递归调用
        }
    }

    // 计算阶乘的递归函数
    public static int factorial(int k) {
        if (k == 0 || k == 1) {
            return 1;  // 递归终止条件
        } else {
            return k * factorial(k - 1);  // 递归调用
        }
    }
}
