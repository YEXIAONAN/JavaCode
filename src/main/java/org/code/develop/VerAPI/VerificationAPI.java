package org.code.develop.VerAPI;

import java.util.Scanner;

public class VerificationAPI {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);

        System.out.println("欢迎使用 VerificationAPI 验证程序");

        System.out.println("正在链接服务器......");
        Thread.sleep(3000); // 假装链接服务器，增加优化空间（bushi）

        System.out.println("链接服务器成功 VerificationAPI - v1");

        System.out.print("请输入您的用户名：");
        String userName = sc.next();

        System.out.print("请输入您的密钥：");
        String userToken = sc.next();

        System.out.print("请输入您的邮箱：");
        String userMail = sc.next();

        // 调用验证方法
        boolean result = User_Information.verify(userName, userToken);

        // 使用if进行判断，调用result方法
        if (result) {
            System.out.println("✅ 验证通过，欢迎 " + userName);
//            System.out.println("您的邮箱是：" + User_Information.verifyEmail(userMail));
        } else {
            System.out.println("❌ 验证失败，请检查用户名或密钥");
        }
    }

    // 内部类，用于保存合法的用户信息和验证逻辑
    private static class User_Information {
        private static final String A_User_name = "XiaoNan";
        private static final String A_User_token = "app-xxxxxxx";
        private static final String A_User_email = "admin@admin.com";

        // 将内部信息通过public访问控制符进行输出
        public static boolean verify(String name, String token) {
            return A_User_name.equals(name) && A_User_token.equals(token);
        }

        // 创建第二个public访问控制(测试email邮箱)



    }
}
