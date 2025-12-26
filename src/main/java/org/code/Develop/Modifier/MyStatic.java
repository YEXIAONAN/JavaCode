package org.code.Develop.Modifier;

public class MyStatic {
  // 静态方法
  static void myStaticMethod() {
    System.out.println("Static methods can be called without creating objects");
  }

  // 公共方法
  public void myPublicMethod() {
    System.out.println("Public methods must be called by creating objects");
  }

  // Main方法
  public static void main(String[] args) {
    // 调用静态方法
    myStaticMethod();
    
    // 创建一个对象
    MyStatic MS = new MyStatic();
    MS.myPublicMethod();
  }
}
