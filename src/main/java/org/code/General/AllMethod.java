package org.code.General;

import java.util.Scanner;

class AllMethod {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter name, age and salary:");

        // 字符串输入
        String name = myObj.nextLine();

        // 数字输入
        int age = myObj.nextInt();
        double salary = myObj.nextDouble();

        // 输出用户输入
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }
}