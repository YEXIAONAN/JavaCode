package org.code.develop.Method;

/**
 * 这是一个用于演示方法定义和调用的示例类。
 * 该类包含一个静态方法t2，用于打印人员的姓名和年龄信息，
 * 并在main方法中展示了如何调用该方法。
 */
public class MyMethodTest1 {
    /**
     * 静态方法t2用于打印人员的姓名和年龄信息。
     * 该方法不返回任何值，直接将信息输出到控制台。
     *
     * @param name 要打印的人员姓名，字符串类型
     * @param age  要打印的人员年龄，整数类型
     *
     * @示例
     * t2("Alice", 25); // 控制台输出：姓名：Alice年龄：25
     *
     * @注意
     * 1. 该方法不会对输入的姓名和年龄进行有效性检查
     * 2. 年龄参数应为合理的整数值，否则输出可能不符合预期
     * 3. 输出格式中姓名和年龄之间没有分隔符，调用时需注意
     */
    static void t2 (String name, int age) {
        System.out.println("姓名：" + name + "年龄：" + age);
    }

    /**
     * 程序的主入口点。
     * 创建并初始化对象，调用t2方法展示其功能。
     *
     * @param args 命令行参数，在本程序中未使用
     */
    public static void main(String[] args) {
        // 调用t2方法，传入姓名"MuMu"和年龄18
        t2("MuMu", 18);
    }
}