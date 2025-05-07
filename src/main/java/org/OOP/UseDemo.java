package org.OOP;

public class UseDemo {
    public static void main(String[] args) {
        Demo1 d1 = new Demo1();

        d1.name = "chaomei";
        d1.age = 0;
        d1.sex = "女";

        d1.printInfo();

        Demo1 d2 = new Demo1();

        d2.name = "a0-tao";
        d2.age = 114514;
        d2.sex = "娘";

        d2.printInfo();
    }
}
