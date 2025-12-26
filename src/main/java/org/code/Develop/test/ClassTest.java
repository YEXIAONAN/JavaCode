package org.code.Develop.test;

public class ClassTest {
    // static静态方法
    static void STATICMETHOD(){
        System.out.println("我是静态访问方法");
    }

    public void PUBLICMETHOD(){
        System.out.println("我是公共访问方法");
    }

    // public公共方法
    public static void main(String[] args) {
        STATICMETHOD(); // 调用静态方法
        // PUBLICMETHOD(); 这会编译一个错误

        ClassTest PUBLICS = new ClassTest(); // 创建一个 PUBLICMETHOD 的对象
        PUBLICS.PUBLICMETHOD();
    }
}
