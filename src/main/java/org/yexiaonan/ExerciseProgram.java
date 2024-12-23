package org.yexiaonan;

import java.util.Scanner;

public class ExerciseProgram  {
    public static void main(String[] args) {
        /*
        周一：跑步
        周二：游泳
        周三：慢走
        周四：动感单车
        周五：拳击
        周六：爬山
        周日：好好吃一顿
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入今天是星期几：");
        int UserInput = scanner.nextInt();

        switch (UserInput){
            case 1:
                System.out.println("今天的计划是：跑步");
                break;
            case 2:
                System.out.println("今天的计划是：游泳");
                break;
            case 3:
                System.out.println("今天的计划是：慢走");
                break;
            case 4:
                System.out.println("今天的计划是：动感单车");
                break;
            case 5:
                System.out.println("今天的计划是：拳击");
                break;
            case 6:
                System.out.println("今天的计划是：爬山");
                break;
            case  7:
                System.out.println("今天的计划是：好好吃一顿");
                break;
            default:
                System.out.println("输入有误");
                break;
        }


    }
}
