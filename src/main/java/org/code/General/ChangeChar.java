package org.code.General;

public class ChangeChar {
    // 演示转义字符的使用
    public static void main(String[] args) {
//        1）\t：一个制表位，实现对齐功能
        System.out.println("南宁\t防城港\t 上海");
//        2）\n：换行符
        System.out.println("1\n2\n3\n4");
//        3）\\：一个\
        System.out.println("C:\\输出斜杠");
//        4）\"：一个"
        System.out.println("\"输出一个\"");
//        5）\'：一个'
        System.out.println("\'同上，输出'");
//        6）\r：一个回车 System.out.println("HelloWorld\r南宁")
        System.out.println("防城港\r南宁");
    }
}
