package org.code;

import java.util.Scanner;

public class IfExercise01 {
    public static void main(String[] args) {
        // 编写程序，声明两个double类型变量并且赋值。判断第一个数大于10.0，且第二个数小于20.0，打印两数之和。

        // 判断一个年份是否是闰年，闰年的条件是复合下面二者之一：
        //（1）年份能被4整除，但不能被100整除
        //（2）能被400整除

        double d1 = 34.5;
        double d2 = 2.6;

        // double练习
//        if (d1 >= 10.0){
//            if (d2 >= 20.0){
//                System.out.println(d1+d2);
//            }
//        }else {
//            System.out.println("我是错误~❌!");
//        }

        if (d1 > 10.0 && d2 < 20.0){
            System.out.println("两数之和：" + (d1+d2));
        }

        int sum1 = 10;
        int sum2 = 30;

        int sum = sum1 + sum2;
        if (sum % 3 == 0 && sum % 5 ==0){
            System.out.println("OK!");
        }else {
            System.out.println("No!");
        };

        // 判断年份是否为闰年
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年份判断其是否为闰年：");
        int year = sc.nextInt();

        if (year % 4 == 0 && year % 100 != 0 || year % 400 ==0){
            System.out.println(year + "是闰年");
        }else {
            System.out.println(year + "不是闰年");
        }


    }
}
