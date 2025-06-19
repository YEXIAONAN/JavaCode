package org.code.jdbc;

import java.sql.*;

public class JDBCQuery {

    // 定义数据库连接信息
    static final String MySQL_URL = "jdbc:mysql://172.16.7.100:3306/food?useSSL=false&allowPublicKeyRetrieval=true";
    static final String MySQL_USER = "root";
    static final String MySQL_PASSWORD = "123456";

    // 定义要执行的 SQL 查询语句
    static final String QUERY = "SELECT id, name, age, position, hire_date FROM employees";

    public static void main(String[] args) {
        // 使用 try-with-resources 自动关闭数据库连接、Statement 和 ResultSet
        try (
                // 建立数据库连接
                Connection conn = DriverManager.getConnection(MySQL_URL, MySQL_USER, MySQL_PASSWORD);
                // 创建 SQL 执行对象
                Statement stat = conn.createStatement();
                // 执行查询语句，返回结果集 ResultSet
                ResultSet rs = stat.executeQuery(QUERY);
        ) {
            // 迭代遍历结果集中的每一条记录
            while (rs.next()) {
                // 获取每列数据并输出
                System.out.println("ID: " + rs.getInt("id"));
                System.out.println("Name: " + rs.getString("name"));
                System.out.println("Age: " + rs.getInt("age"));
                System.out.println("Position: " + rs.getString("position"));
                System.out.println("Hire Date: " + rs.getDate("hire_date"));
                System.out.println("-----------------------------");
            }

        } catch (SQLException exception) {
            // 捕获并打印数据库操作中出现的异常
            exception.printStackTrace();
        }
    }
}
