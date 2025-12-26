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
package org.code.JDBC;

import java.sql.*;

public class FirstExample {
    static final String DB_URL = "jdbc:mysql://localhost/TUTORIALSPOINT";
    static final String USER = "guest";
    static final String PASS = "guest123";
    static final String QUERY = "SELECT id, first, last, age FROM Employees";

    public static void main(String[] args) {
        // Open a connection
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
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

#### 方法二 - DriverManager.registerDriver()
第二种注册驱动程序的方法是使用静态 DriverManager.registerDriver() 方法。

如果使用的是不兼容 JDK 的 JVM，例如 Microsoft 提供的 JVM，您应该使用 registerDriver() 方法。

以下示例使用 registerDriver() 注册 Oracle 驱动程序 

```java
try {
   Driver myDriver = new oracle.jdbc.driver.OracleDriver();
   DriverManager.registerDriver( myDriver );
}
catch(ClassNotFoundException ex) {
   System.out.println("Error: unable to load driver class!");
   System.exit(1);
}
```

#### Database URL 公式
加载驱动程序后，可以使用 DriverManager.getConnection() 方法建立连接。 为了方便参考，列出三个重载的 DriverManager.getConnection() 方法 

- getConnection(String url)

- getConnection(String url, Properties prop)

- getConnection(String url, String user, String password)

这里每个表单都需要一个数据库URL。 数据库 URL 是指向数据库的地址。

制定数据库 URL 是与建立连接相关的大多数问题发生的地方。

下表列出了流行的 JDBC 驱动程序名称和数据库 URL。

|RDBMS|JDBC 驱动程序名称|网址格式|
|----|----|----|
|MySQL|com.mysql.jdbc.Driver|**jdbc:mysql://**hostname/databaseName|
|ORACLE|oracle.jdbc.driver.OracleDriver|**jdbc:oracle:thin:**@hostname:port Number:databaseName|
|DB2|COM.ibm.db2.jdbc.net.DB2Driver|**jdbc:db2:**hostname:portNumber/databaseName|
|Sybase|com.sybase.jdbc.SybDriver|**jdbc:sybase:Tds:**hostname:portNumber/databaseName|

URL 格式中所有突出显示的部分都是静态的，只需根据数据库设置更改剩余部分。

## JDBC - Statements, PreparedStatement 和 CallableStatement

一旦获得连接，我们就可以与数据库进行交互。 JDBC Statement、CallableStatement 和 PreparedStatement 接口定义了使您能够发送 SQL 或 PL/SQL 命令并从数据库接收数据的方法和属性。

它们还定义了有助于弥合数据库中使用的 Java 和 SQL 数据类型之间的数据类型差异的方法。

下表提供了每个接口用于决定要使用的接口的目的摘要。

|接口|推荐使用|
|---|---|
|Statement|将其用于对数据库的通用访问。 在运行时使用静态 SQL 语句时很有用。 Statement 接口不能接受参数。|
|PreparedStatement|当您计划多次使用 SQL 语句时使用它。 PreparedStatement 接口在运行时接受输入参数。|
|CallableStatement|当您想要访问数据库存储过程时使用它。 CallableStatement 接口还可以接受运行时输入参数。|

## JDBC - Create Database 创建数据库示例

#### 所需步骤
使用 JDBC 应用程序创建新数据库需要以下步骤 −

- Import the packages − 要求您包含包含数据库编程所需的 JDBC 类的包。 大多数情况下，使用 import java.sql.* 就足够了。

- Open a connection − 需要使用 DriverManager.getConnection() 方法创建一个 Connection 对象，该对象表示与数据库服务器的物理连接。 要创建一个新数据库，您在准备数据库 URL 时不需要提供任何数据库名称，如下例中所述。

- Execute a query − 需要使用 Statement 类型的对象来构建 SQL 语句并将其提交到数据库。

- Clean up the environment try with resources 会自动关闭资源。

#### 示例代码

```java
package org.code.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample {

    // 定义JDBC连接数据库信息
    static final String MySQL_URL = "jdbc:mysql://172.16.7.100:3306/?useSSL=false&allowPublicKeyRetrieval=true";
    static final String MySQL_USER = "root";
    static final String MySQL_PASSWORD = "123456";

    public static void main(String[] args) {
        // 打开一个连接
        try (Connection conn = DriverManager.getConnection(MySQL_URL, MySQL_USER, MySQL_PASSWORD);
             Statement stmt = conn.createStatement();
        ) {
            String sql = "CREATE DATABASE TEST";
            stmt.executeLargeUpdate(sql);
            System.out.println("数据库创建完毕");

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
```

## JDBC - 选择数据库示例

```java
package org.code.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCSelectDatabase {
    static final String MySQL_URL = "jdbc:mysql://172.16.7.100:3306/food?useSSL=false&allowPublicKeyRetrieval=true";
    static final String MySQL_USER = "root";
    static final String MySQL_PASSWORD = "123456";

    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(MySQL_URL, MySQL_USER, MySQL_PASSWORD);) {
            System.out.println("Database 已选择");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
```

## JDBC - Drop Database 删除数据库示例

```java
package org.code.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDeleteDatabase {
    private static final String MySQL_URL = "jdbc:mysql://172.16.7.100:3306/food?useSSL=false&allowPublicKeyRetrieval=true";
    private static final String MySQL_USER = "root";
    private static final String MySQL_PASSWORD = "123456";

    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(MySQL_URL, MySQL_USER, MySQL_PASSWORD);
             Statement stat = conn.createStatement()
        ) {
            String delete_sql = "DROP DATABASE TEST";
            stat.executeLargeUpdate(delete_sql);
            System.out.println("Database 删除完毕");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
```

## JDBC - CREATE TABLE 创建表示例

```java
package org.code.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCCreateTable {
    static final String MySQL_URL = "jdbc:mysql://172.16.7.100:3306/food?useSSL=false&allowPublicKeyRetrieval=true";
    static final String MySQL_USER = "root";
    static final String MySQL_PASSWORD = "123456";

    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(MySQL_URL, MySQL_USER, MySQL_PASSWORD);
             Statement stat = conn.createStatement();
        ) {
            String sql = "CREATE TABLE TEST_TABLE" +
                    " (id int," +
                    "name varchar(20))";
            stat.executeLargeUpdate(sql);
            System.out.println("Table 创建完毕");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
```

## JDBC - DROP TABLE 删除表示例

```java
package org.code.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDeleteTable {

    static final String MySQL_URL = "jdbc:mysql://172.16.7.100:3306/food?useSSL=false&allowPublicKeyRetrieval=true";
    static final String MySQL_USER = "root";
    static final String MySQL_PASSWORD = "123456";

    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(MySQL_URL, MySQL_USER, MySQL_PASSWORD);
             Statement stat = conn.createStatement();
        ) {
            String sql = "drop table TEST_TABLE";
            stat.executeLargeUpdate(sql);
            System.out.println("Table 已删除");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
```

## JDBC - INSERT INTO 插入记录示例

```java
package org.code.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCInsertInto {
    static final String MySQL_URL = "jdbc:mysql://172.16.7.100:3306/food?useSSL=false&allowPublicKeyRetrieval=true";
    static final String MySQL_USER = "root";
    static final String MySQL_PASSWORD = "123456";

    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(MySQL_URL, MySQL_USER, MySQL_PASSWORD);
             Statement stat = conn.createStatement();
        ) {
            String sql = "insert into employees values" +
                    "(NULL,'Bob Li', 32, 'DevOps Engineer', '2021-11-01')," +
                    "(NULL,'Cindy Wang', 25, 'QA Tester', '2023-03-10')," +
                    "(NULL,'David Chen', 40, 'Project Manager', '2020-01-20');";

            stat.executeLargeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
```

## JDBC - Select 选择记录示例

```java
package org.code.JDBC;

import java.sql.*;

public class JDBCQuery {

    static final String MySQL_URL = "jdbc:mysql://172.16.7.100:3306/food?useSSL=false&allowPublicKeyRetrieval=true";
    static final String MySQL_USER = "root";
    static final String MySQL_PASSWORD = "123456";
    static final String QUERY = "select id,name,age,position,hire_date from employees";

    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(MySQL_URL, MySQL_USER, MySQL_PASSWORD);
             Statement stat = conn.createStatement();
             ResultSet rs = stat.executeQuery(QUERY);
        ) {
            while (rs.next()) {
                System.out.println("ID:" + rs.getInt("id"));
                System.out.println("Name:" + rs.getString("name"));
                System.out.println("Age:" + rs.getInt("age"));
                System.out.println("position:" + rs.getString("position"));
                System.out.println("hire_date:" + rs.getDate("hire_date"));
            }

        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }
}
```

输出：
> ID:1
> Name:Bob Li
> Age:32
> position:DevOps Engineer
> hire_date:2021-11-01


## JDBC - UPDATE 更新记录示例

```java
package org.code.JDBC;

import java.sql.*;

public class JDBCUpdate {
    static final String MySQL_URL = "jdbc:mysql://172.16.7.100:3306/food?useSSL=false&allowPublicKeyRetrieval=true";
    static final String MySQL_USER = "root";
    static final String MySQL_PASSWORD = "123456";
    static final String QUERY = "select id,name,age,position,hire_date from employees";

    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(MySQL_URL, MySQL_USER, MySQL_PASSWORD);
             Statement stat = conn.createStatement()) {
            String sql = "update employees " +
                    "set age = 30 where id = 1";
            stat.executeLargeUpdate(sql);

            // 这个是查询语句，放在这里是因为我们需要先update再查询，不然放在前面查询没用
            ResultSet rs = stat.executeQuery(QUERY);

            while (rs.next()) {
                System.out.println("id:" + rs.getInt("id"));
                System.out.println("name:" + rs.getString("name"));
                System.out.println("age:" + rs.getInt("age"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
```

## JDBC - Delete 删除记录示例

```java
package org.code.JDBC;

import java.sql.*;

public class JDBCDelete {
    static final String MySQL_URL = "jdbc:mysql://172.16.7.100:3306/food?useSSL=false&allowPublicKeyRetrieval=true";
    static final String MySQL_USER = "root";
    static final String MySQL_PASSWORD = "123456";
    static final String QUERY = "select id,name,age,position,hire_date from employees";

    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(MySQL_URL, MySQL_USER, MySQL_PASSWORD);
             Statement stat = conn.createStatement()) {
            String sql = "delete from employees where id = 1";

            stat.executeLargeUpdate(sql);

            // 这个是查询语句，放在这里是因为我们需要先update再查询，不然放在前面查询没用
            ResultSet rs = stat.executeQuery(QUERY);

            while (rs.next()) {
                System.out.println("id:" + rs.getInt("id"));
                System.out.println("name:" + rs.getString("name"));
                System.out.println("age:" + rs.getInt("age"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
```

## 

```java JDBC - WHERE 子句示例
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestApplication {
   static final String DB_URL = "jdbc:mysql://localhost/TUTORIALSPOINT";
   static final String USER = "guest";
   static final String PASS = "guest123";
   static final String QUERY = "SELECT id, first, last, age FROM Registration";

   public static void main(String[] args) {
      // Open a connection
      try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
         Statement stmt = conn.createStatement();) {		      
         System.out.println("Fetching records without condition...");
         ResultSet rs = stmt.executeQuery(QUERY);
         while(rs.next()){
            //Display values
            System.out.print("ID: " + rs.getInt("id"));
            System.out.print(", Age: " + rs.getInt("age"));
            System.out.print(", First: " + rs.getString("first"));
            System.out.println(", Last: " + rs.getString("last"));
         }

         // Select all records having ID equal or greater than 101
         System.out.println("Fetching records with condition...");
         String sql = "SELECT id, first, last, age FROM Registration" +
            " WHERE id >= 101 ";
         rs = stmt.executeQuery(sql);

         while(rs.next()){
            //Display values
            System.out.print("ID: " + rs.getInt("id"));
            System.out.print(", Age: " + rs.getInt("age"));
            System.out.print(", First: " + rs.getString("first"));
            System.out.println(", Last: " + rs.getString("last"));
         }
         rs.close();
      } catch (SQLException e) {
         e.printStackTrace();
      } 
   }
}
```

## JDBC - LIKE 子句示例

```java
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample {
   static final String DB_URL = "jdbc:mysql://localhost/TUTORIALSPOINT";
   static final String USER = "guest";
   static final String PASS = "guest123";
   static final String QUERY = "SELECT id, first, last, age FROM Registration";

   public static void main(String[] args) {
      // Open a connection
      try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
         Statement stmt = conn.createStatement();) {		      
         System.out.println("Fetching records without condition...");
         ResultSet rs = stmt.executeQuery(QUERY);
         while(rs.next()){
            //Display values
            System.out.print("ID: " + rs.getInt("id"));
            System.out.print(", Age: " + rs.getInt("age"));
            System.out.print(", First: " + rs.getString("first"));
            System.out.println(", Last: " + rs.getString("last"));
         }

         // Select all records having ID equal or greater than 101
         System.out.println("Fetching records with condition...");
         String sql = "SELECT id, first, last, age FROM Registration" +
            " WHERE first LIKE '%za%'";
         rs = stmt.executeQuery(sql);

         while(rs.next()){
            //Display values
            System.out.print("ID: " + rs.getInt("id"));
            System.out.print(", Age: " + rs.getInt("age"));
            System.out.print(", First: " + rs.getString("first"));
            System.out.println(", Last: " + rs.getString("last"));
         }
         rs.close();
      } catch (SQLException e) {
         e.printStackTrace();
      } 
   }
}
```

## JDBC - 排序数据示例

```java
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample {
   static final String DB_URL = "jdbc:mysql://localhost/TUTORIALSPOINT";
   static final String USER = "guest";
   static final String PASS = "guest123";
   static final String QUERY = "SELECT id, first, last, age FROM Registration";

   public static void main(String[] args) {
      // Open a connection
      try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
         Statement stmt = conn.createStatement();) {		      
         System.out.println("Fetching records in ascending order...");
         ResultSet rs = stmt.executeQuery(QUERY + " ORDER BY first ASC");
         while(rs.next()){
            //Display values
            System.out.print("ID: " + rs.getInt("id"));
            System.out.print(", Age: " + rs.getInt("age"));
            System.out.print(", First: " + rs.getString("first"));
            System.out.println(", Last: " + rs.getString("last"));
         }

         System.out.println("Fetching records in descending order...");
         rs = stmt.executeQuery(QUERY + " ORDER BY first DESC");
         while(rs.next()){
            //Display values
            System.out.print("ID: " + rs.getInt("id"));
            System.out.print(", Age: " + rs.getInt("age"));
            System.out.print(", First: " + rs.getString("first"));
            System.out.println(", Last: " + rs.getString("last"));
         }
         rs.close();
      } catch (SQLException e) {
         e.printStackTrace();
      } 
   }
}
```

----

### 总结：
> 以上内容只要掌握了 JDBC 中的 Connection,Statement,ResultSet 即可