package org.code.general;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * 演示Java 8+中LocalDateTime类的日期时间格式化功能
 */
public class FormatDateTime {
    public static void main(String[] args) {
        // 1. 创建当前系统时间的LocalDateTime对象
        // LocalDateTime是Java 8引入的不可变类，用于表示不含时区的日期时间
        LocalDateTime currentDateTime = LocalDateTime.now();

        // 2. 打印未格式化的日期时间（默认格式：ISO-8601）
        System.out.println("未格式化 ： " + currentDateTime);

        // 3. 定义自定义日期时间格式
        // 使用DateTimeFormatter模式：
        // dd - 两位日(01-31)
        // MM - 两位月(01-12)
        // yyyy - 四位年
        // HH - 24小时制小时(00-23)
        // mm - 分钟(00-59)
        // ss - 秒(00-59)
        DateTimeFormatter customFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        // 4. 执行格式化并打印结果
        // format()方法将LocalDateTime按照指定格式转换为字符串
        String formattedDateTime = currentDateTime.format(customFormatter);
        System.out.println("格式化 ： " + formattedDateTime);
    }
}