package org.yexiaonan;

import java.util.Scanner;

public class SystemInput {
    Scanner input = new Scanner(System.in);
    
    public String getString() {
        return input.next();
    }

    public static void main(String[] args) {
        SystemInput systemInput = new SystemInput();
        System.out.println("请输入一个字符串：");
        String str = systemInput.getString();
        System.out.println("你输入的字符串是：" + str);
    }

}
