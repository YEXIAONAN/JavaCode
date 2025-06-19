package org.code.develop.Modifier;

// Code from filename: Person.java
// 抽象类
abstract class Person {
  public String fname = "John";
  public int age = 24;
  public abstract void study(); // 抽象方法
}

// 子类（从 Person 继承）
class Student extends Person {
  public int graduationYear = 2018;
  public void study() { // 此处提供了抽象方法的主体
    System.out.println("Studying all day long");
  }
}
// End code from filename: Person.java

// Code from filename: MyClass.java
class MyClass {
  public static void main(String[] args) {
    // 创建 Student 类的对象（从 Person 继承属性和方法）
    Student myObj = new Student();

    System.out.println("Name: " + myObj.fname);
    System.out.println("Age: " + myObj.age);
    System.out.println("Graduation Year: " + myObj.graduationYear);
    myObj.study(); // 调用抽象方法
  }
}