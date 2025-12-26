package org.code.General;

import java.util.Date;
import java.util.Scanner;

public class SwitchReviews {
    public static void main(String[] args) {

        // 创建Scanner对象，获取用户输入
        Scanner sc = new Scanner(System.in);

        // 获取时间输入
        Date d = new Date();

        // 引导用户输入
        System.out.println(d + "---- [Ai餐饮] ----");
        System.out.println(d + "请输入您要选择的服务（序号）：");
        System.out.println(d + "1.健康饮食");
        System.out.println(d + "2.今日推荐");
        System.out.println(d + "请输入对应数字（输入 0 退出系统）");

        // 创建输入对象存储
        int user_input_case = sc.nextInt();

        // 使用switch进行判断选项
        switch (user_input_case){
            case 1:
                System.out.println(d + "今天想吃点什么？");
                int user_input_case_1 = user_input_case + 1;
                switch (user_input_case_1){
                    case 2:
                        System.out.println("我是小奶狗");
                        break;
                    case 4:
                        System.out.println("?");
                        break;
                    default:
                        System.out.println("exit");
                }
                break;
            case 2:
                System.out.println(d + "退出");
                break;
            default:
                System.out.println(d + "退出系统，欢迎下次光临！");
        }

        // 使用多个switch进行循环



    }
}
