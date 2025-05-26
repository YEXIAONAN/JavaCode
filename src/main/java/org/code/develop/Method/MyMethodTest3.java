package org.code.develop.Method;

// 这是一个用于演示自定义方法定义与调用的类
public class MyMethodTest3 {
    // 定义一个静态方法myMethon，接收一个int类型的参数x
    // 该方法的功能是对传入的参数x进行简单运算，返回5加上x的结果
    static int myMethon(int x) {
        return 5 + x;
    }

    public static void main(String[] args) {
        // 调用myMethon方法，并传入参数3
        // 将方法调用的返回值作为参数传递给System.out.println方法，用于在控制台打印输出
        System.out.println(myMethon(3));
    }
}