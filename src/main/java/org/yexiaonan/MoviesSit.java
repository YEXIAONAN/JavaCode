package org.yexiaonan;

import java.util.Scanner;

public class MoviesSit {
    /*在实际开发中，电影院选座也会使用到if判断。假设某影院售卖了100张票，票的序号为1~100:
    其中奇数票号坐左侧，偶数票号坐右侧。键盘录入一个整数表示电影票的票号。
    根据不同情况，给出不同的提示:
    如果票号为奇数，那么打印坐左边如果票号为偶数，那么打印坐右边。*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的票号：");
        int Ticket = scanner.nextInt();

        // 判断票号
        if(Ticket >= 0 && Ticket <=100) {
        // 判断票号是否为0~100以内（超过就是错误的票数）
            if (Ticket % 2 == 1) {
                System.out.println("你可以坐左边");
            } else {
                System.out.println("你可以坐右边");
            }
        }else {
            System.out.println("票数错误");
        }
        // 关闭扫描器
        scanner.close();
        // 结束程序
        System.out.println("程序结束");
    }
}
