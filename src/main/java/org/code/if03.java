package org.code;

import java.util.Scanner;

public class if03 {
    public static void main(String[] args) {
        // 定义微信支付分
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入您的微信支付分：");
        int MyWeChatCore = sc.nextInt();

        if (MyWeChatCore >= 80 && MyWeChatCore <= 100) {
            System.out.println("信用优秀！");
        } else if (MyWeChatCore >= 60 && MyWeChatCore < 80) {
            System.out.println("信用一般！");
        } else if (MyWeChatCore >= 0 && MyWeChatCore < 60) {
            System.out.println("信用不及格");
        } else {
            System.out.println("输入的支付分无效，请输入0-100之间的数值");
        }

        sc.close(); // 关闭Scanner资源
    }
}