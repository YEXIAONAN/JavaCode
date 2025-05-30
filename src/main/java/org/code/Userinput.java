package org.code;

import java.util.Scanner;

public class Userinput {
    public static void main(String[] args) {
        // 导入Scanner
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入内容");
        String userinput =  sc.next();

        System.out.println("你输入了： " + userinput);
    }
}
