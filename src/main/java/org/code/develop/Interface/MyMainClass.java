package org.code.develop.Interface;

interface Animal{
    public void animalSound();
    public void sleep();
}

// Pig “实现” Animal 接口
class Pig implements Animal {
    public void animalSound(){
        // 这里提供 animalSound() 主体
        System.out.println("I am Pig");
    }
    public void sleep() {
        System.out.println("Zzz...");
    }
}


// Main方法入口
class MyMainClass {
    public static void main(String[] args) {
        // 创建Pig对象
        Pig myPig = new Pig();

        myPig.animalSound();
        myPig.sleep();
    }
}
