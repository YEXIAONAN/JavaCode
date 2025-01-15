package org.packeg.study;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;
import java.util.Scanner;

public class StudyIf {
    public static void main(String[] args) {
        // 简单的密码判断（融合密码）
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
        Date date = new Date(System.currentTimeMillis());


        System.out.println("-------------欢迎来到小楠登录系统-------------");
        System.out.println("\t");
        System.out.println("当前时间 " + formatter.format(date));
        System.out.println("\t");
        System.out.println("请输入密码： ");
        String password = sc.next();
        sc.toString();

        String data = "yexiaonan";

        if (Objects.equals(password, data)){
            System.out.println("登录成功");
        }else {
            System.out.println("登录失败");
        }

        System.out.println("--------------------------------------------");

    }
}
