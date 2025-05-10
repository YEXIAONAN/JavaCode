package org.yexiaonan;

public class StringTest {

    /**
     * 将字符串转换为整数
     *
     * @param str 输入的字符串，应为有效的数字字符串
     * @return 转换后的整数值
     */
    public static int convertStringToInt(String str) {
        // 使用 Integer.parseInt 方法将字符串转换为整数
        return Integer.parseInt(str);
    }

    public static void main(String[] args) {
        // 定义一个字符串变量，值为 "123"
        String str1 = "123";

        // 调用 convertStringToInt 方法将字符串转换为整数
        int num1 = convertStringToInt(str1);

        // 打印转换后的整数值
        System.out.println("Converted integer: " + num1);

        // 将整数 num1 转换为字符串 str2
        String str2 = num1 + "";
    }
}