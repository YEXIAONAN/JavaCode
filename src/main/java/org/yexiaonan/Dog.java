package org.yexiaonan;


/*
实例-类的实例（对象）

 */
public class Dog {
    String name ="";
    int age = 0;

    public Dog(){};
    public Dog(String name,int age){
        this.name = name;
        this.age = age;

    }

    public void Print(){
        System.out.println("name: " + name + " age: " + age);
    }
}

/**
 *  子类的名字 extends 父类的名字
 *
 *   -- 继承属性（变量）
 *   -- 行为方法（方法）
 */

class Pug extends Dog{

}

class App1{
    public static void main(String[] args) {
        Pug pug = new Pug();
        pug.name = "木棍";
        pug.age = 12;
        pug.Print();
    }
}