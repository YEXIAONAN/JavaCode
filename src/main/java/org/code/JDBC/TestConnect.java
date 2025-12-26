package org.code.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestConnect {


    public static void main(String[] args) {
        final String MYSQL_URL = "jdbc:mysql://172.16.65.200:6666/SDasboard";
        final String MySQL_USER = "root";
        final String MySQL_PASSWORD = "BigData#123..";

        try (
            Connection conn = DriverManager.getConnection(MYSQL_URL,MySQL_USER,MySQL_PASSWORD);
            Statement stat = conn.createStatement();
        ){
            String SQL = "show tables;";

            stat.executeLargeUpdate(SQL);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
