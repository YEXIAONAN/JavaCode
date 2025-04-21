package org.yexiaonan;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ReviewsJDBC {

    public static void main(String[] args) {
        // 数据库连接信息
        String url = "jdbc:mysql://172.16.7.100:3306/food"; // 请根据实际情况修改数据库URL
        String username = "root";
        String password = "123456";

        Connection connection = null;

        try {
            // 尝试连接到数据库
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("数据库连接成功！");
        } catch (SQLException e) {
            System.out.println("数据库连接失败！");
            e.printStackTrace();
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}