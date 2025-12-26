package org.code.Review;

import java.util.Scanner;

public class K {
    // Main
    public static void main(String[] args) {
        Person p = new Person();
        p.PersonInfo("Karey",19,1000000);

    }

    public static class Person {

        // 无参版本
        public void PersonInfo() {
            System.out.println("姓名：无名者，年龄：0，资产：1000");
        }

        // 重载 1：带姓名
        public void PersonInfo(String name) {
            System.out.println("姓名：" + name + "，年龄：0，资产：1000");
        }

        // 重载 2：带姓名和年龄
        public void PersonInfo(String name, int age) {
            System.out.println("姓名：" + name + "，年龄：" + age + "，资产：1000");
        }

        // 重载 3：全参数
        public void PersonInfo(String name, int age, int money) {
            System.out.println(
                    "姓名：" + name +
                            "，年龄：" + age +
                            "，资产：" + money
            );
        }

        public void PersonInfoHelp(){
            System.out.println("Parameter：Name(String),Age(int),Money(int)\n you need passed in the Parameter");
        }
    }


    private static void Info() {
        final String Name = "JavaCode";
        System.out.println(Name);
    }

    public static int Sum(int a, int b){
        return a + b;
    }
}


