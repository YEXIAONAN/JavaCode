package org.code.General;

public class StringToBasic {
    public static void main(String[] args){
        // 基本数据类型 ——> String
        int n1 = 100;
        float f1= 100F;
        double d1 = 5.5;
        boolean b1 = false;


        String s1 = n1 + "";
        String s2 = f1 + "";
        String s3 = d1 + "";
        String s4 = b1 + "";

        System.out.println(s1+s2+s3+s4);

        // String——>转换基本类型
        String s5= "123";

        // 一学就会，使用ParseXX转换
        int sum = Integer.parseInt(s5);
        float sum2 = Float.parseFloat(s5);
        double sum3 = Double.parseDouble(s5);
        long sum4 = Long.parseLong(s5);
        byte sum5 =  Byte.parseByte(s5);
        boolean sum6 = Boolean.parseBoolean("true");

        System.out.println(sum6);


    }
}
