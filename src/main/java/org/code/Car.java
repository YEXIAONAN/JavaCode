package org.code;

// 创建Car类
public class Car {
    // 创建一个 fullThrottle() 方法
    public void fullThrottle() {
        System.out.println("这辆车正在尽力以最快的速度行驶！");
    }

    // 创建speed() 方法，并添加一个参数
    public void speed(int maxSpeed) {
        System.out.println("最大速度为： " + maxSpeed);
    }

    // 在Main中调用上方的方法
    public static void main(String[] args) {
        Car myCay = new Car(); // 创建对象
        myCay.fullThrottle(); // 调用方法
        myCay.speed(120); // 调用speed方法，传入参数
    }
}
