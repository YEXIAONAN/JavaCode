package org.code.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * JDBCExample 类用于演示如何使用 JDBC 创建 MySQL 数据库。
 */
public class JDBCConnectionExample {

    // JDBC 连接的 URL，包含数据库服务器地址、端口和连接参数
    // useSSL=false 表示禁用 SSL 连接
    // allowPublicKeyRetrieval=true 允许在非 SSL 模式下从服务器获取公钥（MySQL 8+ 必需）
    static final String MySQL_URL = "jdbc:mysql://172.16.7.100:3306/?useSSL=false&allowPublicKeyRetrieval=true";

    // 数据库用户名
    static final String MySQL_USER = "root";

    // 数据库密码（仅用于测试环境，生产环境应使用加密方式或配置文件管理）
    static final String MySQL_PASSWORD = "123456";

    /**
     * 程序主入口，执行数据库连接并创建名为 TEST 的数据库
     */
    public static void main(String[] args) {
        // 使用 try-with-resources 语法自动管理资源关闭（JDK 7+ 推荐）
        try (
                // 获取数据库连接对象
                Connection conn = DriverManager.getConnection(MySQL_URL, MySQL_USER, MySQL_PASSWORD);
                // 创建用于执行 SQL 语句的 Statement 对象
                Statement stmt = conn.createStatement();
        ) {
            // 定义要执行的 SQL 语句：创建名为 TEST 的数据库
            String sql = "CREATE DATABASE TEST";

            // 执行 SQL 语句，executeLargeUpdate 可用于返回受影响行数（适用于 DDL/DML）
            stmt.executeLargeUpdate(sql);

            // 控制台输出成功信息
            System.out.println("数据库创建完毕");

        } catch (SQLException e) {
            // 捕获并打印 SQL 异常，便于调试和日志记录
            e.printStackTrace();

        }
    }
}
