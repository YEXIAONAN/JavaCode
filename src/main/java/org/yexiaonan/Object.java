package org.yexiaonan;

public class Object implements ObjectClass {
    // 类（Class）
    public class Car {
    }

    // 对象（Object）
    Car myCar = new Car();

    // 继承（Inheritance）
    public class Dog extends Animal {

    }

    // 封装（Encapsulation）
    private String name;
    public String getName() {
        return name;
    }

    // 多态（Polymorphism）
        // 方法重载
    public int add (int a, int b){
        return a;
    }
        // 方法重写
        @Override
        public void makeSound() {
        System.out.println("meno");
    }

    // 抽象（Abstraction）
        // 抽象类
    public abstract class Shape {
        abstract void draw();
    }
        // 接口
    public interface Ani {
        void drive();
    }

    // 接口（Interface）
    public interface Drivable {
        void drive();
    }

    // 方法（Method）
    public void displayInfo (){
        System.out.println("Info");
    }

    // 方法重载（Method Overloading）
    public class Math {
        public int add (int a,  int b){
            return a + b;
        }

        public double add (double a, double b){
            return a + b;
        }
    }




}
