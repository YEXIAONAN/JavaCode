package org.code.develop.Method;


class Person {
    private String name;
    private int age;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
public class ClassMain {
    public static void main(String[] args) {
        Person p = new Person();

        p.setAge(18);
        System.out.println(p.getAge());
    }
}
