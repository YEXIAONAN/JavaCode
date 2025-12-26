package org.code.General;

public class ArithmeticOperator {
    public static void main(String[] args) {
        // 学习 /，%，++
        // /使用
        System.out.println(10 / 4);
        System.out.println(10.0 /4);
        double d = 10/4;
        System.out.println(d);

        // %使用
        // 在%的本质，看一个公式 a % b = a - a / b * b
        System.out.println(10%3);
        System.out.println(-10%3); // -10 % 3 => -10 - (-10) / 3 * 3 = -10 + 9 = -1
        System.out.println(10%-3); // 10 % -3 => 10 - 10 / (-3) * (-3) = 10 - 9 = 1
        System.out.println(-10 % -3);

        // ++使用
        int i = 10;
        i++; // 自增 等价于  i = i + 1
        ++i;
        System.out.println(i);

        // ++表达式使用
        int j = 8;
        int k = j++;// 等价 k = j;j=j+1
//        int k = ++j;// 等价 j=j+1;k=j先自增，在赋值
        System.out.println(k+"-"+j);
    }
}
