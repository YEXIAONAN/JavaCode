package org.code.develop.Method;

public class MyMethodTest7 {
    // 计算两数之和（INT）
    static int plusMethodInt (int x, int y){
        return x + y;
    }

    // 计算两数之和（DOUBLE）
    static double plusMethodDouble (Double x,Double y){
        return x + y;
    }

    public static void main(String[] args) {
        int myNum1 = plusMethodInt(8,5);
        double myNum2 = plusMethodDouble(4.3,6.26);
        System.out.println("int: " + myNum1);
        System.out.println("double: " + myNum2);
    }
}
