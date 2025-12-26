package org.code.Develop.function;

/**
 * MultiParameterFunction 类用于演示如何通过构造函数传递多个参数
 * 并将这些参数赋值给类的成员变量，以实现对象属性的初始化。
 */
public class MultiParameterFunction {

    // 成员变量：记录年份（可以理解为出生年份或其他年份信息）
    int PersonYear;

    // 成员变量：记录名字
    String PersonName;

    /**
     * 构造函数：
     * 在创建对象时被自动调用，用于初始化对象的成员变量。
     * 构造函数名称必须与类名一致。
     *
     * @param Year  初始化年份的参数，赋值给成员变量 PersonYear
     * @param Name  初始化姓名的参数，赋值给成员变量 PersonName
     */
    public MultiParameterFunction(int Year, String Name) {
        // 将传入的参数 Year 赋值给成员变量 PersonYear
        PersonYear = Year;

        // 将传入的参数 Name 赋值给成员变量 PersonName
        PersonName = Name;
    }

    /**
     * 主方法（程序入口）：
     * Java 程序从 main 方法开始执行。
     *
     * @param args  命令行参数（此示例未使用）
     */
    public static void main(String[] args) {
        // 使用构造函数创建 MultiParameterFunction 类的实例
        // 并传入两个参数：年份 2007 和姓名 "MuGay"
        MultiParameterFunction MPF = new MultiParameterFunction(2007, "MuGay");

        // 打印对象的成员变量，输出格式为：2007 MuGay
        System.out.println(MPF.PersonYear + " " + MPF.PersonName);
    }
}
