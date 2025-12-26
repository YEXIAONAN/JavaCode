package org.code.Develop.test;

public class MyScope {
    public static void main(String[] args) {
        // 此处的代码不能使用 x

        int x = 100;

        // 这里的代码可以使用 x
        System.out.println(x);
    }
}
