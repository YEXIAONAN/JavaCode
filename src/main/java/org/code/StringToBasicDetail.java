package org.code;

public class StringToBasicDetail {
    public static void main(String[] args){
        // String——>转换基本类型
        String s5 = "123";

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
