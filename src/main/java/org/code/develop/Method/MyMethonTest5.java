package org.code.develop.Method;

public class MyMethonTest5 {
    static void CheckAge (int age) {

        // 如果年龄小于十八岁，则打印“拒绝”
        if (age < 18){
            System.out.println("拒绝");
        }else {
            System.out.println("你18碎了！");
        }
    }

    public static void main(String[] args) {
        // 调用方法
        CheckAge(20);
    }
}
