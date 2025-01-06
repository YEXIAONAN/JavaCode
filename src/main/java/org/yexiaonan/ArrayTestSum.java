package org.yexiaonan;

import java.util.Arrays;
import java.util.Random;

public class ArrayTestSum {
    public static void main(String[] args) {
        int[] num = new int[10];
        Random r = new Random();

        // 每进行一次循环，都会生成一个随机的数组
        for (int i = 0; i < num.length; i++){
            int sum = r.nextInt(100) + 1;
            num[i] = sum;
        }

        // 遍历数组进行输出
        for (int i = 0; i < num.length ; i++){
            System.out.println(num[i]);  // 输出每个元素
        }

        // 对数据进行求和
        int a = 0;
        for (int i = 0; i < num.length; i++) {
            a = a + num[i];
        }

        System.out.println("所有数据之和是"  );
        for (int i = 0; i < num.length; i++) {
            
        }
    }
}
