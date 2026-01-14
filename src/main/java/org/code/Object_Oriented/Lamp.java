package org.code.Object_Oriented;

public class Lamp {

    static class Main{
        public static void main(String[] args) {
        Lamp L1 = new Lamp();
        Lamp L2 = new Lamp();

        L1.turnOn();
        L2.turnOff();

        }
    }

    // 类

        // 实例变量
        boolean isOn;

        // 方法
        void turnOn() {
            isOn = true;
            System.out.println("Light?" + isOn);
        }

        // 方法
        void turnOff() {
            isOn = false;
            System.out.println("Off?" + isOn);

    }
}
