package org.code.General;

import java.util.Scanner;

public class TwoSum {

    public class Requestforpeace {
        public static int Return(int a,int b){
            return a + b;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a num1");
        int User_input_sum1 = sc.nextInt();

        System.out.println("Please enter a num2");
        int User_input_sum2 = sc.nextInt();

        int result = Requestforpeace.Return(User_input_sum1,User_input_sum2);

        System.out.println("your enter sum peace is " + result);
    }


}
