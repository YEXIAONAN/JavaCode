package org.yexiaonan;

import java.util.Scanner;

public class ShopPay {
    public static void main(String[] args) {
        /**
         * 需求：
         * 假设，用户在超市购买商品总价为：600元
         * 键盘录入一个整数表示用户实际支付的钱。
         * 如果付款大于等于600，表示付款成功，否则表示失败。
         */
        Scanner scanner = new Scanner(System.in);
        int ShopMoney = 600;
        System.out.println("请支付：");
        int UserInputMoney = scanner.nextInt();

        if (UserInputMoney >= 600){
            System.out.println("购买成功！");
        }else {
            System.out.println("购买失败，余额不足！");
        }
    }
}
