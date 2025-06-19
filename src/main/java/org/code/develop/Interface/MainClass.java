package org.code.develop.Interface;

interface FirstInterface {
    // 接口方法
    public void myMethod();
}

interface SecondInterface {
    public void myOtherMethod();
}

class DemoClass implements FirstInterface,SecondInterface {
    public void myMethod() {
        System.out.println("Some text...");
    }

    public void myOtherMethod() {
        System.out.println("some other text...");
    }
}

class MainClass {
    public static void main(String[] args) {
        DemoClass myObj = new DemoClass();

        myObj.myMethod();
        myObj.myOtherMethod();
    }
}
