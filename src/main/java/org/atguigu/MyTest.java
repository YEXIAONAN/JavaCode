package org.atguigu;

import java.util.Scanner;

public class MyTest {
    public static int ChangeToInt (String str){
        return Integer.parseInt(str);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.next();

        int sum = ChangeToInt(input);

        System.out.println(sum);
    }
}
