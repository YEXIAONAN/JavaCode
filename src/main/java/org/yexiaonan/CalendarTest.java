package org.yexiaonan;

import java.util.Calendar;

public class CalendarTest {
    public static void main(String[] args) {
        Calendar c1 = Calendar.getInstance();

        // 获得年份
        int year = c1.get(Calendar.YEAR);
        System.out.println(year);

        // 获得月份
        int month = c1.get(Calendar.MONTH) +1;
        System.out.println(month);

        // 获得日期
        int hour = c1.get(Calendar.DATE);
        System.out.println(hour);
    }
}
