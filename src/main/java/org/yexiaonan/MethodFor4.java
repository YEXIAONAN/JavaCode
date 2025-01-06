package org.yexiaonan;

public class MethodFor4 {
    public static void main(String[] args) {
        GetSum(10);
        GetSumT(10,20);
    }
    public static void GetSum(int number){
        System.out.println(number);
    }
    public static void GetSumT(int sum1,int sum2){
        int result = sum1 + sum2;
        System.out.println(result);
    }
}
