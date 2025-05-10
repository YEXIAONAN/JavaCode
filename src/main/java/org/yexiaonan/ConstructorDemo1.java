package org.yexiaonan;

import java.util.Scanner;

public class ConstructorDemo1 {

    private final String Name;
    private final int Age;

    public ConstructorDemo1 (String name, int Age) {
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


    public int getAge() {
        return Age;
    }

    public String getName() {
        return Name;
    }
}
