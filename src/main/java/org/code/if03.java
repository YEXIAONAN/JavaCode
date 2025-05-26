package org.code;

import java.util.Scanner;

public class if03 {
    public static void main(String[] args) {
        // 创建Scanner对象，用于从控制台读取用户输入
        Scanner sc = new Scanner(System.in);

        // 提示用户输入微信支付分
        System.out.println("请输入您的微信支付分：");

        // 读取用户输入的整数作为微信支付分
        int MyWeChatCore = sc.nextInt();

        // 判断微信支付分的范围，并输出相应的信用评价
        if (MyWeChatCore >= 80 && MyWeChatCore <= 100) {
            // 支付分在80到100之间，表示信用优秀
            System.out.println("信用优秀！");
        } else if (MyWeChatCore >= 60 && MyWeChatCore < 80) {
            // 支付分在60到80之间，表示信用一般
            System.out.println("信用一般！");
        } else if (MyWeChatCore >= 0 && MyWeChatCore < 60) {
            // 支付分在0到60之间，表示信用不及格
            System.out.println("信用不及格");
        } else {
            // 支付分超出0-100范围，提示用户输入无效
            System.out.println("输入的支付分无效，请输入0-100之间的数值");
        }

        // 关闭Scanner对象，释放相关资源
        sc.close();


    }
}