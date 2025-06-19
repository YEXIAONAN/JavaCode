package org.code.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDeleteTable {

    static final String  MySQL_URL = "jdbc:mysql://172.16.7.100:3306/food?useSSL=false&allowPublicKeyRetrieval=true";
    static final String MySQL_USER = "root";
    static final String MySQL_PASSWORD = "123456";

    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(MySQL_URL,MySQL_USER,MySQL_PASSWORD);
             Statement stat = conn.createStatement();
        ){
            String sql = "drop table TEST_TABLE";
            stat.executeLargeUpdate(sql);
            System.out.println("Table 已删除");
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
