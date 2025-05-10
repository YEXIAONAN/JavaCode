package org.yexiaonan;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLTest {
  public static void main(String[] args) {
      String url = "jdbc:mysql://172.16.7.70:3306/sign_in_system?useSSL=false&serverTimezone=UTC";
      String user = "root";
      String password = "123456";

      try (Connection conn = DriverManager.getConnection(url, user, password)) {
        System.out.println("✅ 数据库连接成功！");
    } catch (SQLException e) {
        System.out.println("❌ 数据库连接失败：" + e.getMessage());
        e.printStackTrace();  // 打印堆栈跟踪信息
    }
    
  }
}
