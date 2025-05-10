# Java的基础知识



> 前置准备工作，Windows，能访问外网以及内网服务器的电脑。（好用的脑子一个）



#### JDK的组成

JVM----------------- JVM（Java Virtual Machine）：java虚拟机，真正运行Java的地方

核心类库----------核心类库：Java写好主机的程序，给程序员自己的程序调用的

开发工具:----------JRE（JAVA Runtime Environment）：Java的运行环境

Java | Javac        JDK（JAVA Development Kit）：Java开发工具包（包括JVM，核心类库，JRE）



- Java程序是先用javac进行编译，后用java进行输出。



- 在计算机中，任意数据都是以二进制的形式来存储的



----



#### Java的跨平台，工作原理

- 一次编译，处处可用。



>  Java程序----->(javac编译)----->Class文件
>
> Java为我们写好了JVM虚拟机运行环境，这使得我们可以在Windows，Linux，MacOS都可以无缝衔接的运行javac编译好的Java文件。



----



#### Java Path配置

1.什么是Path环境变量？

- Path环境变量用于配置程序的路径
- 方便我们在命令行窗口的任意目录启动程序

2.JDK安装时，环境变量需要注意什么？

- 较新的JDK会自动配置PATH环境变量，较老的JDK版本则不会
- 建议还是主机配置一下“path”，“JAVA_HOME”



----



#### IDEA开发工具的使用

> 在Java中常见的开发工具有：Eclipse, MyEclipse, **Intellij IDEA**, Jbuilder, NetBeans等



**IDEA管理Java程序结构**

> - Project(项目，工程)
> - Module(模块)
> - Package(包)
> - Class(类)







#### IDEA开发第一个Java程序：

1. 创建工程（Project）
2. 创建模块（Module）
3. 创建包（Package）
4. 创建类（Class）



**使用IDEA开发一个输出HelloWorld**

```java
package fun.yexiaonan.one;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World！");
    }
}
```



----



#### IDEA应用设置



- 设置主题
- File > Settings > Appearance > Theme



- 设置字体大小
- File > Settings > Editor > Font 



-----



#### IDEA快捷键

| 快捷键                            | 功能效果                            |
| --------------------------------- | ----------------------------------- |
| main/psvm,sout                    | 快速插入相关代码                    |
| Ctrl + D                          | 复制当前选中代码到下一行            |
| Ctrl + Y                          | 删除所在行，建议用 Ctrl + X（剪切） |
| Ctrl + ALT + L                    | 格式化代码                          |
| ALT + SHIFT + ↑ ，ALT + SHIFT + ↓ | 上下移动当前代码                    |
| Ctrl + / , Ctrl + SHIFT + /       | 对代码进行注释                      |



# Java基础



#### Java单行注释

```java
// Java单行注释
package speedkay;

public class SpeedKey {
    public static void main(String[] args) {
        // 以下是一个打印语句。程序在运行时不会输出这个注释里面的内容
        System.out.println("Hello World");
    }
}
```



----



#### Java多行注释

```java
/*
Java多行注释
*/
package speedkay;

public class SpeedKey {
    public static void main(String[] args) {
        /*
        以下是一个打印语句。程序在运行时不会输出这个注释里面的内容
        嘻嘻
         */
        System.out.println("Hello World");
    }
}

```



----



#### Java文档注释

```java
/**
	文档注释的写法
*/
package speedkay;

public class SpeedKey {
    public static void main(String[] args) {
        /**
        以下是一个打印语句。程序在运行时不会输出这个注释里面的内容
         */
        System.out.println("Hello World");
    }
}
```



-----



#### Java字面量

> 在Java中，他的输出字符串与数字的方式与我们正常书写一样

```java
package fun.yexiaonan.day02;

public class TestCode {
    public static void main(String[] args) {
        // 1.整数打印
        System.out.println('1');

        // 2.小数打印
        System.out.println(8.8);

        // 3.字符写法
        System.out.println("中");

        // 4.空字符
        System.out.println(' ');

        // 5.特殊字符(换行)
        System.out.println('\n');

        // 6.特殊字符(Tab缩进)
        System.out.println('\t');

        // 7.字符串必须用双引号括起来，里面内容可以随意
        System.out.println("I Love China!");
        System.out.println("我爱你中国");
        // 双引号里面不加字符也能进行输出不会报错，但是单引号就不行
        System.out.println("");

        // 8.布尔值 只有两个值 False True
        System.out.println(true);
        System.out.println(false);

    }
}

```



----





#### Java字面量总结

1. **字符**必须用单引号围起来，而且仅能有一个字符
2. **字符串**必须用双引号围起来
3. 几个常见的特殊值的书写格式：
   - true
   - false
   - null
   - \n
   - \t



----



#### Java变量

> 变量是用来记住程序要处理的数据的
>
> 使用变量便于扩展和维护



变量的定义格式：

![微信图片_20241018092529.png](https://pxy.shenyi.cyou/2024/10/18/微信图片_20241018092529.png)



变量中的数值是可以被替换的

例如:

```java
public static void main(String[] args) {
    int age2 = 18;
    age2 = 19;
    System.out.println(age2);

    age2 = age2 + 1;
    System.out.println(age2);
}
}
```



①注意：

如果需要重复赋值，那么需要重复赋值的步骤

例如：

```java
public static void main(String[] args) {
    System.out.println("--------------------");
    // 钱包里面有9.5元，收到了10元红包，又发出去了5月，输出钱包各阶段的余额
    double mymoney = 9.5;	// 给变量第一次赋值，带上变量类型
    System.out.println(mymoney);

    System.out.println("收到了10元红包");
    mymoney = mymoney + 10;	// 给变量重复赋值，从右往左重新赋值
    System.out.println(mymoney);
}
}
```



②注意：

- 变量需要先声明才能使用
- 变量是什么类型，就应该用来**赋值什么类型的数据**，否则无法运行

```java
double money = "有钱";
```

- 变量从定义开始到 "}" 截至的范围内有效；而且同一个范围内，**多个变量的名称不能重复**

```java
int age = 18;
System.out.println(age);
int age = 21;
```

- 变量定义的时候可以不赋初始值；但是在使用时，**变量里面必须有值**，否则无法运行

```java
int age;
System.out.println(age);
```



----



#### Java变量总结

1. 变量是用来存储数据的，本质是内存中的一块区域
2. 变量的完整定义：
   - 数据类型  变量名称  =  数据
   - int age = 18；
3. 使用变量存储需要的数据，在书写代码时更加的灵活，管理代码更加方便
4. 变量中的数据可以被替换



----



#### Java关键字，标志符

- 关键字

> 在Java中，关键字相当于Java自带的一些句子，在后续的变量中，变量名不能与Java的关键字相同

**注意：**Java 的 null 不是关键字，类似于 true 和 false，它是一个字面常量，不允许作为标识符使用。



| 类别     | 关键字    | 说明     |
| :------- | :-------- | :------- |
| 访问控制 | private   | 私有的   |
|          | protected | 受保护的 |
|          | public    | 公共的   |
|          | default   | 默认     |

##### 概述

Java 中的 **关键字（keywords）** 是具有预定义含义的保留字，不能用作标识符（如变量名、方法名、类名等）。截至 JDK 8，有 50 个保留关键字（其中 48 个可用，2 个保留但未使用），以及 3 个字面量（`true`、`false`、`null`）不能用作标识符。同时，自 Java 9 起又引入了一批**上下文关键字（contextual keywords）**，这使得总计可识别的保留词达到 68 个，其中 17 个仅在特定上下文中被视为关键字([Oracle 文档](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/_keywords.html), [Wikipedia](https://en.wikipedia.org/wiki/List_of_Java_keywords?utm_source=chatgpt.com))。



##### 保留关键字 

以下列表源自 Oracle Java™ 教程，适用于 JDK 8。括号中的注释表明新增版本或保留状态。

```text
abstract    // 抽象类或方法（since 1.0）  
assert      // 断言（since 1.4）  
boolean     // 布尔类型  
break       // 跳出循环或 switch  
byte        // 8 位整数类型  
case        // switch 分支标签  
catch       // 异常捕获  
char        // 16 位 Unicode 字符类型  
class       // 类声明  
continue    // 结束本次循环，进入下一次循环  
default     // switch 的默认分支  
do          // do-while 循环  
double      // 64 位浮点数类型  
else        // if 的否定分支  
enum        // 枚举类型（since 5.0）  
extends     // 类或接口继承  
final       // 常量、方法不可重写、类不可继承  
finally     // 异常处理块  
float       // 32 位浮点数类型  
for         // for 循环  
if          // 条件分支  
implements  // 类实现接口  
import      // 导入包或类  
instanceof  // 类型检查  
int         // 32 位整数类型  
interface   // 接口声明  
long        // 64 位整数类型  
native      // 本地方法  
new         // 创建对象  
package     // 包声明  
private     // 私有访问权限  
protected   // 受保护访问权限  
public      // 公有访问权限  
return      // 从方法返回  
short       // 16 位整数类型  
static      // 静态成员  
strictfp    // 严格浮点运算（since 1.2）  
super       // 指向父类实例  
switch      // 多分支选择  
synchronized// 同步  
this        // 当前对象实例  
throw       // 抛出异常  
throws      // 方法声明抛出的异常  
transient   // 瞬态字段，不序列化  
try         // 异常处理块开始  
void        // 无返回值方法  
volatile    // 易失字段，多线程可见  
while       // while 循环  
```

> **保留但未使用**
>
> - `const`（保留，未实现）
> - `goto`（保留，未实现） ([Oracle 文档](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/_keywords.html))



##### 上下文关键字 

自 Java 9 模块系统（Project Jigsaw）起，引入了一批仅在特定语法上下文中才被视作关键词的保留词。它们在非模块或非相应语境下仍可作普通标识符使用（若无冲突）：

| 关键字       | 用途                                                  |
| ------------ | ----------------------------------------------------- |
| `exports`    | 模块声明中，指定包对其他模块可见                      |
| `opens`      | 模块声明中，开放包以供反射访问                        |
| `module`     | 声明模块                                              |
| `requires`   | 模块声明中，指定模块依赖                              |
| `uses`       | 模块声明中，声明将使用某服务                          |
| `provides`   | 模块声明中，提供某服务的实现                          |
| `with`       | 与 `provides` 一起，指定服务的实现选择                |
| `transitive` | 在 `requires` 中，传递性依赖                          |
| `open`       | 声明模块对所有人开放（反射访问）                      |
| `opens`      | 声明包对所有人开放（反射访问）                        |
| `permits`    | 在 `sealed` 声明中，指定允许扩展的类                  |
| `sealed`     | 声明密封类，只允许 `permits` 中列出的类扩展           |
| `non-sealed` | 在子类中声明“非密封”，允许进一步扩展                  |
| `record`     | 声明记录类型，一种紧凑的不可变数据载体                |
| `to`         | 与 `opens` 或 `exports` 一起，限制开放/导出的目标模块 |
| `var`        | 本地变量类型推断（since Java 10）                     |
| `yield`      | 在 switch 表达式中返回值（since Java 13）             |
| `when`       | 模式匹配 `switch` 的额外条件（preview features）      |

> 上表来源：Java Language Specification, §3.9 “Contextual Keywords” ([Oracle 文档](https://docs.oracle.com/javase/specs/jls/se17/html/jls-3.html?utm_source=chatgpt.com))



##### 字面量与特殊保留词

- `true`、`false`：布尔字面量，不是真正的关键字，而是保留字面量，不可作为标识符([Oracle 文档](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/_keywords.html))
- `null`：空引用字面量，同样不可用于标识符([Oracle 文档](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/_keywords.html))
- `_`（单下划线）：自 Java 9 起被限制为保留字，仅可用于未来参数名称声明，当前应避免单独使用([Oracle 文档](https://docs.oracle.com/javase/specs/jls/se17/html/jls-3.html))



##### 小结

- **核心关键字**：50 个（包括 48 个可用、2 个保留未用）。
- **上下文关键字**：17 个，仅在指定模块或语法结构中保留。
- **字面量**：`true`、`false`、`null` 也是保留字面量。
- **保留扩展**：单下划线 `_` 和未来可能引入的新关键字继续受语言规范管控。





# Java语法



#### Java的标识符

》标识符：就是给**类**，**方法**，**变量**等起的名字

1. 标识符由数字，字母，下划线（ _ ）和美元符号（$）组成

2. 不能以数字开头
3. 不能是关键字
4. 区分大小写



- 小驼峰命名法：方法，变量

  - 规范1：标识符是一个单词的时候，全部小写
  - 规范1：**name**

  - 规范2：标识符由多个单词组成的时候，第一个字母小写，其他单词首字母大写

  - 规范2：**fristName**



- 大驼峰命名法：类名
  - 规范1：标识符是一个单词的时候，首字母大写
  - 规范1：Student
  - 规范2：标识符由多个单词组成的时候，每个单词的首字母大写
  - 规范2：GoodStudent



> 给每一个标识符起名字的时候，都应该做到**见名知意**





#### Java变量详解

- 变量里的数据在计算机中的存储原理

  - 二进制
    - 在Java中只有0，1，按照逢2进1的方式表示数据：
    - ![微信图片_20241021093350.png](https://pxy.shenyi.cyou/2024/10/21/微信图片_20241021093350.png)
  - 计算机中表示数据的最小单元
    - 计算机中表示数据的最小单元：一个字节（Byte，简称B，是使用8个二进制位组成的）
    - 字节中的每个二进制位就称为位（bit，简称B），1B=8b

- 数据类型

  - Text 文本

    ​											ASCII 字符代码表 一

  ![ASCII.png](https://pxy.shenyi.cyou/2024/10/21/ASCII.png)

  - Image 图片

  - Sound 声音

    

#### Java类型转换

- 基本数据类型：4大类8大种

| 数据类型       | 数据类型     | 内存占用（字节数） | 数据范围                                           |
| -------------- | ------------ | ------------------ | -------------------------------------------------- |
| 整型           | byte         | 1                  | -128~127                                           |
| 整型           | short        | 2                  | -32768~32767                                       |
| 整型           | int(默认)    | 4                  | -2147483648~2147483647(10位数，大概21亿多)         |
| 整型           | long         | 8                  | -9223372036854775808~9223372036854775807（19位数） |
| 浮点型（小数） | float        | 4                  | 1.401298E -24 到3.4028235E+38                      |
| 浮点型（小数） | double(默认) | 8                  | 4.90000000 E-324 到1.797693 E+308                  |
| 字符型         | char         | 2                  | 0-65535                                            |
| 布尔型         | boolean      | 1                  | true,false                                         |

- 在Java中由于整数的类型默认是**int类型**导致在写入长数据想要使用long类型时，需要在数据后面加上 `L 或者 l`

- 在Java中由于浮点数的类型默认是**double类型**导致在写入某些数据想要使用float类型时，需要在数据后面加上 `F 或者 f`

  - 例如：

  - ```java
    public class Main {
        public static void main(String[] args) {
            long lg = 114514L; // 长数据类型
            System.out.println(lg);
        }
    }
    
    public static void main(String[] args) {
        // float double类型
        // 随便写的小数字面量默认是double类型,如果希望是float类型，需要在后面加上F 或者 f
        float f = 3.14F;
        System.out.println(f);
        double d = 3.1415926;
        System.out.println(d);
    }
    }
    
    public static void main(String[] args) {
        // char 字符型
        char ch = 'a';
        char ch2 = '中';
        System.out.println(ch);
        System.out.println(ch2);
        // boolean 布尔型
        boolean flag = true;
        boolean flag1 = false;
        System.out.println(flag);
        System.out.println(flag1);
    }
    }
    ```

- 引用数据类型:String

  - ```java
    public class Main {
        public static void main(String[] args) {
            // String 字符串类型,定义的变量可以用于记住一个字符串类型
            String name = "叶小楠";
            System.out.println(name);
        }
    }
    ```



- 自动类型转换，为什么要进行自动类型转换

  - 类型范围小的变量，可以直接赋值给类型范围大的变量。

  - ```java
    public class Main {
        public static void main(String[] args) {
            // 目标；理解自动类型转换机制。
            byte a = 12;
            int b = a;
            // 类型自动转换
            System.out.println(a);
            System.out.println(b);
        }
    }
    
    ```

- 小范围类型变量可以直接赋值给大范围类型变量

  - ```java
    public class Main {
        public static void main(String[] args) {
            // 目标；理解自动类型转换机制。
            byte a = 12;
            int b = a;
            // 类型自动转换
            System.out.println(a);
            System.out.println(b);
    
            char name = 'a';
            int i = name;
            System.out.println(name);
        }
    }
    ```



----



#### Java组成

- 类
- 声明

```java
package org.example;

/**
 *  public：访问修饰符
 *  class，static，void：声明类的关键字，声明一个类
 *  Java编程语言里，main 里面运行
 *  main代表的是方法名字
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}
```



- 类型参数

```java
package org.example;
/*
在Java的Class类中只能写两样参数。
1.属性：变量
【数据类型】 【变量名称】 = 【初始值】
int age = 18 ;
Java的类型有三种：
    整数型:
    byte
    short
    int[1]
    long[1]
    浮点型：
    float
    double[1]
    布尔类型：
    boolean[1]
    字符类型：
    char
2.行为，方法
 */

public class TestMain {

    public static void main(String[] args) {
        //创建对象
        TestMain test = new TestMain();
        //调用方法：无参数，无返回值
        test.printInfo();
        //调用方法：无参数，有返回值
        int number = test.getNumber();
        System.out.println(number);
        //调用方法：有参数，无返回值
        test.setNumber(10,"叶");
        //调用方法：有参数，有返回值
        int sum = test.sum(1,2);
        System.out.println(sum);
    }
    int number1 = 0;

    /*
    在Java中声明类的方法有四种
    1，方法是否有返回值
    2，方法是否有参数
        --1.无参数，无返回值
        --2.无参数，有返回值 
        --3.有参数，无返回值
        --4.有参数，有返回值
     声明一个方法
     【方法的返回值类型】 【方法名】(参数列表){
        代码
     }
    3，
    4，
     */
        // 方法一:无参数，无返回值的方法

    void printInfo(){
        System.out.println("Hello World");

    }

    // 方法二:无参数，有返回值的方法
    // return 是Java内置的关键字
    int getNumber(){
        return 123;
    }

    // 方法三:有参数，无返回值的方法（可以接受多个参数）
    void setNumber(int number1 , String str01){
        System.out.println(number1);
        System.out.println(str01);
    }

    // 方法四:有参数，有返回值的方法
    int sum(int a , int b){
        return a + b;
    }

}
```



#### Java运算符

- 在Java中有许多的运算，例如while，for，do...while。while语法结构
- while语法结构

```java
while( 布尔表达式 ) {
	// 循环内容
}
```

- **while语法案例**

```java
package day;
public class JavaCode {
    public static void main(String[] args) {
        // 在控制台打印出1~10个数字
        int i = 1;
        while(i<=10){
            System.out.println(i);
            i++;
        }
    }
}
```

- do...while语法结构

```java
do {
    // 代码语句
}while(布尔表达式);
```

- **do...while语法案例**

```java
package day;
public class JavaCode {
    public static void main(String[] args) {
    // 在控制台打印出1~10个数字
        int i = 1;
        do{
            System.out.println(i);
            i++;
        }while (i<=10);
    }
}
```

- for语法结构

```java
for(初始化；布尔表达式；更新) {
    // 代码语句
}
```

- **for语法案例**

```java
public class JavaCode {
    public static void main(String[] args) {
        // 在控制台打印出1~10个数字
        for(int i = 1 ; i<=10 ; i++) {
            System.out.println(i);
        }
    }
}
```

- 增强for循环语法结构

```java
for(声明语句 ：表达式)
{
	// 代码句子
}
```

- **增强for循环语法案例**

```java
public class JavaCode {
    public static void main(String[] args) {
        // 在控制台打印出1~10个数字
        int[] a =new int[]{1,2,3,4,5,6,7,8,9,10};
        for(int num : a){
            System.out.println(num);
        }
    }
}
```





#### Java中的计算符

- 在Java中如果需要用到数字进行运算，那么也跟我们现实中的运算一样



- 例子

```java
public class JavaCode {
    public static void main(String[] args) {
        // 加法
        System.out.println(3+5);
        
        // 减法
        System.out.println(5-5);
        
        // 除法
        System.out.println(3/5);
        
        // 乘法
        System.out.println(3*5);
        
        // 取模
        System.out.println(3%5);
        }
    }
}
```



- 取模的用法
- 在Java中，取模操作是指求两个数相除后的余数。它使用 `%` 运算符来实现。例如，如果你有两个整数 `a` 和 `b`（其中 `b` 不为0），`a % b` 的结果将是 `a` 除以 `b` 后的余数。

```java
package org.yexiaonan;

import java.util.Scanner;

public class NumTest {
    public static void main(String[] args) {
        // 需求：
        // 键盘录入三位数，将其拆分为个位，十位，百位，打印在控制台

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个三位数：");
        int NumA = scanner.nextInt();

        int one = NumA % 10;
        int two = NumA / 10 % 10;
        int three = NumA / 10 / 10 %10;
        System.out.println(one);
        System.out.println(two);
        System.out.println(three);



    }
}

```





#### Java IF判断语句

- 在Java中IF可以用来判断数据是否相同

```java
// 编写一个简单的Java判断语句
package org.yexiaonan;

public class MyTestFor1 {
    public static void main(String[] args) {
        // if
        String name = "yexiaonan1";
        if(name == "yexiaonan"){
            // 代码体1 （当名字等于yexiaonan执行代码体1）
            System.out.println("你好世界");
        }else{
            // 代码体2 （当名字不等于yexiaonan执行代码体2并且退出IF）
            System.out.println("他不是yexiaonan");
        };
    } 
}
```



```java
// IF中还可以循环嵌套一个if
package org.yexiaonan;

public class MyTestFor1 {
    public static void main(String[] args) {
        // if
        String name = "叶小楠1";
        if(name == "叶小楠"){
            // 代码体1 （当名字等于yexiaonan执行代码体1）
            System.out.println("你好世界");
        }else if(name == "叶小楠1"){
            // 代码体2 （当名字不等于yexiaonan执行代码体2并且退出IF）
            System.out.println("他不是yexiaonan");
        };
    }
}



```




#### Java面向对象

```java
package org.yexiaonan;

/**
 * 1.属性（变量）
 * 2.行为（方法）
 */
public class MyFristClass {
    // 名字
    String name = "木棍";
    // 年龄
    int age = 1;
    // 颜色
    String color = "";
    // 行为
    public void eat(String food){
        // 如果小木棍吃到肉肉了
        if(food == "肉"){
            System.out.println("今天吃了肉肉感觉自己萌萌哒");
            // 如果吃到其他东西
        }else if (food == "其他"){
            System.out.println("今天吃到屎了");
            // 如果吃到没有分类的
        }else {
            System.out.println("人机");
        }
    }
    public void sleep(int time){
        if(time > 8){
            System.out.println("今天睡了八个小时，感觉自己神经");
        }else{
            System.out.println("今天没睡够八个小时，人机吧你");
        }
    }
    // name = 小小木棍1号
    public void printInfo(){
        // "name: " [打印字符串]
        // name     [name相当于变量]
        // 相当于字符串与变量的拼接
        System.out.println("name: " + name + "age: " + age +"color: " + color);
    }
}

```



```java
package org.yexiaonan;

public class Api {
    public static void main(String[] args) {
        // 创建第一个木棍实例
        MyFristClass MyFristClass1 = new MyFristClass();

        MyFristClass1.name = "小木木1号";
        MyFristClass1.age = 18;
        MyFristClass1.color = "黑人";
        // 将木棍打印到控制台
        MyFristClass1.printInfo();


         
        // 创建第二个木棍实例
        MyFristClass MyFristClass2 = new MyFristClass();

        MyFristClass2.name = "小木木2号";
        MyFristClass2.age = 19;
        MyFristClass2.color = "白人";
        // 将木棍打印到控制台
        MyFristClass2.printInfo();


    }
}

```



- Java的New使用
  - 在Java中可以使用New来创建一个类的实例，例如我有一个`Task1`的类，那么可以永以下方法来创建它的一个新实例

```java
package fun.test;


public class Task2 {
    public static void main(String[] args) {
        // 创建第一个木棍实例
        Task1 Frist1 = new Task1();
    }
}

```



- 调用构造函数
  - New关键字会调用类的构造函数来初始化对象。如果类中定义了构造函数，new会条用匹配的构造函数。

```java
Car myCar = new Car("Toyota", 2020); // 假设Car类有一个接受两个参数的构造函数
```



#### Java构造方法

- 在Java中，如果没有特意声明构造方法那么默认会构造一个没有返回值的方法，如果有需要，可以使用 `public 构造方法名字(传参)`来构造一个新的方法

```java
    /**
     *
     * @param name
     * @param age
     * @param color
     * 声明一个构造方法，当前的一个构造方法接受三个参数
     */
    public Task1(String name,int age,String color){
        System.out.println("这是一个三个参数的构造方法");
        this.name = name;
        this.age = age;
        this.color = color;
    }
```





- 小测试
  - 创建一个`类`
    - 存在三种不同的构造方法
    - 无参数的构造方法
    - 1个参数的构造方法
    - 多个参数的构造方法
  - 创建三个不同的对象，要求每个实例必须调用的是不同的构造方法。

```java
package com.yexiaonan;

public class Task {
    // 创建三个全局变量
    String UserName = "";
    int UserAge = 0;
    String PeopleSinks = "";

    // 创建一个无参数的返回值类
    public Task(){
        this.UserName = "PanNiXiaLangZai";
        this.UserAge = 19;
        this.PeopleSinks = "黑皮";
        System.out.println("创建一个无参数的返回值类: " + this.UserName + " 年龄 " + this.UserAge + " 皮肤颜色 " + this.PeopleSinks);
    }

    // 创建一个只接受一个参数的返回值类
    public Task(String UserName){
        this.UserName = UserName;
        this.UserAge = 17;
        this.PeopleSinks = "白皮";
        System.out.println("创建一个只接受一个参数的返回值类: " + this.UserName + " 年龄 " + this.UserAge + " 皮肤颜色 " + this.PeopleSinks);

    }

    // 创建一个接受多个参数的返回值类
    public Task(String UserName,int UserAge,String PeopleSinks){
        this.UserName = UserName;
        this.UserAge = UserAge;
        this.PeopleSinks = PeopleSinks;
        System.out.println("创建一个接受多个参数的返回值类: " + this.UserName + " 年龄 " + this.UserAge + " 皮肤颜色 " + this.PeopleSinks);
    }

    // 创建一个输出语句，用于测试
    public static void main(String[] args) {
        // 创建第一个无参数返回值的输出语句，不需要添加内容
        Task s1 = new Task();

        // 创建第二个只接收一个参数返回值的输出语句，往里面添加姓名
        Task s2 = new Task("体育生");

        // 创建第三个接受多个参数返回值的输出语句，往里面插入三条数据
        Task s3 = new Task("黑皮体育生",18,"黑色");


    }
}
```







#### Java的封装

- 在面向对象程式设计方法中，封装是指将实现部分的细节部分包装，从而达到隐藏起来的方法
  1. 封装可以被认为是一个保护屏障，防止该`类`的代码和数据被外部定义的代码随机访问
  2. 要访问该类的代码和数据，必须通过严格的接口来控制



- Java种是使用“访问修饰符”来控制哪些细节需要封装，哪些细节需要暴漏的。Java种的4种“访问修饰符”分别为private，default，protected，public。它们说明了面向对象的封装性。

|    修饰符     | 同一个类 | 同一个包 | 子类  | 所有类 |
| :-----------: | :------: | :------: | :---: | :----: |
|  **private**  |  *****   |          |       |        |
|  **default**  |  *****   |  *****   |       |        |
| **protected** |  *****   |  *****   | ***** |        |
|  **public**   |  *****   |  *****   | ***** | *****  |

1. private 表示私有，只有自己类能访问
2. default 表示没有访问修饰符，只有同一个包内可以访问
3. protected 表示可以被同一个包的类以及其他包中的子类可以访问
4. public 表示全部人都可以访问



- Protected 【小细节】
  - 1.若父类和子类在同一个包中，子类可以访问父类的 Protected 成员，也可以访问父类对象的 Protected 成员。
  - 2.若子类和父类不在同一个包中，子类可以访问父类的 Protected 成员，不能访问父类对象的 Protected 成员。



- 小案例（用户到银行存钱和取钱）

```java
package Packaging;

/**
 * 需求：
 *  BankSystem：
 *      属性：有多少钱
 *      行为：
 *          put：支持用户存钱
 *              返回值：
 *              --boolean（布尔返回值类型【True：存钱成功，False：存钱失败】）
 *              --int （数字判断类型【1：存钱成功，False：存钱失败】）
 *              --void （可以在程序中写好对应的返回类型）
 *
 *              参数：
 *              --存储了多少钱
 *          get：支持用户取钱
 *              返回值：
 *              --int（成功取出多少钱）
 *
 *              参数：
 *              --int（你想取出多少钱）
 *  User:
 *      行为：
 *          put：存钱
 *          get：取钱
 *  APP：
 *      模拟用户存钱和取钱的一个过程
 */

public class BankSystem {
    // 取款机里面现在有10w元
    private static int money = 1000000;    // 11w
    public static void put(int money){
        System.out.println("【小楠Bank】存钱成功！") ;
        BankSystem.money = BankSystem.money + money;

    }

    public static void get(int money) {
        if (BankSystem.money > money){
            BankSystem.money = BankSystem.money - money;
            System.out.println("【小楠Bank】取钱成功");
        }else {
            System.out.println("【小楠Bank】取钱失败qwq，当前取款机没那么钱");
        }

    }

    public static int getBankSystemMoney(String password) {
        if (password.equals("123456")) {
            return BankSystem.money;
        } else {
            System.out.println("您不是系统管理员，无法查看系统存储多少钱");
            return -1;
        }
    }
}

/*
1.一个类里面如果没有显示的声明无参数构造方法的话，那么系统会自动生成一个无参数的构造方法
2.如果在一个类里面显示的声明了一个有参数的构造方法，那么无参数的构造方法系统不会自动生成
3.在类里面声明一个有参数的构造方法的话，那么无参数的构造方法的话要自动不全
 */

// 默认的，我们在声明一个类的时候系统会给我们一个无参数的构造方法
class User{
    String name = "";
    int age = 0;

    // 无参数的构造方法
    public User(){
    }

    // 有参数的构造方法
    public User(String name,int age){
    }

    // 参数money要取出多少钱
    public void get(int money){
        // 用户取钱需要找取款机，取钱
        BankSystem.get(money);
    }

    public void put(int money){
        // 存钱
        BankSystem.put(money);

    }

    public int getBankSystemMoney(String password) {
        return BankSystem.getBankSystemMoney(password);
    }
//        if (password.equals("123456")) {
//            return BankSystem.money;
//        } else {
//            System.out.println("您不是系统管理员，无法查看系统存储多少钱");
//            return -1;
//        }
//
}


/*
* 访问修饰符：public 四种访问修饰符
*   --public
*   --private
* */


class App{
    public static void main(String[] args) {
        User user = new User();
        user.put(10);
        user.get(100);
        int bankSystemMoney = user.getBankSystemMoney("123456");
        System.out.println(bankSystemMoney);
    }
}

```







#### Java的继承

- 继承抽象理解可以为父母留给我们的房子，我们继承他，拥有使用权限
  - 继承方便直接调用指定类的属性，从而不需要重写一遍，提高整洁

```java
package org.yexiaonan;


/*
实例-类的实例（对象）

 */
public class Dog {
    String name ="";
    int age = 0;

    public Dog(){};
    public Dog(String name,int age){
        this.name = name;
        this.age = age;

    }

    public void Print(){
        System.out.println("name: " + name + " age: " + age);
    }
}

/**
 *  子类的名字 extends 父类的名字
 *
 *   -- 继承属性（变量）
 *   -- 行为方法（方法）
 */

class Pug extends Dog{ 

}

class App1{
    public static void main(String[] args) {
        Pug pug = new Pug();
        pug.name = "木棍";
        pug.age = 12;
        pug.Print();
    }
}
```



#### Java的多态

多态是面向对象编程的一个核心特性，意思是“同一种行为，具有多种不同的表现形式”。在 Java 中，多态允许相同的代码在不同上下文中表现出不同的行为，提高了程序的灵活性和可扩展性。

------

##### **多态的核心机制**

Java 实现多态主要通过以下两种方式：

1. **方法的重写（Override）**
    子类对父类的非静态方法进行重新定义，方法签名（方法名和参数列表）相同，但子类提供具体实现。
2. **方法的重载（Overload）**
    同一类中多个方法具有相同的方法名但参数列表不同（参数类型、个数或顺序）。

------

##### **多态的实现方式**

1. **父类引用指向子类对象**
    Java 支持用父类类型的变量来引用子类对象，这是实现多态的基础。

   ```java
   class Animal {
       void speak() {
           System.out.println("Animal makes a sound");
       }
   }
   
   class Dog extends Animal {
       @Override
       void speak() {
           System.out.println("Dog barks");
       }
   }
   
   class Cat extends Animal {
       @Override
       void speak() {
           System.out.println("Cat meows");
       }
   }
   
   public class TestPolymorphism {
       public static void main(String[] args) {
           Animal a1 = new Dog(); // 父类引用指向子类对象
           Animal a2 = new Cat();
           
           a1.speak(); // 输出: Dog barks
           a2.speak(); // 输出: Cat meows
       }
   }
   ```

2. **动态绑定（Dynamic Binding）**
    在运行时，根据实际对象的类型调用对应的方法，而非编译时决定调用哪个方法。这是多态的核心。

------

##### **多态的好处**

1. **代码复用性**
    可以编写通用代码，针对父类进行操作，无需关心具体的子类类型。

   ```java
   void makeAnimalSpeak(Animal animal) {
       animal.speak();
   }
   ```

2. **扩展性强**
    当增加新的子类时，不需要修改原有代码，只需要新增子类实现。

------

##### **注意事项**

1. **向上转型和向下转型**

   - **向上转型**：子类对象可以赋值给父类引用，安全且自动。
   - **向下转型**：将父类引用强制转换为子类类型，需要显式强制转换，并确保类型匹配。

   ```java
   Animal animal = new Dog(); // 向上转型
   Dog dog = (Dog) animal;   // 向下转型
   ```

2. **多态只能用于方法**
    成员变量的调用依赖于引用的类型，而非实际对象类型。

3. **静态方法和静态绑定**
    静态方法属于类本身，而不是对象，因此无法实现多态。

------



#### Java键盘录入

- 在Python中可以使用 input 接受用户输入的数据，但是在Java中是没有 input 语法的，我们需要使用官方定义好的Scanner库来导入以实现从键盘获取用户输入的数据。



- java.util.Scanner 是 Java5 的新特征，我们可以通过 Scanner 类来获取用户的输入。

下面是创建 Scanner 对象的基本语法：

```java
// 导入Scanner
import java.util.Scanner; 

// 创建一个Scanner对象
Scanner s = new Scanner(System.in);

// 输出一个语句，让用户输入
System.out.println("Please Enter:");

// 创建一个变量来获取用户输入的数据
int Num = s.netInt();
```





#### Java数据类转换

- 在Java中，数字进行运算时，数字类型不一样不能运算，需要转换成`一样`的才能运算。



- 隐式转换：
  - 取值范围`小`的数值转换为取值范围`大`的数值

1. 取值范围小的，和取值范围大的进行运算，小的会先提升为大的，再进行运算

2. byte，sourt，char三种类型的数据在运算的时候，都会直接先提升为int，然后再进行运算



范例：

```java
package org.yexiaonan;

public class NumChange {
    double Numa = 12.3;
    int Numb =(int)Numa;

}

```





- 强制转换：
  - 取值范围`大`的数值，强制转换为取值范围`小`的数值

1. 格式：目标数据类型 变量名 = （目标数据类型）被强制转换的数据；





范例：

```java
package org.yexiaonan;

public class NumChange {
    public static void main(String[] args) {
        byte a1 = 10;
        byte a2 = 20;
        byte result = (byte)(a1 + a2);
        System.out.println(result);
    }
}

```



取值范围从小到大依次是：

> **byte > short > int > long > float > double**









#### Java的自增自减运算符

基本用法

| 符号 | 作用 |    说明     |
| :--: | :--: | :---------: |
|  ++  |  加  | 变量的值加1 |
|  --  |  减  | 变量的值减1 |



范例：

```java
package org.yexiaonan;

public class NumAdd {
    public static void main(String[] args) {
        // ++为变量的值加1
        int a = 10;
        a++;
        System.out.println(a);

        // --为变量的值减1
        int b = 10;
        b--;
        System.out.println(b);
    }
}

```

- ++和--既可以放在变量的前面，也可以放在变量的后面



#### Java的赋值运算符

- 赋值运算符的分类

| 符号 | 作用       | 说明                       |
| ---- | ---------- | -------------------------- |
| =    | 赋值       | int a =10，将10赋值给变量a |
| +=   | 加后赋值   | a+=b，将a+b的值赋值给a     |
| -=   | 减后赋值   | a-=b，将a-b的值赋值给a     |
| *=   | 乘后赋值   | a*=b，将aXb的值赋值给a     |
| /=   | 除后赋值   | a/=b，将a÷b的商给a         |
| &=   | 取余后赋值 | a%=b，将a÷b的余数给a       |

```java
package org.yexiaonan;

public class Demo1 {
    public static void main(String[] args) {


    // 规则：将左边和右边进行相加，然后再把结果赋值给左边
    int a = 10;
    int b = 20;

    // 把a和b相加，然后把结果赋值给左边的变量a
    a += b;
    // 等同于 a= a + b;
        System.out.println(a);
        System.out.println(b);



        // 细节
        short s =  1;
        // 由于s本身变量记录的值为1，当1+1等于2的结果时，变量2重新赋值给s
        s += 1;
        // 等同于 s = s + 1; 
        System.out.println(s);
    }
}

```



- （关系运算符/比较运算符）的分类



| 符号 | 说明                                                    |
| ---- | ------------------------------------------------------- |
| ==   | a==b，判断a和b的值是否相等成立为true不成立为false       |
| !=   | a!=b，判断a和b的值是否不相等，成立为true，不成立为false |
| >    | a>b，判断a是否大于b，成立为true，不成立为false          |
| >=   | a>=b，判断a是否大于等于b，成立为true，不成立为false     |
| <    | a<b，判断a是否小于b，成立为true，不成立为false          |
| <=   | a<=b，判断a是否小于等于b，成立为true，不成立为false     |



- 范例1

```java
package org.yexiaonan;

public class Demo2 {
    public static void main(String[] args) {
        // 判断运算符
        // 1.==判断左右两边是否相等
        int a = 10;
        int b = 10;
        int c = 20;

        // 当a等于b输出true代表等于
        System.out.println(a == b);

        // 当c等于b输出false代表不等于
        System.out.println(c == a);
    }


}

```



- 范例2

```java
package org.yexiaonan;

import java.util.Scanner;

public class TableForOne {
    public static void main(String[] args) {
        /*需求：
        * 您和您的对象正在试图在餐厅获得一张桌子
        * 键盘录入两个整数，表示你和你对象衣服的时髦程度。（手动录入0~10之间的整数，不能录入其他）
        * 如果你的时髦程度大于你对象的时髦程度，相亲就成功，输出true
        * 否则输出false
        * */
        System.out.println("请输入你衣服的时髦程度：");
        Scanner s = new Scanner(System.in);
        int UserInput01 = s.nextInt();

        System.out.println("请输入你对象衣服的时髦程度：");
        Scanner s1 = new Scanner(System.in);
        int UserInput02 = s.nextInt();

        System.out.println(UserInput01 >= UserInput02);


            // 除了可以用关系比较还可以用if判断语句
//        if (UserInput01 >= UserInput02){
//            System.out.println("true");
//        }else {
//            System.out.println("false");
//        }



    }
}

```





#### Java的逻辑运算符

- 在数学中，一个数据x，大于5，小于15，我们可以用 5< x < 15；
- 在Java中，需要把式子先拆分，在进行合并表达
  - 拆解为：x>5和x<15
  - 合并后：x>5 & x<15





| 符号 | 作用         | 说明                           |
| ---- | ------------ | ------------------------------ |
| &    | 逻辑与（且） | **并且**两边都为真，结果才是真 |
| \|   | 逻辑或       | **或者**两边都为假，结果才是假 |
| ^    | 逻辑异或     | 相同为 false，不同为 true      |
| !    | 逻辑非       | 取反                           |



- 范例

```java
package org.yexiaonan;

public class LogicWith {
    public static void main(String[] args) {
        // 1.& 并且
        // 两边都为真，结果才为真
        System.out.println(true & true);
        System.out.println(false & false);
        System.out.println(true & false);
        System.out.println(false & true);

        System.out.println("--------------");

        // 2. | 或者
        // 两边都为假，结果才为假（只要有一个真，结果就是真）
        System.out.println(true | true);
        System.out.println(false | false);
        System.out.println(true | false);
        System.out.println(false | true);

        System.out.println("--------------");

        // 3. ^ 逻辑异或
        // 相同为false，不同为true
        System.out.println(true ^ true);
        System.out.println(false ^ false);
        System.out.println(true ^ false);
        System.out.println(false ^ true);

        System.out.println("--------------");

        // 4. ！ 逻辑非  取反
        // 取反的感叹号不要写多个，要么不写，要么只写一次
        System.out.println(!false);
        System.out.println(!true);
    }
}

```



#### Java的短路逻辑运算符



| 符号 | 作用   | 说明                            |
| ---- | ------ | ------------------------------- |
| &&   | 短路与 | 结果和 `&` 相同，但是有短路效果 |
| \|\| | 短路或 | 结果和 `|` 相同，但是有短路效果 |



- 范例

```java
package org.yexiaonan;

public class ShortCircuitLogicalOperators {
    public static void main(String[] args) {
        // 1. &&
        // 运行结果跟单个&是一样的
        // 表示两边都是真，结果才是真
        System.out.println(true && true);
        System.out.println(false && false);
        System.out.println(false && true);
        System.out.println(true && false);

        System.out.println("--------------");

        // 2. ||
        // 运行结果跟单个 | 是一样的
        // 表示两边都是假，结果才是假（只要有一个真，结果就是真）
        System.out.println(true || true);
        System.out.println(false || false);
        System.out.println(false || true);
        System.out.println(true || false);

        System.out.println("--------------");

        // 3.短路运算符具有短句效果
        // 简单理解：当左边的表达式可以确定最终的结果，右边的表达书就不会运行了
        int a = 10;
        int b = 10;
        boolean result = ++a < 5 && ++b <5;
        System.out.println(result);
        System.out.println(a);
        System.out.println(b);
    }
}

```



#### Java的三元运算符

- 格式：关系表达式？表达式1：表达式2；
- 范例：求两个数的较大值



```java
int max = a > b ? a : b;
System.out.println(a > b ? a : b)
```



- 范例

```java
package org.yexiaonan;

public class SanYuanYunSuanFu {
    public static void main(String[] args) {
        int number1 = 10;
        int number2 = 20;

        int number = number1 > number2 ? number1 : number2;
        System.out.println(number);

        System.out.println(number1 > number2 ? number1 : number2);
    }
}

```



- 范例2

```java
import java.util.Scanner;

public class TwoTagger {
    public static void main(String[] args) {
        /*
        /需求：
        动物园里面有两只老虎，体重分别通过键盘录入获得
        请用程序实现判断两只老虎的体重是否相同
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一只老虎的体重：");
        int FristTagger = scanner.nextInt();

        System.out.println("请输入第二只老虎的体重：");
        int TwoTagger = scanner.nextInt();

        String result = FristTagger == TwoTagger ? "相同" : "不同";
        System.out.println(result);
    }
}

```





#### Java的运算符优先级



在 Java 中，运算符的优先级决定了在没有括号的情况下，表达式中各个运算符的执行顺序。了解运算符优先级可以帮助我们正确地编写和理解代码。

以下是 Java 中运算符的优先级表，从高到低排列（优先级越高，越先执行）：

| 优先级等级 | 运算符类型 | 运算符                                                       | 结合性   |
| ---------- | ---------- | ------------------------------------------------------------ | -------- |
| 1          | 括号       | `()`                                                         | 从左到右 |
| 2          | 后缀       | `expr++`, `expr--`                                           | 从左到右 |
| 3          | 一元运算   | `++expr`, `--expr`, `+`, `-`, `~`, `!`                       | 从右到左 |
| 4          | 乘除余     | `*`, `/`, `%`                                                | 从左到右 |
| 5          | 加减运算   | `+`, `-`                                                     | 从左到右 |
| 6          | 移位运算   | `<<`, `>>`, `>>>`                                            | 从左到右 |
| 7          | 比较       | `<`, `<=`, `>`, `>=`, `instanceof`                           | 从左到右 |
| 8          | 相等性     | `==`, `!=`                                                   | 从左到右 |
| 9          | 按位与     | `&`                                                          | 从左到右 |
| 10         | 按位异或   | `^`                                                          | 从左到右 |
| 11         | 按位或     | `|`                                                          | 从左到右 |
| 12         | 逻辑与     | `&&`                                                         | 从左到右 |
| 13         | 逻辑或     | `||`                                                         | 从左到右 |
| 14         | 条件运算   | `? :`                                                        | 从右到左 |
| 15         | 赋值运算   | `=`, `+=`, `-=`, `*=`, `/=`, `%=`, `<<=`, `>>=`, `>>>=`, `&=`, `^=`, `|=` | 从右到左 |
| 16         | 逗号       | `,`                                                          | 从左到右 |

---

##### 说明



1. **括号优先级最高**：表达式中的括号 `()` 总是最先执行。
   ```java
   int result = (2 + 3) * 4; // 括号先执行，结果为 20
   ```
2. **后缀操作优先级高于前缀**：后缀递增 `i++` 的优先级高于前缀递增 `++i`。
   ```java
   int i = 5;
   System.out.println(i++ + ++i); // 5 + 7 = 12
   ```
3. **算术运算符优先级**：乘法 `*` 和除法 `/` 的优先级高于加法 `+` 和减法 `-`。
   ```java
   int result = 2 + 3 * 4; // 等价于 2 + (3 * 4)，结果为 14
   ```
4. **逻辑运算**：
   - `&&` 的优先级高于 `||`。
   - 逻辑表达式建议使用括号明确顺序。
   ```java
   boolean result = true || false && false; // 等价于 true || (false && false)，结果为 true
   ```
5. **条件运算符**：`? :` 的优先级低于算术和比较运算。
   ```java
   int x = 5;
   int y = (x > 0) ? x * 2 : x - 2; // 判断 x > 0，然后执行 x * 2
   ```

---

##### 使用建议

- **尽量使用括号明确优先级**：虽然理解优先级规则很重要，但为提升代码可读性，建议通过括号显式指定表达式的计算顺序。
- **复杂逻辑用分步拆解**：对于包含多层运算符的表达式，分步骤计算会更直观且易于调试。



- 范例：

```java
package org.yexiaonan;

public class OperatorPrecedence {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        // 如果在表达中需要先计算哪一个的值，就需要在输出中为他们两个添加一个小括号括起来，这样就会优先计算小括号里面的内容
        System.out.println(a + (b * c));
    }
}

```







#### Java的原码，反码，补码

- 原码：
  - 十进制数据的二进制表现形式，最左边是符号位，0为证，1为负
- 反码：
  - 正数的补码是其本身，负数的反码是符号位保持不变，其余 位取反
- 补码：
  - 正数的补码是其本身，负数的补码是在其反码的基础上+1





