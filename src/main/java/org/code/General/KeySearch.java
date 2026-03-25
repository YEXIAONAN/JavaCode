package org.code.General;

import java.util.Scanner;

public class KeySearch {
    public static void main(String[] args) {
        // 通过最简单的index0f()方法返回关键字

        Scanner sc = new Scanner(System.in);

        System.out.println("请输入“Key”在文字中任意位置");
        String userInput = sc.next();

        System.out.println(userInput.indexOf("Key"));



    }
}
