package org.code.develop.function;

public class MyClass {
    int x; // 创建类属性

    // 为MyClass类创建一个类构造函数
    public MyClass(){
        // 设置类属性x初始值为5
        x = 5;
    }

    public static void main(String[] args) {
        MyClass myObj = new MyClass(); //创建一个 MyClass 类的对象（这将调用构造函数）
        System.out.println(myObj.x); // 打印x的值
    }


}
