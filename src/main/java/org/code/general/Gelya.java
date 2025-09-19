package org.code.general;

import java.util.Date;
import java.util.Scanner;

public class Gelya {
    public static void main(String[] args) {
        final String TOKEN = "app_token_v1 general-arc";
        final String MODEL = "Test_Model_v1";

        Date dt = new Date();
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome using GelayModelServer");
        System.out.println("Now system time is : " + dt);
        System.out.println("Please enter you need chose number");
        System.out.println("1.print TOKEN");
        System.out.println("2.restart TOKEN");
        System.out.println("3.admin manage page");

        int user_chose_sum = sc.nextInt();

        switch (user_chose_sum){
            case 1:
                System.out.println("you need enter first_token");
                String user_input_first_token = sc.nextLine();

                if (user_input_first_token.equals(TOKEN)){
                    System.out.println("TOKEN is \"app_token_v1 general-arc\"");
                }else {
                    System.out.println("error!");
                }
            case 2:
                System.out.println("you need enter first_token");
                String user_input_first_token_restart = sc.nextLine();

                if (user_input_first_token_restart.equals(TOKEN)){
                    System.out.println("please enter your new TOKEN");
                    String user_new_token = sc.nextLine();


                }else {
                    System.out.println("error!");
                }





        }








    }
}