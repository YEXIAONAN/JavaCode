package org.code;

public class ForceConvert {
    public static void main(String[] args) {
        int i = (int)1.9;
        System.out.println(i);

        int j = 100;
        byte b1 = (byte)j;
        System.out.println(b1);

        int sum2 = 2000;
        byte sum3 = (byte)sum2;
        System.out.println(sum3);
    }
}
