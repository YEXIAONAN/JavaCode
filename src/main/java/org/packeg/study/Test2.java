package org.packeg.study;

import java.util.Objects;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        try (// 导包
        Scanner sc = new Scanner(System.in)) {
            // 定义默认值
            String Password = "kk";

            // 接收用户输入数据
            String data = sc.next();

            if (Objects.equals(Password,data)){
                System.out.println("Yes!");
            }else {
                System.out.println("No!");
            }
        }
    }
}
