package org.yexiaonan;

public class CarBus {
    public static void main(String[] args) {
        // 车上没有乘客，默认为0
        int car0 = 0;

        // 第一站：上去一位乘客
        int car1 = car0 + 1;
        // 第二站：上去两位乘客，下来一位乘客
        int car2 = car1 + 2 - 1;
        // 第三站：上去两位乘客，下来一位乘客
        int car3 = car2 + 2 - 1;
        // 第四站：下来一位乘客
        int car4 = car3 - 1;
        // 第五战：上去一位乘客
        int car5 = car4 + 1;
        // 到终点站，车上一共几位乘客
        System.out.println("终点站到了车上还有:" + car5 + "位乘客");
    }



}
