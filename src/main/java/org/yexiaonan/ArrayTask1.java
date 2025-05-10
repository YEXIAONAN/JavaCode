package org.yexiaonan;

// import java.lang.reflect.Array;

public class ArrayTask1 {
    public static void main(String[] args) {
        // 定义数组
        int[] arr = {33,5,22,44,55};

        // 定义变量存储最大值
        int max = arr[0];

        // 拿着每一个元素跟max进行比较
        for(int i = 0;i < arr.length;i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }

        // 当循环结束max为数组最大值
        System.out.println(max);

        // 定义数组
        int[] minsum = {33,5,22,44,55};

        // 定义变量存储最大值
        int min = arr[0];

        // 拿着每一个元素跟min进行比较
        for(int i = 0;i < arr.length;i++){
            if (minsum[i] < min){
                min = arr[i];
            }
        }

        // 当循环结束min为数组小值
        System.out.println(min);
    }

}
