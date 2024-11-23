package org.yexiaonan;

public class TestPublic {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.name);
    }
}

class Person{
    String name = "mugun";
    int age = 0;
}

