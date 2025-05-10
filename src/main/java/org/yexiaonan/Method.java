package org.yexiaonan;

// 构建用到的方法

import java.util.Scanner;

public class Method {
    public static void main(String[] args) {
        System.out.println("欢迎使用主方法！");

        // 测试能否访问 Test 类
        Test T = new Test();
        System.out.println(T.Name);

        // 测试方法 Test 的数相加
        int sue_for_peace = T.Sum1 + T.Sum2;
        System.out.println(sue_for_peace);

        Scanner sc = new Scanner(System.in);

        System.out.println("输入名字：");
        String NameInput  = sc.next();


    }

    public static class Test {
        String Name = "我是一个测试的方法";
        int Sum1 = 1;
        int Sum2 = 0;
    }


}
