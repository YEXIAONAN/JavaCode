package org.code.general;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        // 导入Scanner获取用户从键盘输入的数据
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入您的姓名：");
        String name = sc.next();
        System.out.println("请输入您的年龄：");
        int age = sc.nextInt();
        System.out.println("请输入您的薪水：");
        double money = sc.nextInt();

        System.out.println("您的姓名是：" + name);
        System.out.println("您的年龄是：" + age);
        System.out.println("您的薪水是：" + money);
    }
}
