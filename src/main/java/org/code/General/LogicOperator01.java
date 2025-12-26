package org.code.General;

public class LogicOperator01 {
    public static void main(String[] args) {
        // && 与 & 案例演示
        int age = 50;
        if (age > 20 && age < 90){
            System.out.println("F1");
        }

        if (age > 20 & age < 90){
            System.out.println("F2");
        }
    }
}
