package org.yexiaonan;

public class DutyRoster {

    public static void main(String[] args) {
        // 今天的值日生信息
        String todaysDutyStudent = "叶小楠";
        String nextDutyStudent = "黄显套";
        long timestamp = System.currentTimeMillis(); // 获取当前时间戳

        // 格式化日期和时间
        String formattedDate = new java.text.SimpleDateFormat("yyyy年MM月dd日").format(new java.util.Date(timestamp));
        String formattedTime = new java.text.SimpleDateFormat("HH时mm分ss秒").format(new java.util.Date(timestamp));
        long milliseconds = timestamp % 1000; // 获取毫秒部分

        // 显示值日生信息
        System.out.println("### 今天的值日生");
        System.out.println(todaysDutyStudent);
        System.out.println("下一个值日生: " + nextDutyStudent);
        System.out.println(formattedDate + " " + formattedTime + " " + milliseconds + "毫秒");
    }
}