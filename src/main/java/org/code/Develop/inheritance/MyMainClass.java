package org.code.Develop.inheritance;

class Animal {
    public void animalSound() {
        System.out.println("The animal makes a sound");
    }
}

class Pig extends Animal {
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }
}

class Dog extends Animal {
    public void animalSound() {
        System.out.println("The dog says: bow wow");
    }
}

class MyMainClass {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();  // 创建一个 Animal 对象
        Animal myPig = new Pig();  // 创建 Pig 对象
        Animal myDog = new Dog();  // 创建一个 Dog 对象
        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();
    }
}
