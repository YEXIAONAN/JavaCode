package org.code.General;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 需求说明：
 * - 用户先输入一个字符串（例如：中文）
 * - 再输入一个整数（例如：111）
 * - 程序打印拼接结果（中文111）
 * - 随后分别打印原始字符串与原始整数的值与类型，确保类型未被改变
 *
 * 关键点：
 * - 使用 BufferedReader.readLine() 获取整行输入，避免 read() 只读单字符导致的类型/数值混乱
 * - 将第二次输入的整行字符串通过 Integer.parseInt() 转为 int 原始类型
 * - 注意：int 是原始类型，没有 getClass()；打印类型时需要直接写 "int"
 *
 * 潜在风险：
 * - 如果用户在第二次输入时输入了非整数字符串，会抛出 NumberFormatException
 * - 控制台编码若与源文件/终端不一致，中文显示可能出现乱码（Windows 下常见，需要确保控制台编码为 UTF-8）
 */
public class KeepOriginType {

    /**
     * 主程序入口。
     * 这里选择在方法签名上抛出 IOException，简化示例代码；生产环境建议显式 try-catch 并做可恢复处理。
     */
    public static void main(String[] args) throws IOException {
        // 使用 InputStreamReader 包装 System.in，再由 BufferedReader 提供按行读取能力
        // 优点：readLine() 能一次性读取直到换行符的整行文本
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        // 1) 提示并读取字符串
        System.out.println("请输入一个字符串：");
        // readLine() 返回不包含换行符的整行文本；可能返回空串（用户直接回车），但不会为 null（除非输入流已关闭）
        String str = bf.readLine();

        // 2) 提示并读取整数
        System.out.println("请输入一个整数：");
        // 再次按行读取，然后通过 Integer.parseInt 将十进制数字字符串转为 int 原始类型
        // 注意：如果用户输入非数字，会抛出 NumberFormatException（本示例不捕获，直接让程序异常退出）
        int num = Integer.parseInt(bf.readLine());

        // 3) 拼接展示
        // Java 中 String 与任意类型使用 + 连接时，会将右侧表达式转换为字符串再拼接
        // 这里不会改变原始变量的类型，仅仅构造了一个新的字符串实例
        String combined = str + num;
        System.out.println("拼接结果: " + combined); // 期望输出：中文111

        // 4) 再次输出原始变量，证明类型未变
        // 对象类型（如 String）可用 getClass().getSimpleName() 动态打印其运行时类名
        System.out.println("原始 String: " + str + "，类型：" + str.getClass().getSimpleName());

        // 原始类型（primitive）没有对象方法与运行时类，因此不能使用 getClass()
        // 这里直接以字面说明方式输出 "int"
        System.out.println("原始 int: " + num + "，类型：int");

        // 可选：读完可以关闭（此处略）。在短生命周期 CLI 程序里不关也问题不大；长生命周期/库代码建议使用 try-with-resources。
        bf.close();
    }
}
