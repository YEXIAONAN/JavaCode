# Java - JDBC 

JDBC（Java Database Connectivity）是 Java 提供的标准 API，旨在实现 Java 应用程序与多种关系型数据库之间的连接与交互。

## JDBC示例

#### 创建JDBC程序
构建JDBC程序涉及以下六个步骤

- Import the packages − 要求您包含包含数据库编程所需的 JDBC 类的包。 大多数情况下，使用 import java.sql.* 就足够了。

- Open a connection − 需要使用 DriverManager.getConnection() 方法创建一个 Connection 对象，该对象表示与数据库的物理连接。

- Execute a query − 需要使用 Statement 类型的对象来构建 SQL 语句并将其提交到数据库。

- Extract data from result set − 要求您使用适当的 ResultSet.getXXX() 方法从结果集中检索数据。

- Clean up the environment − 需要显式关闭所有数据库资源而不是依赖 JVM 的垃圾收集。


#### 示例代码
将来需要创建自己的JDBC程序时，可以使用这个示例来当作**模板**

```java
package org.code.jdbc;

import java.sql.*;

public class FirstExample {
    static final String DB_URL = "jdbc:mysql://localhost/TUTORIALSPOINT";
    static final String USER = "guest";
    static final String PASS = "guest123";
    static final String QUERY = "SELECT id, first, last, age FROM Employees";

    public static void main(String[] args) {
        // Open a connection
        try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(QUERY);) {
            // Extract data from result set
            while (rs.next()) {
                // Retrieve by column name
                System.out.print("ID: " + rs.getInt("id"));
                System.out.print(", Age: " + rs.getInt("age"));
                System.out.print(", First: " + rs.getString("first"));
                System.out.println(", Last: " + rs.getString("last"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
```

