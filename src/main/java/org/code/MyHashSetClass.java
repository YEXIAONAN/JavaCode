package org.code;

import java.util.HashSet;

public class MyHashSetClass {
    public static void main(String[] args) {
        // 创建一个名为 numbers 的 HashSet 对象
        HashSet<Integer> numbers = new HashSet<Integer>();

        // 将值添加到集合
        numbers.add(4);
        numbers.add(7);
        numbers.add(8);

        // 显示 1 到 10 之间的数字在集合中
        for(int i = 1; i <= 10; i++) {
            if(numbers.contains(i)) {
                System.out.println(i + " was found in the set.");
            } else {
                System.out.println(i + " was not found in the set.");
            }
        }
    }
}
