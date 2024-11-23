package org.yexiaonan;

public class Polymorphism {
    public static void main(String[] args) {
        SiberianHusky siberianHusky = new SiberianHusky();
        SiberianHusky.Sleep();
    }

    public void Sleep(){
        System.out.println("打呼噜sj");


    }
}

class SiberianHusky extends  Dog{
    public void GetAge(){
        System.out.println("SiberianHusky：" + age);
    }
    public static void Sleep(){
        System.out.println("想睡觉就睡觉是木棍");

    }

}