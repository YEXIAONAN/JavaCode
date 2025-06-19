package org.code.general;

import java.time.LocalTime;

public class ShowLocalTime {
    public static void main(String[] args) {
        LocalTime NowTime = LocalTime.now();  // 创建获取当前时间的对象
        System.out.println("当前时间： " + NowTime);
    }
}
