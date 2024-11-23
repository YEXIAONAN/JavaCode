package org.yexiaonan;

public class JavaPublic {
    // 构建一个公共访问的无返回值的方法
    public static void TestVoid(){
        int a = 100;
    }

    public static class Task1 {
        int b = 10;
    }
    // main方法
    public static void main(String[] args) {
        Task1 task1 = new Task1();
        System.out.println(task1.b);
    }

}

