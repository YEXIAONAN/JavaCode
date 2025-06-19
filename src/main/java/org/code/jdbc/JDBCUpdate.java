package org.code.jdbc;

import java.sql.*;

public class JDBCUpdate {
    static final String  MySQL_URL = "jdbc:mysql://172.16.7.100:3306/food?useSSL=false&allowPublicKeyRetrieval=true";
    static final String MySQL_USER = "root";
    static final String MySQL_PASSWORD = "123456";
    static final String QUERY = "select id,name,age,position,hire_date from employees";
    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(MySQL_URL,MySQL_USER,MySQL_PASSWORD);
             Statement stat = conn.createStatement())
        {
            String sql = "update employees " +
                    "set age = 30 where id = 1";
            stat.executeLargeUpdate(sql);

            ResultSet rs = stat.executeQuery(QUERY);

            while (rs.next()){
                System.out.println("id:" + rs.getInt("id"));
                System.out.println("name:" + rs.getString("name"));
                System.out.println("age:" + rs.getInt("age"));
            }
        }catch (SQLException e){
            e.printStackTrace();
        }

    }
}
