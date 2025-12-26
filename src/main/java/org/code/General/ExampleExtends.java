package org.code.General;

public class ExampleExtends {
    private String name;
    private int id;

    public ExampleExtends(String myName,int myid) {
        name = myName;
        id = myid;
    }

    public void eat(){
        System.out.println(name + "am eat food!");
    }

    public void sleep(){
        System.out.println(name + "am sleep");
    }

    public void introduction(){
        System.out.println("Hello Everybody! i am" + name + "MyID is" + id);
    }
}

