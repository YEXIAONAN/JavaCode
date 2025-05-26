package org.code;

public class BreakIntroduce {
    public static void main(String[] args) {
        // 初始化循环变量i为0，循环条件是i小于10，每次循环后i自增1
        for (int i = 0; i < 10; i++) {
            // 当i等于4时
            if (i == 4) {
                // 跳出当前for循环
                break;
            }
            // 输出变量i的值
            System.out.println(i);
        }
    }
}