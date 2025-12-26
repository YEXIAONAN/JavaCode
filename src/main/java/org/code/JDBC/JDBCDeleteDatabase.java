package org.code.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDeleteDatabase {
    private static final String  MySQL_URL = "jdbc:mysql://172.16.7.100:3306/food?useSSL=false&allowPublicKeyRetrieval=true";
    private static final String MySQL_USER = "root";
    private static final String MySQL_PASSWORD = "123456";

    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(MySQL_URL,MySQL_USER,MySQL_PASSWORD);
             Statement stat = conn.createStatement()
        ){
            String delete_sql = "DROP DATABASE TEST";
            stat.executeLargeUpdate(delete_sql);
            System.out.println("Database 删除完毕");
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
