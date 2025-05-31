package org.code;

import java.time.LocalDate;

public class ShowLoaclDate {
    public static void main(String[] args) {
        LocalDate LD = LocalDate.now(); // 创建日期对象
        System.out.println("当前日期: " + LD);
    }
}
