package org.yexiaonan;

public class Puppy {
    public Puppy(){

    }

    public Puppy(String name){
        // 这个构造器有一个参数：name
        System.out.println("小狗的名字是 : 下面烂了" + name );
    }

    public static void main(String[] args) {
        Puppy myPuppy = new Puppy("Mugun");
    }

}
