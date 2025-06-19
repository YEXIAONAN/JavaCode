package org.code.develop.test;

public class MyClassTest1 {
  // Static 方法
  static void myStaticMethod() {
    System.out.println("Static methods can be called without creating objects");
  }

  // Public 方法
  public void myPublicMethod() {
    System.out.println("Public methods must be called by creating objects");
  }

  // Main 方法
  public static void main(String[] args) {
    myStaticMethod(); // 调用静态方法
    // myPublicMethod(); 这会编译一个错误

    MyClassTest1 myObj = new MyClassTest1(); // 创建一个 MyClass 的对象
    myObj.myPublicMethod(); // 调用对象的公共方法
  }

}
