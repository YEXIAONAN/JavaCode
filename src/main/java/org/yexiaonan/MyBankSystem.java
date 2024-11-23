package org.yexiaonan;

// 导入 Scanner 模仿用户存取钱的输出
import java.util.Scanner;
/**
 * 写出一个银行存取钱系统
 *  XiaoNanBankSystem:系统类
 *  BankGet:取钱类
 *  BankPut:存钱类
 *  BankUser:银行用户类
 */
public class MyBankSystem {
    private static int Mmoney = 1000000;
    public static void BankPut(int Mmoney){
        // new一个用户输入类
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您要存储的钱：");
        int UserPut = scanner.nextInt();
        System.out.println("您成功存入 " + UserPut + " 元");

    }
}

