package org.code.general;

import javax.management.Query;
import java.sql.*;

public class MySQLServerConnect {

    static final String MySQL_URL = "jdbc:mysql://192.168.101.251:6666/SDashboard?useSSL=false&allowPublicKeyRetrieval=true";
    static final String MySQL_USER = "root";
    static final String MySQL_PASSWORD = "BigData#123..";
    static final String QUERY = "show tables;";
    public static void main(String[] args) throws SQLException {

        try (Connection conn = DriverManager.getConnection(MySQL_URL,MySQL_USER,MySQL_PASSWORD);
             Statement stat = conn.createStatement();
        )
        {
//            String sql = "show tables;";
//            stat.execute(sql);

            ResultSet rs = stat.executeQuery(QUERY);
            while (rs.next()){

            }
        }
        catch (SQLException e){
            e.printStackTrace();
        }

    }
}
