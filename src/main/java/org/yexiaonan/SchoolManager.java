package org.yexiaonan;

import java.util.Scanner;

public class SchoolManager {

    public static class Student {
        private String name;
        private int age;
        private int grade;
        // TODO: 添加构造方法、getter/setter等
    }

    public static class Teacher {
        private String name;
        private int age;
        private String subject;
        // TODO: 添加构造方法、getter/setter等
    }

    public static class SystemInfo {
        private static final String VERSION = "V1";

        @Override
        public String toString() {
            return "当前系统版本：" + VERSION;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 欢迎信息
        System.out.println("欢迎使用 SMSchool 管理系统");
        System.out.print("请输入您的用户名：");
        String username = sc.next();
        System.out.println("您好，" + username + "！");

        boolean running = true;
        while (running) {
            System.out.println("\n请选择您要使用的功能：");
            System.out.println(" 1. 查看当前用户信息");
            System.out.println(" 2. 查看系统当前版本");
            System.out.println(" 3. 查看当前运行状态");
            System.out.println(" 4. 切换当前系统语言");
            System.out.println(" 5. 退出当前学校系统");
            System.out.print("请输入选项（1-5）：");

            int choice;
            try {
                choice = sc.nextInt();
            } catch (Exception e) {
                System.out.println("输入无效。请输入数字 1-5。");
                sc.next();
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.println("当前用户信息：\n 用户名：" + username + "，角色：学生\n");
                    break;

                case 2:
                    SystemInfo info = new SystemInfo();
                    System.out.println(info);
                    break;

                case 3:
                    System.out.println("系统运行正常。");
                    break;

                case 4:
                    System.out.println("语言切换功能正在开发中。");
                    break;

                case 5:
                    System.out.println("退出系统，再见！");
                    running = false;
                    break;

                default:
                    System.out.println("无效选项。");
            }
        }

        sc.close();
    }
}
