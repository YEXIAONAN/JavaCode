package org.yexiaonan;


public class ArrayRecover {
    public static void main(String[] args) {
        int[] key = new int[]{11,22,33,44,55};

        // 循环遍历数组
        for (int i = 0 ; i < 5 ; i++){
            System.out.println(key[i]);
        }

        // 使用length获取数组中的最后一个数
        System.out.println(key.length);

        for (int i = 0 ; i < key.length; i++){
            System.out.println(key[i]);
        }
    }
}
