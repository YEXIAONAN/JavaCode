package org.yexiaonan;

// 导入 Scanner 包
import java.util.Scanner;

public class ScannerPack {
    public static void main(String[] args) {
        // 为Scanner构建一个新对象
        Scanner scanner = new Scanner(System.in);

        // 编写一个int类型的变量用于接收从键盘获取的数字
        int age = scanner.nextInt();

        // 对获取到的数据进行输出
        System.out.println(age);

    }
}
