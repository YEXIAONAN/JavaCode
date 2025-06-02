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

## JDBC - 数据库连接

安装完毕驱动程序之后，就可以使用 JDBC 建立驱动链接
建立JDBC很简单，这是简单的四个步骤

- Import JDBC Packages − 将 import 语句添加到您的 Java 程序中以在您的 Java 代码中导入所需的类。

= Register JDBC Driver − 此步骤使 JVM 将所需的驱动程序实现加载到内存中，以便它可以满足您的 JDBC 请求。

= Database URL Formulation − 这是为了创建一个格式正确的地址，该地址指向您希望连接的数据库。

= Create Connection Object − 最后，编写对DriverManager 对象的getConnection( ) 方法的调用以建立实际的数据库连接。

#### 导入JDBC包

Import 语句告诉 Java 编译器在哪里可以找到您在代码中引用的类，并放置在源代码的最开头。

要使用允许您在 SQL 表中选择、插入、更新和删除数据的标准 JDBC 包，请将以下 imports 添加到源代码中 −

```java
import java.sql.* ;  // for standard JDBC programs
import java.math.* ; // for BigDecimal and BigInteger support
```

#### 注册 JDBC 驱动

在使用之前，必须在程序中注册驱动程序。 注册驱动程序是将Oracle驱动程序的类文件加载到内存中的过程，因此它可以作为JDBC接口的实现。

只需在您的程序中进行一次注册。 可以通过以下两种方式之一注册驱动程序。

#### 方法一 - Class.forName()
注册驱动程序最常用的方法是使用 Java 的 Class.forName() 方法，将驱动程序的类文件动态加载到内存中，内存会自动注册它。 这种方法更可取，因为它允许您使驱动程序注册可配置和可移植。

以下示例使用 Class.forName( ) 注册 Oracle 驱动程序 

```java
try {
   Class.forName("oracle.jdbc.driver.OracleDriver");
}
catch(ClassNotFoundException ex) {
   System.out.println("Error: unable to load driver class!");
   System.exit(1);
}
```

可以使用 getInstance() 方法来解决不兼容的 JVM，但是必须为两个额外的异常编写代码，如下所示 −

```java
try {
   Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
}
catch(ClassNotFoundException ex) {
   System.out.println("Error: unable to load driver class!");
   System.exit(1);
catch(IllegalAccessException ex) {
   System.out.println("Error: access problem while loading!");
   System.exit(2);
catch(InstantiationException ex) {
   System.out.println("Error: unable to instantiate driver!");
   System.exit(3);
}
```