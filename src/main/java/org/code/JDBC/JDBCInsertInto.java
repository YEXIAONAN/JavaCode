package org.code.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCInsertInto {
    static final String  MySQL_URL = "jdbc:mysql://172.16.7.100:3306/food?useSSL=false&allowPublicKeyRetrieval=true";
    static final String MySQL_USER = "root";
    static final String MySQL_PASSWORD = "123456";

    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(MySQL_URL,MySQL_USER,MySQL_PASSWORD);
             Statement stat = conn.createStatement();
        ){
            String sql = "insert into employees values" +
                    "(NULL,'Bob Li', 32, 'DevOps Engineer', '2021-11-01')," +
                    "(NULL,'Cindy Wang', 25, 'QA Tester', '2023-03-10')," +
                    "(NULL,'David Chen', 40, 'Project Manager', '2020-01-20');";

            stat.executeLargeUpdate(sql);
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
