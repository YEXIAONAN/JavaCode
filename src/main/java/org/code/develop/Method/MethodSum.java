package org.code.develop.Method;

public class MethodSum {
    static int count(int x,int y) {
        return x + y;
    }

    public static void main(String[] args) {
        System.out.println("计算两数之和");
        System.out.println(count(10,20));
    }
}
