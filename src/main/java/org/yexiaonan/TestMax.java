package org.yexiaonan;

public class TestMax {
    public static void main(String[] args) {
        int i = 5;
        int j = 2;
        int k = max(i,j);
        System.out.println(i + "和" + j + "比较，最大值是: " + k );

    }

    public static int max(int sum1,int sum2){
        int result;
        if (sum1 > sum2){
            result = sum1;
        }else {
            result = sum2;
        }
        return result;
    }
}
