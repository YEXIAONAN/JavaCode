package org.yexiaonan;

import java.util.Scanner;

public class NumTest {
    public static void main(String[] args) {
        // 需求：
        // 键盘录入三位数，将其拆分为个位，十位，百位，打印在控制台

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个三位数：");
        int NumA = scanner.nextInt();

        int one = NumA % 10;
        int two = NumA / 10 % 10;
        int three = NumA / 10 / 10 %10;
        System.out.println(one);
        System.out.println(two);
        System.out.println(three);



    }
}
