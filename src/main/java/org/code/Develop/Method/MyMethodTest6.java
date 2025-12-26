package org.code.Develop.Method;

public class MyMethodTest6 {
    static void CheckAge(int age){
        // 如果年龄小于18岁。打印"you are so small!"
        // 大于18则输出"you are so big! we need you!!!"
        if (age < 18){
            System.out.println("you are so small!");
        }else {
            System.out.println("you are so big! we need you!!!");
        }
    }

    public static void main(String[] args) {
        CheckAge(20);
    }
}
