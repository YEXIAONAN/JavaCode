package org.review;

import java.util.Scanner;

public class ConstructorDemo1 {
    String Name = "木木老师";
    int Age = 19;

    public ConstructorDemo1 (String name,int Age) {
        this.Name = name;
        this.Age = Age;
        System.out.println();

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("input user name");
        String name = sc.next();

        System.out.println("input user age");
        int age = sc.nextInt();
    }


}
