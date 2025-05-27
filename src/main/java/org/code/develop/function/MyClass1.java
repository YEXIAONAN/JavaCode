package org.code.develop.function;

/**
 * 这是一个演示Java类和构造函数用法的示例类。
 * 该类包含一个实例变量和一个带参数的构造函数，
 * 并在main方法中展示了如何创建对象和访问实例变量。
 */
public class MyClass1 {
    // 声明一个名为x的整型实例变量，用于存储对象的状态
    int x;

    /**
     * 构造函数：用于初始化MyClass1对象
     * @param y 用于初始化实例变量x的值
     */
    public MyClass1(int y) {
        // 将参数y的值赋给当前对象的实例变量x
        x = y;
    }

    /**
     * 程序入口点
     * @param args 命令行参数数组
     */
    public static void main(String[] args) {
        // 创建MyClass1类的一个实例（对象），并通过构造函数传递初始值5
        MyClass1 myObj = new MyClass1(5);

        // 访问对象的实例变量x并打印其值到控制台
        System.out.println(myObj.x); // 输出结果：5
    }
}