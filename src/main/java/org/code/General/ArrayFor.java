package org.code.General;

public class ArrayFor {
    public static void main(String[] args) {
        // 声明一个名为cars的字符串数组，并进行初始化，数组包含4个字符串元素
        String[] cars = {"Gay", "MuGay", "MuG", "MuMu"};
        // 使用for循环遍历cars数组
        for (int i = 0; i < cars.length; i++) {
            // 在控制台打印数组cars中索引为i的元素
            System.out.println(cars[i]);
        }
    }
}