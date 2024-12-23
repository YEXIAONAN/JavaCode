package org.yexiaonan;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class ReviewFrist {
    public static void main(String[] args) {
        // 1.输出1~100的数字
        for (int i = 0; i <= 100; i++){
            System.out.println(i);
        }

        // 2.从键盘录入数字，判断是奇数还是偶数
        Scanner scanner = new Scanner(System.in);
        int Num = scanner.nextInt();

        if (Num % 2 == 1){
            System.out.println("是奇数");
        }else {
            System.out.println("是偶数");
        }

        // 3.利用if判断用户成绩，100为满分，100分以下为不及格
        int Score = scanner.nextInt();
        if (Score >= 100 && Score <= 100){
            System.out.println("恭喜您，成绩合格！");
        }else {
            System.out.println("垃圾，你妈真废物！");
        }

    }
}
