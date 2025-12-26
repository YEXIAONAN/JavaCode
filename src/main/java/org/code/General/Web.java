package org.code.General;

import java.util.Date;
import java.util.Scanner;

public class Web {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Date dt = new Date();

        System.out.println("Welcome using xiaonan web login system");
        System.out.println("now time: " + dt);

        // --------------

        System.out.println("-------LoginSystem-------");
        System.out.println("1.");

        int User_chose = sc.nextInt();


        sc.close();
    }
}
