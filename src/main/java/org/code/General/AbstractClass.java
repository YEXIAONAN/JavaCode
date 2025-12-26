package org.code.General;

// 抽象类
abstract class Animal{
    // 抽象方法（没主体）
    public abstract void animalSound();

    // 常规方法
    public void sleep() {
        System.out.println("I am sleep~~~");
    }
}

// 子类，继承自（Animal）
class Pig extends Animal {
    public void animalSound(){
        // 这里提供 animalSound() 的主体
        System.out.println("I am Pig!");
    }
}

class AbstractClass {
    public static void main(String[] args) {
        Pig myPig = new Pig();
        myPig.animalSound();
        myPig.sleep();
    }
}
