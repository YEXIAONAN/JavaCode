package org.code.develop;

import java.util.Scanner;

public class TestClassForTrain {
    public static void main(String[] args) {

        final String TOKEN = "XiaoNan";

        // 创建一个Scanner获取用户的输入值
        Scanner sc = new Scanner(System.in);

        // tell user enter string
        System.out.println("---- TOKEN VIR ------");
        System.out.println("1.Hello World");
        System.out.println("2.output TOKEN");
        System.out.println("3.Exit");

        // save user enter int
        int User_Chose = sc.nextInt();

        //
        switch (User_Chose){
            case 1:
                System.out.println("Hello World!");
            case 2:
                System.out.println("Okay this is :" + TOKEN);
            case 3:
                System.out.println("ByeBye");
                break;
        }





        

    }
}