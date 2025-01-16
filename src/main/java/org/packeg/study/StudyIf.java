package org.packeg.study;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;
import java.util.Scanner;

public class StudyIf {
    public static void main(String[] args) {
        // 简单的密码判断（融合密码）
        // 导入支持包
        Scanner sc = new Scanner(System.in);

        // 获取当前时间，将其Format
        SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
        Date date = new Date(System.currentTimeMillis());

        // 提示文字
        System.out.println("-------------欢迎来到小楠登录系统-------------");
        System.out.println("\t");
        System.out.println("当前时间 " + formatter.format(date));
        System.out.println("\t");
        System.out.println("请输入密码： ");

        // 将用户输入的数据存储至一个String类型的变量中
        String password = sc.next();

        // 定义默认密码
        String data = "yexiaonan";

        // 使用 equals 方法进行比较
        if (Objects.equals(password, data)){
            System.out.println("登录成功");
        }else {
            System.out.println("登录失败");
        }

        System.out.println("--------------------------------------------");

    }
}
