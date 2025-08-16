package org.code.general;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQLServerConnect {

    static final String MySQL_URL = "jdbc://192.168.101.251:6666/SDashboard?useSSL=false&allowPublicKeyRetrieval=true";
    static final String MySQL_USER = "root";
    static final String MySQL_PASSWORD = "BigData#123..";
    public static void main(String[] args) throws SQLException {

        try (Connection conn = DriverManager.getConnection(MySQL_URL,MySQL_USER,MySQL_PASSWORD);
             Statement stat = conn.createStatement();
        )
        {
            String sql = "show tables;";
            stat.execute(sql);
        }
        catch (SQLException e){
            e.printStackTrace();
        }

    }
}
