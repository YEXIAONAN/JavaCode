package org.code.AccessControllers;

public class newControllers {

}

// Static是什么？
// 标识：这个东西“属于类本身”，而不是属于某一个对象

// 不加 static （面向对象）
class User{
    String name;
}

// 这里的 name 属于某一个 User 对象。必须 new User() 才能访问

// 加上 static
class NUser {
    static int count;
}
// 现在 User 不属于任何一个User对象，属于 “User” 这个类，所有人共享一份。


// void 是什么？
// Void：这个方法干活，但是它不返回结果。

//void print() {
//    System.out.println("Hello");
//}

// 对比：

//int add(int a , int b) {
//    return a+b;
//}