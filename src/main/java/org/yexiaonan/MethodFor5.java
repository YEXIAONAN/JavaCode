package org.yexiaonan;

/**
    * 计算三个整数的和。
    * 
    * @param sum1 第一个整数
    * @param sum2 第二个整数
    * @param sum3 第三个整数
    * @return 三个整数的和
    */
public class MethodFor5 {
    public static void main(String[] args) {

        System.out.println(ReturnValue(10,20,30));
    }

    public static int ReturnValue(int sum1,int sum2,int sum3){
        int result = sum1+sum2+sum3;
        return result;
    }
}
