package org.code.general;

import java.util.Objects;
import java.util.Scanner;

public class Reviews {

    public static final String My_Key = "App-TEST0001";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please Enter your key");
        String user_input_key = sc.next();

        int sum = 0;
        if (Objects.equals(user_input_key, My_Key)) {
//            System.out.println("欢迎！");
            int a = 0;
            sum = a + 1;

        } else {
//            System.out.println("sb！");
            int a = 0;
            sum = a + 2;
        }

        switch (sum) {
            case 1:
                System.out.println("欢迎使用 XAPI 服务");
                break;
            case 2:
                System.out.println("密钥请求错误！");
                break;
            default:
                System.out.println("请求错误！");
        }


    }
}
