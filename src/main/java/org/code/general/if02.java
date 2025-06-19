package org.code.general;

import java.util.Scanner;

public class if02 {
    public static void main(String[] args) {
        // 编写一个程序，可以输入人的年龄，如果该同志的年龄大于18，则输出“你已经18了，要为自己的行为负责，送入木棍监狱”,否则输出“你那么小就不要你了”
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入您的年龄：");
        int age = sc.nextInt();

        if (age >= 18){
            System.out.println("你已经18了，要为自己的行为负责，送入木棍监狱");
        }else {
            System.out.println("你那么小就不要你了");
        }
    }
}
