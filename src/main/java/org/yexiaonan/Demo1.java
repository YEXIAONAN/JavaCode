package org.yexiaonan;

public class Demo1 {
    public static void main(String[] args) {


    // 规则：将左边和右边进行相加，然后再把结果赋值给左边
    int a = 10;
    int b = 20;

    // 把a和b相加，然后把结果赋值给左边的变量a
    a += b;
    // 等同于 a= a + b;
        System.out.println(a);
        System.out.println(b);



        // 细节
        short s =  1;
        // 由于s本身变量记录的值为1，当1+1等于2的结果时，变量2重新赋值给s
        s += 1;
        // 等同于 s = s + 1;
        System.out.println(s);
    }
}
