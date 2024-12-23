package org.yexiaonan;

import java.util.Scanner;

public class StudentScore {
    public static void main(String[] args) {
        System.out.println("请输入小明的分数");
        Scanner scanner = new Scanner(System.in);
        int XiaoMingScore = scanner.nextInt();

        if (XiaoMingScore >= 95 && XiaoMingScore <= 100){
            System.out.println("你的分数是：" + XiaoMingScore + " 奖励是一辆新的自行车");
        } else if (XiaoMingScore >= 90 && XiaoMingScore <=94) {
            System.out.println("你的分数是：" + XiaoMingScore + " 奖励是去游乐场");
        } else if (XiaoMingScore >= 80 && XiaoMingScore <=89) {
            System.out.println("你的分数是：" + XiaoMingScore + " 奖励是一个变形金刚");
        }else if (XiaoMingScore >= 0 & XiaoMingScore <=79){
            System.out.println("你的分数是：" + XiaoMingScore + " 奖励是打屁股");
        }else {
            System.out.println("成绩输入有误");
        }
    }
}

