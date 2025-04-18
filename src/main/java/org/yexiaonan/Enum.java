package org.yexiaonan;

public class Enum {
    public static void main(String[] args) {
        // 创建一个 Color 枚举类型的实例，值为 RED
        Color c1 = Color.RED;
        // 输出枚举实例的值到控制台
        System.out.println(c1);
    }

    // 定义一个名为 Color 的枚举类型，包含三种颜色：RED, GREEN, BLUE
    enum Color {
        RED, GREEN, BLUE
    }
}