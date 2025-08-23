package org.code.general;

import java.util.Scanner;

public class NewText {
    public static class TextAdd {
        public static char addTome(char a, char b) {
            System.out.println("【小楠Tools】你调用了字符拼接方法");
            return (char) (a + b);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a char for 1");
        char input_1 = sc.next().charAt(0); // 从字符串取第一个字符

        System.out.println("Please enter a char for 2");
        char input_2 = sc.next().charAt(0);

        char result = TextAdd.addTome(input_1, input_2);
        System.out.println("结果是: " + result);
    }
}
