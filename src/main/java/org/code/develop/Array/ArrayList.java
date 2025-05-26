package org.code.develop.Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayList {
    public static void main(String[] args) {
        String[] mugay = {"Gay","My","Olay"};

        // 如果需要直接输出数组，则需使用Arrays.toString进行包装为String类型
        System.out.println(Arrays.toString(mugay));

        // 或者可以这样遍历数组，进行输出
        for (String arr : mugay){
            System.out.println(arr);
        }
    }
}
