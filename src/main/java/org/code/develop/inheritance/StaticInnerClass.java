package org.code.develop.inheritance;

class MyOutClass {
    int x = 8;
    static class MyInnerClass {
        int y = 2;
    }
}


public class StaticInnerClass {
    public static void main(String[] args) {
        MyOutClass.MyInnerClass MyInner = new MyOutClass.MyInnerClass();

        System.out.println(MyInner.y);
    }
}
