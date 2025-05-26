## Java基础

> 痛定思痛，在之前的学习Java过程中感觉之前学习的都没有很理解，因为之前看的是某马程序员的课程，前面还好，到后面感觉不怎么理解了。所以说就打算重新来学习一遍Java，本次课程看的是韩老师的课程编写。

在本文档中，你将会学习到Java的一些基础语法，以及一步一步深入Java语言的学习！

----
### Java的重要特点
 1.Java语言是面向对象的（oop）

 2.Java语言是健壮的

 3.Java语言是跨平台的【即：一个平台写好可以分发到其他平台运行，无需二次处理】

 4.Java语言是解释型的
 解释型语言，编译后的代码不能直接被机器运行，需要解释器来执行，编译型语言，编译后的代码，可以直接被机器执行。

### Java运行机制以及运行过程

- Java核心机制 - Java虚拟机【Jvm Java Virtual Machine】
  - 1）JVM是一个虚拟的计算机，具有指令集并使用不同的存储区域。负责执行指令，管理数据，内存，寄存器，包含在JDK中。
  - 2）对于不同的平台，有不同的虚拟机
  - 3）Java虚拟机机制屏蔽了底层运行平台的差异，实现了“一次编译，到处运行”

### Java中JDK和JRE的区别

- JDK 基本介绍
  - JDK（Java Development Kit `Java开发工具包`）
  - JDK = JRE + Java的开发工具 [Java，Javac，JavaDoc，JavaP等]
  - JDK是提供给Java开发人员使用的，其中包含了Java的开发工具，也包括了JRE。所以安装了JDK就不用安装JRE了。
- JRE 基本介绍
  - JRE （Java Runtime Environment `Java运行环境`）
  - JRE = JVM + Java核心类库[类]
  - 包括Java虚拟机（JVM Java Virtual Machine）和Java所需的核心类库等，如果想要运行一个开发好的Java程序（Test.class）计算机中只需要安装JRE即可。
- JDK，JRE和JVM的包含关系
  - JDK = JRE + 开发工具集 （例如javac，java编译工具等）
  - JRE = JVM + Java SE标准类库（Java核心类库）
  - 提一嘴，在生产环境中。可能你的组员并不使用JDK来编写代码文件，那么你的组员就只需要安装JRE（JVM Java虚拟机）即可。

### Java开发注意事项细节说明

1.Java源文件以.java为扩展名。源文件的额基本组成部分是类（class）

2.Java程序的执行入口是main()方法。具有固定的书写格式

3.Java语言严格区分大小写。

4.Java方法由一条条的语句构成，每个语句以“;”结束

5.大括号都是承兑出现的，缺一不可。

6.一个源文件中最多只能有一个public类。其他类个数不限。

7.如果源文件包含一个public类，则该文件必须按照该类名来命名。

8.一个源文件中最多只能有一个public类，其他类的个数不限，也可以将main方法写在非public类中，然后指定非public类运行，这样入口的方法的就是非public的main方法

### Java常用的转义字符
1）\t：一个制表位，实现对齐功能

2）\n：换行符

3）\\：一个\

4）\"：一个"

5）\'：一个'

6）\r：一个回车 System.out.println("HelloWorld\r南宁")

### Java文档注释
> 在Java中，注释有三种，分别是单行注释，多行注释，文档注释

```java
// 我是单行注释
```

```java
/*
我是多行注释
 */
```

```java
/**
 * 我是文档注释
 */
```
### Java代码规范
1. 类，方法的注释，要以JavaDoc的方式
2. 非Java Doc的注释，往往是给代码的维护者看的，着重告诉读者为什么这样写，如何修改，注意什么问题等
3. 使用Tab操作，实现缩进，默认整体向右移动，时候使用Shift+Tab整体向左移
4. 运算符和 = 两边习惯性各加一个空格。比如：2+4*5+345-89
5. 源文件使用utf-8编码
6. 行宽度不要超过80字符
7. 代码编写次行风格和尾行风格

### Java基本数据类型转换
- 介绍
  - 当Java程序在进行赋值或者运算时，精度小的类型自动转换为精度大的数据类型，这个就是`自动类型转换`
- 数据类型按照精度（容量）大小排序为

`char` > `int` > `long` > `float` > `double`

`byte` > `short` > `int` > `long` > `float` > `double`

![Java数据类型](../image/JavaChar.png)

- 自动类型转换注意细节

1. 有多种类型的数据混合运算时，系统首先自动将所有数据转换成容量大的数据类型，然后再进行计算。
2. 当我们把精度大的数据类型赋值给小的数据类型时，就会报错，反之将会进行自动类型转换
3. （byte，short）和char之间不会相互自动转换
4. byte，short，char他们三者可以计算，在计算时首先转换为int类型
5. Boolean不参与转换！！！
6. 自动提升原则：表达式结果的类型自动提升为 操作数中的最大类型


- 强制类型转换

- 自动类型转换的逆过程，将容量大的数据类型转换为容量小的数据类型。使用时要加上强制转换符号（），但可能造成精度降低或者溢出，格外注意！！！

**案例**

```java
public class ForceConvert {
  public static void main(String[] args) {
    int i = (int)1.9;
    System.out.println(i);

    int j = 100;
    byte b1 = (byte)j;
    System.out.println(b1);
  }
}
```

强制类型转换细节说明：

  1.当进行数据的大小从 大———>小，就需要使用到强制类型转换
  2.强制转换符号只针对与最近的操作数有效，往往会使用小括号提升优先级
 ```java
 public class ForceConvertDetail {
  public static void main(String[] args) {
    // 如果需要对多种数据进行求和，需要使用（）来提升计算的优先级，然后才能进行编译。
    // 例如像下方的代码就是无法运行的，因为其最终得到的数据类型与赋值数据类型不相符
    //int x = (int)10*3.5+6*1.5;
    
    // 正确写法：
    int x = (int)(10*3.5+6*1.5);
    System.out.println(x);
  }
}
 ```
   3.char类型可以保存int的常量值，但不能保存int的变量值，需要强转
 ```java
 public class ForceConvertDetail {
  public static void main(String[] args) {
    char c1 = 100;
    int m = 100;

    // char 只能保存常量，不能覆盖变量值
    char c2 = m; // Error
    // 强制类型转换
    char c3 = (char)m; // OK

  }
}

 ```
  4.byte和short类型在进行运算时，当作int类型处理



### Java内置数据类型
> Java语言提供了八种基本类型。六种数字类型（四个整数型，两个浮点型），一种字符类型，还有一种布尔型。

- byte：
byte 数据类型是8位、有符号的，以二进制补码表示的整数；
最小值是 -128（-2^7）；
最大值是 127（2^7-1）；
默认值是 0；
byte 类型用在大型数组中节约空间，主要代替整数，因为 byte 变量占用的空间只有 int 类型的四分之一；
例子：byte a = 100，byte b = -50。


- short：
short 数据类型是 16 位、有符号的以二进制补码表示的整数
最小值是 -32768（-2^15）；
最大值是 32767（2^15 - 1）；
Short 数据类型也可以像 byte 那样节省空间。一个short变量是int型变量所占空间的二分之一；
默认值是 0；
例子：short s = 1000，short r = -20000。


- int：
int 数据类型是32位、有符号的以二进制补码表示的整数；
最小值是 -2,147,483,648（-2^31）；
最大值是 2,147,483,647（2^31 - 1）；
一般地整型变量默认为 int 类型；
默认值是 0 ；
例子：int a = 100000, int b = -200000。


- long：
long 数据类型是 64 位、有符号的以二进制补码表示的整数；
最小值是 -9,223,372,036,854,775,808（-2^63）；
最大值是 9,223,372,036,854,775,807（2^63 -1）；
这种类型主要使用在需要比较大整数的系统上；
默认值是 0L；
例子： long a = 100000L，long b = -200000L。
"L"理论上不分大小写，但是若写成"l"容易与数字"1"混淆，不容易分辩。所以最好大写。


- float：
float 数据类型是单精度、32位、符合IEEE 754标准的浮点数；
float 在储存大型浮点数组的时候可节省内存空间；
默认值是 0.0f；
浮点数不能用来表示精确的值，如货币；
例子：float f1 = 234.5f。


- double：
double 数据类型是双精度、64 位、符合 IEEE 754 标准的浮点数；
浮点数的默认类型为 double 类型；
double类型同样不能表示精确的值，如货币；
默认值是 0.0d；
```
例子：

double   d1  = 7D ;
double   d2  = 7.;
double   d3  =  8.0;
double   d4  =  8.D;
double   d5  =  12.9867;
7 是一个 int 字面量，而 7D，7. 和 8.0 是 double 字面量。 
```


- boolean：
boolean数据类型表示一位的信息；
只有两个取值：true 和 false；
这种类型只作为一种标志来记录 true/false 情况；
默认值是 false；
例子：boolean one = true。


- char：
char 类型是一个单一的 16 位 Unicode 字符；
最小值是 \u0000（十进制等效值为 0）；
最大值是 \uffff（即为 65535）；
char 数据类型可以储存任何字符；
例子：char letter = 'A';。


- 基本数据类型和String类型的转换
  - 介绍
    - 在程序开发中，我们经常需要将数据类型转换成String类型。或者将String类型转换成基本的数据类型。
  - 基本类型转String类型
    - 语法：将基本的数据类型的值 + "" 即可
 ```java
public class StringToBasic {
  public static void main(String[] args){
    // 基本数据类型 ——> String
    int n1 = 100;
    float f1= 100F;
    double d1 = 5.5;
    boolean b1 = false;


    String s1 = n1 + "";
    String s2 = f1 + "";
    String s3 = d1 + "";
    String s4 = b1 + "";

    System.out.println(s1+s2+s3+s4);


  }
}
 ```
  - String类型转基本数据类型
    - 语法：通过基本类型的包装类调用parseXX方法即可
```java
public class StringToBasic {
  public static void main(String[] args){
    // String——>转换基本类型
    String s5 = "123";

    // 一学就会，使用ParseXX转换
    int sum = Integer.parseInt(s5);
    float sum2 = Float.parseFloat(s5);
    double sum3 = Double.parseDouble(s5);
    long sum4 = Long.parseLong(s5);
    byte sum5 =  Byte.parseByte(s5);
    boolean sum6 = Boolean.parseBoolean("true");

    System.out.println(sum6);
  }
}
```



### Java算数运算符

- **目录**

- [运算符介绍](#运算符介绍)

- [算术运算符](#算术运算符)

- [关系运算符](#关系运算符)

- [逻辑运算符](#逻辑运算符)

- [赋值运算符](#赋值运算符)

- [三元运算符](#三元运算符)

- [运算符优先级](#运算符优先级)

----

#### 运算符介绍

- 运算符介绍

运算符是一种特殊的符号，用于表示数据的运算，赋值和比较等



#### 算术运算符

- 介绍

算术运算符是对数值类型的变量进行运算的，在Java程序中使用的非常多

![1747657194686.png](https://img.picui.cn/free/2025/05/19/682b21ea76b6b.png)

- % 取模看作一个公式
- a % b = a - a / b * b

自增：++

作为独立语句使用：

前++和后++都完全等价于 i = i + 1;

作为表达式使用

  前++：++i先自增后赋值

  后++：i++先赋值后自增
#### 关系运算符
- 介绍

 1.关系运算符的结果都是boolean类型，也就是要么是true，要么是false

 2.关系表达式 经常用在if结构的条件中或者循环结构的条件中

![1747702636580.png](https://img.picui.cn/free/2025/05/20/682bd36b18c26.png)

- 细节说明

1.关系运算符组成的表达式，我们称之为关系表达式 a > b

2.比较运算符“==”不能误写为“=”
#### 逻辑运算符
- 介绍
用于链接多个条件（多个关系表达式），最终的结果也是一个boolean类型

![1747703116066.png](https://img.picui.cn/free/2025/05/20/682bd54c10bc0.png)

- && 与 & 基本规则

| 名称     | 语法           | 特点                         |
| -------- | -------------- | ---------------------------- |
| 短路与&& | 条件1 && 条件2 | 两个条件都为true，结果为true |
| 逻辑与&  | 条件1&条件2    | 两个条件都为true，结果为true |



- && 与 &的区别

1.&&短路与：如果第一个条件为false，则第二个条件不会被判断，最终结果为false，效率高

2.&逻辑与：不管第一个条件是否为false，第二个条件都要判断，效率低

3.开发中，基本使用效率最高的&&

#### 赋值运算符
- 介绍

赋值运算符就是将某个运算后的值，赋给指定的变量

- 赋值运算符的分类

✔基本赋值运算符 = 

✔复合赋值运算符 +=,-=,*=,/=,%=等

- 例如

a += b; [等价于 a = a + b]

a -= b; [等价于 a = a - b]

- 赋值运算符的特点

1. 赋值顺序从右往左 int sum = a + b + c
2. 赋值运算符额左边，只能是变量，右边可以是变量，表达式，常量值 int num = 20 
3. 复合赋值运算符等价于 a += 3 ; a = a + 3
4. 复合赋值运算符会进行类型转换

byte b = 2 ; b += 3; b++

#### 三元运算符

- 基本语法

条件表达式？表达式1：表达式2；

- 运算规则

1.如果条件表达式为true，运算后的结果是表达式1

2.如果条件表达式为false，运算后的结果是表达式2

口诀：[一真大师]

#### 运算符优先级

- 运算符有不同的优先级，所谓优先级就是表达式运算中运算顺序。
- 只有单目运算符，赋值运算符是从右向左运算的。



### Java标识符命名规则和规范





- 运算符有不同的优先级，所谓优先级就是表达式运算中运算顺序。
- 只有单目运算符，赋值运算符是从右向左运算的。



### Java标识符命名规则和规范

- 标识符概念
1. Java对各种变量，方法和类等命名时使用的字符序列称为标识符
2. 凡是自己可以起名字的地都叫标识符

- 标识符的命名规则（必须遵守）
1. 由26个英文字母大小写组成，0-9，_或$组成
2. 数字不可以作为开头
3. 不可以使用关键字或者保留字，但能包含关键字和保留字
4. Java中严格区分大小写，长度无限制
5. 标识符不包含空格

- 标识符命名规范
1. 包名：多单词组成时所有字幕都小写；aaa.bbb.ccc
2. 类名：接口名：多单词组成时，所有单词的首字母大写；ArrayList
3. 变量名，方法名：多单词组成时，第一个单词首字母小写，第二个单词开始每个单词首字母大写：studentManager
4. 常量名：所有字幕都大写，多个单词拼接时，每个单词用下划线链接；SCHOOL_TEACHER_SUM


### JavaScanner的使用

> 在Java中没有类似Python的input语句，我们只能使用官方java.util的库来完成这个操作。

首先导入Scanner

```java
import java.util.Scanner;

Scanner sc = new Scanner(System.in);

public static void main(String[] args) {
  // 引导用户输入
  System.out.println("请输入您的名字：");
  String name = sc.next();
  // 将用户输入的名字存储在“name”变量中，这个变量是String类型，并且 next() 也是接受String类型。
}


```

### Java进制
- 进制介绍
对于整数，有四种表达方式：
1. 二进制：0,1 满二进一，以0b或者0B开头
2. 十进制：0-9 满十进一
3. 八进制：0-7 满八进一 以数字0开头表示
4. 十六进制：0-9及A(10)-F(15) 满16进一.以0x或0X开头表示

- 进制的转换

![1747874848160.png](https://img.picui.cn/free/2025/05/22/682e741d5e232.png)
![1747875063472.png](https://img.picui.cn/free/2025/05/22/682e74f472648.png)

- 二进制在运算中的说名
1. 二进制是逢2进位的位进制，0  1 是基本算符。
2. 现代的电子计算机技术全部采用的是二进制，因为它使用0，1两个数字符号，非常简单方便，易于用电子方式实现。计算机内部处理的信息，都是采用二进制数来表示。二进制（Binary）数用0和1两个数字及其组合来表示任何数。位进规则是“逢2进1”，数字1在不同的位上代表不同的值，按从右至左的次序，这个值以二倍递增。


### Java原码，反码，补码

- 对于有符号的而言：
1. 二进制的最高位是符号位：0表示正数，1表示负数（口诀：0-> 0 1 -> -）
2. 正数的原码，反码，补码都一样（三码合一）
3. 负数的反码=它的原码符号位不变，其他位取反（0-> 1 , 1 -> 0）
4. 负数的补码=他的反码+1，负数的反码=负数的补码-1
5. 0的反码，补码都是0
6. Java没有无符号数，换言之，java中的数都是有符号的
7. 在计算机运算的时候，都是以补码的方式来运算的
8. 当我们看运算结果的时候，要看他的原码

- 运算符有不同的优先级，所谓优先级就是表达式运算中运算顺序。
- 只有单目运算符，赋值运算符是从右向左运算的。



### Java程序控制结构

#### JavaIf判断语句

1）单分支

- 基本语法
```java
public if01 {
if(条件表达式){
    执行代码;(可以有多条语句)
}
}
```
> 当条件表达式里面的内容为true，则会执行{}里面的代码。如果为false则不执行
> 
> 特别说明：如果{}中只有一条语句，则可以不加上{}，建议写上{}

2）双分支
- 基本语法
```java
public if02 {
if(条件表达式){
    执行代码;(可以有多条语句)
}else{
    执行代码;(可以有多条语句)
}
}
```
> 当条件表达式里面的内容为true，则会执行{}里面的代码。如果为false则执行else{}里面的语句
>


3）多分支
- 嵌套分支
在一个分支结构中又完整的嵌套了另一个完整的分支结构，里面的分支结构称为内层分支，外面的结构称为外层分支。（不要超过三层！可读性较差）

- 基础语法
```java
        if (){
        if (){

        }else {

        }
        }
```



#### JavaSwitch语句

- 从多个要执行的代码块中选择一个来执行，实例

```java
switch(expression) {
  case x:
    // 代码块
    break;
  case y:
    // 代码块
    break;
  default:
    // 代码块
}
```

工作原理:

- `switch` 表达式计算一次
- `case` 将表达式的值与每种情况的值进行比较
- 如果存在匹配项，则执行关联的代码块



`break` 中断关键字：

当Java 达到中断关键字时，它会脱离`break` 。

这将停止在块内执行更多代码和案例测试。

当找到匹配项，工作完成后就结束。没有必要进行更多的测试。

>  `break` 中断可以节省大量执行时间，因为它忽略"switch"中所有其余代码的执行。



`default` 关键字

> `default` 关键字指定在没有大小写匹配时默认要运行的一些代码:

```java
package org.code;

public class SwitchOperator {
    public static void main(String[] args) {
        int day = 4;
        switch (day) {
            case 6:
                System.out.println("Today is Saturday");
                break;
            case 7:
                System.out.println("Today is Sunday");
                break;
            default:
                System.out.println("Looking forward to the Weekend");
        }
        // 输出 "Looking forward to the Weekend",因为都不匹配
    }
}

```



#### JavaWhile循环语句

只要达到指定的条件，循环就可以执行代码块。

循环很方便，因为它们节省时间，减少错误，并且使代码更具可读性。

- 只要指定的条件为 真`True`，`while` 循环就会遍历代码块:

```java
while (condition) {
  // 要执行的代码块
}
```

![](https://www.w3ccoo.com/wp-content/uploads/java/java_while_loop.jpg)

在下面的示例中，只要变量 **i** 小于5，循环中的代码就会反复运行:

```java
package org.code;

public class WhileOperator {
    public static void main(String[] args) {
        int i = 0;
        while (i < 5){
            System.out.println(i);
            i++;
        }
    }
}

```



#### Java Do/While循环语句

`do/while`是`while`中的一个变体，在检查条件是否为真之前，这个循环将执行一次代码块，然后只要条件为真，他就会重复循环。

```java
do {
  // 要执行的代码块
}
while (condition);
```

![](https://www.w3ccoo.com/wp-content/uploads/java/java_dowhile_loop.png)

下面的示例使用`do/while`循环。即使条件为false，循环也将始终至少执行一次，因为代码块是在测试条件之前执行的:

```java
package org.code;

public class WhileOperator {
    public static void main(String[] args) {
        int i = 0;
        do {
            System.out.println(i);
            i++;
        }
        while (i < 5);
    }
}

```



#### JavaFor循环

- 当确切地知道要在代码块中循环多少次时，请使用`for`循环而不是`while`循环:

```java
for (statement 1; statement 2; statement 3) {
  // 要执行的代码块
}
```

**语句 1** 在执行代码块之前执行（一次）。

**语句 2** 定义执行代码块的条件。

**语句 3** （每次）在代码块执行之后执行。

下面的示例将打印数字0到4:

```java
package org.code;

public class ForOperator {
    public static void main(String[] args) {
        for (int i = 0; i < 5;i++  ){
            System.out.println(i);
        };
    }
}

```

语句1在循环开始之前设置一个变量(`int i = 0`)。

语句2定义了循环运行的条件（`i`必须小于`5`）。如果条件为真`true`，循环将重新开始，如果条件为假`false`，循环将结束。

语句3每次执行循环中的代码块时都增加一个值(`i++`)。

- 查找0~10中出现的偶数值

```java
for (int i = 0; i < 11; i = i + 2){
    System.out.println(i);
}
```



#### JavaFor-Each 循环

`for-each`循环，它专门用于循环数组**array**中的元素:

```java
for (type variableName : arrayName) {
  // 要执行的代码块
}
```

以下示例使用`for-each`循环输出**cars** 数组中的所有元素:

```java
package org.code;

public class ForEach {
    public static void main(String[] args) {
        String[] cas = {"MuGay","LaoMuGay","YoungMuGay","SiMuGay"};
        for (String i : cas){
            System.out.println(i);
        }
    }
}

```



#### Java Break 和 Continue 语句

`break` 语句也可以用于跳出循环。

以下实例当i等于4时，跳出循环:

```java
package org.code;

public class BreakIntroduce {
    public static void main(String[] args) {
        // 初始化循环变量i为0，循环条件是i小于10，每次循环后i自增1
        for (int i = 0; i < 10; i++) {
            // 当i等于4时
            if (i == 4) {
                // 跳出当前for循环
                break;
            }
            // 输出变量i的值
            System.out.println(i);
        }
    }
}
```

如果指定的条件发生时， `continue` 语句将中断一个迭代（在循环中），并继续循环中的下一次迭代。

此示例跳过值`4`:

```java
package org.code;

public class JavaContinue {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                continue;
            }
            System.out.println(i);
        }
    }
}

```

- 在While循环中使用 Break 和 Continue

你也可以在while循环中使用 `break` 和`continue`:

```java
//Break 实例
int i = 0;
while (i < 10) {
  System.out.println(i);
  i++;
  if (i == 4) {
    break;
  }
}
```

```java
//Continue 实例
int i = 0;
while (i < 10) {
  if (i == 4) {
    i++;
    continue;
  }
  System.out.println(i);
  i++;
}
```



### Java数学方法

```java
        // Math.max (查找x和y的最大值)
        System.out.println(Math.max(6,7));

        // Math.min (查找x和y的最小值)
        System.out.println(Math.min(4,3));

        // Math.sqrt(x) 方法返回x的平方根
        System.out.println(Math.sqrt(7));

        //Math.abs(x) 方法返回 x 的绝对（正）值
        System.out.println(Math.abs(-5.7));

        //Random Numbers
        //Math.random() 返回一个介于0.0（包括）和1.0（不包括）之间的随机数
        System.out.println(Math.random());
        //如何更好地利用随机数，例如，需要一个介于0和100之间的随机数，可以使用以下公式:
        int randomNum = (int)(Math.random() * 101);
        System.out.println(randomNum);
```



### Java布尔值

- 通常，在编程中需要数据类型只能是两个值中间的一个，如：
  - YES/NO
  - ON/OFF
  - TRUE/FALSE
- 为此，Java有一个`boolean`数据类型，可以接受true或者false值

```java
package org.code;

public class BooleanOperator {
    public static void main(String[] args) {
        boolean t = true;
        boolean f = false;
        System.out.println(t);
        System.out.println(f);
    }
}
```



- 布尔表达式

  - 布尔表达式 **Boolean expression** 是返回布尔值的 Java 表达式:: `true` or `false`.

    可以使用比较运算符（如大于(`>`)运算符）来确定表达式（或变量）是否为真:

```java
int x = 10;
int y = 9;
System.out.println(x > y); // 返回 true，因为 10 高于 9
```

或者，使用`==`也可以表示对应的意思

```java
int x = 10;
System.out.println(x == 10); // 返回 true，因为 x 的值等于 10
```





### Java数组

- 数组用于在单个变量中存储多个值，而不是为每个值声明单独的变量
- 声明数组的方式
  - 使用**方括号**定义变量类型

```java
String[] cars;
```



- 如果需要向其插入值，可以使用数组文字-将值放在逗号分割的列表中，放在大括号内

```java
String[] cars = {"Gay","MuGuan"}
```



- 如果需要创建整数数组，可以这样子写

```java
int[] sum = {1,0,2,3,4,5}
```



##### 访问数组元素

```java
String[] cars = {"Gay","MuGuan"}
System.out.println(cars[0])
// 输出“Gay”
// 注释: 数组索引从0开始，[0]开头是第一个元素，[1] 是第二个元素。
```



##### 更改数组元素

- 如果需要更改特定元素的值，参考索引编号

```java
package org.code;

public class ArrayTest01 {
    public static void main(String[] args) {
        String[] cars = {"Gay","MuGay","MuG","MuMu"};
        
        // 将数组中的第一个元素修改为“GayP”
        cars[0] = "GayP";
        System.out.println(cars[0]);
    }
}
```



##### 数组长度

- 要了解一个数组中有多少个值，可以在println中使用.length方法

```java
package org.code;

public class ArrayLength {
    public static void main(String[] args) {
        String[] cars = {"Gay","MuGay","MuG","MuMu"};
        System.out.println(cars.length);
        // 输出 4
    }
}
```



##### 使用For循环遍历数组

- 可以使用for循环遍历数组元素，并使用Length属性执行循环运行次数
- 输出`cars`数组中的所有元素

```java
package org.code;

public class ArrayFor {
    public static void main(String[] args) {
        // 声明一个名为cars的字符串数组，并进行初始化，数组包含4个字符串元素
        String[] cars = {"Gay", "MuGay", "MuG", "MuMu"};
        // 使用for循环遍历cars数组
        for (int i = 0; i < cars.length; i++) {
            // 在控制台打印数组cars中索引为i的元素
            System.out.println(cars[i]);
        }
    }
}
```



##### 使用For-Each循环遍历数组

- 还有一个"**for-each**"循环，专门用于循环数组中的元素:

```java
for (type variable : arrayname) {
  ...
}
```



- 使用`for-each`遍历循环输出**cars**数组中的所有元素:

```java
package org.code;

public class ArrayForEach {
    public static void main(String[] args) {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : cars) {
            System.out.println(i);
        }
    }
}
```

##### 多堆数组
- 多堆数组是包含一个或多个数组的数组
- 要创建二维数组，，将每个数组添加到其自己的**花括号**集中

```java
int[][] myNums = {{1,2,3,4},{5,6,7,8}};
```

myNums 现在是一个包含两个数组元素的数组。

要访问myNums数组的元素，请指定两个索引:一个用于数组，另一个用于该数组内的元素。此示例访问MyNumber的第二个数组(1)中的第三个元素(2):

```java
public class Array2D {
    public static void main(String[] args) {
        int[][] MyNums = { {1, 2, 3, 4}, {5, 6, 7} };
        int x = MyNums[1][2];
        System.out.println(x);
    }
}
```

我们还可以在另一个for loop循环中使用for loop 循环来获取二维数组的元素（我们仍然必须指向两个索引）:

## Java方法

- `method`是一个代码块，只能在运行时调用。

可以将数据（称为参数）传递到方法中
方法用于执行某些操作，它们也被称为**函数**

> 为什么使用方法？代码重复：定义一次性代码，然后多次使用

#### 创建一个Java方法
```java
public class MyClass {
  static void myMethod(){
    // 要执行的代码
  }
}
```

**实例解析**
- `myMethod()` 是方法的名称
- `static` 意味着该方法属于MyClass类，而不是MyClass类的对象。
- `void` 表示此方法没有返回值。



##### 方法调用

- 要在Java中调用方法，编写该方法的名称，后跟两个()和;
- 下面实例，调用`myMethod()`用于打印文本操作

```java
package org.code;

public class MyClass {
    static void myMethod(){
        System.out.println("I am MuGay!");
    }

    public static void main(String[] args) {
        myMethod();
    }
}

```

输出：

```bash
D:\develop\JDK17\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.2.3\lib\idea_rt.jar=14760" -Dfile.encoding=UTF-8 -classpath D:\TestCode\Java\JavaCode\target\classes org.code.MyClass
I am MuGay!

进程已结束，退出代码为 0
```

- 一个方法可以被多次调用:

```java
package org.code;

public class MyClass {
    static void myMethod(){
        System.out.println("I am MuGay!");
    }

    public static void main(String[] args) {
        myMethod();
        myMethod();
        myMethod();
        myMethod();
    }
}

```





### Java方法中的参数

**形参与实参**

信息可以作为参数传递给方法。参数在方法中充当变量。

它们在方法名称后的括号内指定。可以添加多个参数，只需用逗号分隔即可。

下面的示例有一个方法，该方法将名为**fname**的`string`字符串作为参数。 调用方法时，我们传递一个名字，该名字在方法内部用于打印全名:

```java
package org.code;

public class MyClass1 {
    static void myMethod(String fname){
        System.out.println(fname + " Refsnes");
    }

    public static void main(String[] args) {
        myMethod("MyGay");
        myMethod("LaoMuMu");
        myMethod("Gay!");
    }
}

// 简单理解
package org.code;

public class MyMethodTest {
    // 定义一个方法（print）
    static void print (String output){
        // 指定这个方法中的用途
        System.out.println(output);
    }

    // 编写Main入口
    public static void main(String[] args) {
        print("我是输出语句");
    }
}

```



> 当参数**parameter**被传递给方法时，它被称为实参（**argument**）。因此，从上面的例子来看:`fname`是一个参数，而`MuGay`, `LaoMuMu` 和 `Gay!` 是实参。



##### 多个参数

可以在传递参数时传递多个参数：

```java
package org.code.develop;

/**
 * 这是一个用于演示方法定义和调用的示例类。
 * 该类包含一个静态方法t2，用于打印人员的姓名和年龄信息，
 * 并在main方法中展示了如何调用该方法。
 */
public class MyMethodTest1 {
    /**
     * 静态方法t2用于打印人员的姓名和年龄信息。
     * 该方法不返回任何值，直接将信息输出到控制台。
     * 
     * @param name 要打印的人员姓名，字符串类型
     * @param age  要打印的人员年龄，整数类型
     * 
     * @示例
     * t2("Alice", 25); // 控制台输出：姓名：Alice年龄：25
     * 
     * @注意
     * 1. 该方法不会对输入的姓名和年龄进行有效性检查
     * 2. 年龄参数应为合理的整数值，否则输出可能不符合预期
     * 3. 输出格式中姓名和年龄之间没有分隔符，调用时需注意
     */
    static void t2 (String name, int age) {
        System.out.println("姓名：" + name + "年龄：" + age);
    }

    /**
     * 程序的主入口点。
     * 创建并初始化对象，调用t2方法展示其功能。
     * 
     * @param args 命令行参数，在本程序中未使用
     */
    public static void main(String[] args) {
        // 调用t2方法，传入姓名"MuMu"和年龄18
        t2("MuMu", 18);
    }
}
```



> 请注意，使用多个参数时，方法调用的参数数必须与参数数相同，并且参数的传递顺序必须相同。
>
> 字面意思，很好理解(*^_^*)。



##### 返回值

上面示例中使用的`void`关键字表示该方法不应返回值。如果希望方法返回值，可以使用基本数据类型（如`int` 或`double`）而不是`void`，并在方法内使用`return`关键字:

> 我们可以把 Java 中的方法想象成一个 “小工人”，这个 “小工人” 能帮你做一件特定的事情。而方法前面的返回类型（比如`void`、`int`、`double`），就像是你对这个 “小工人” 的要求：
>
> - **如果方法返回类型是`void`**：
>   就相当于你对 “小工人” 说：“你去帮我做一件事（比如打扫房间、打印文件），做完就行，不用给我带任何东西回来。”
>   所以`void`类型的方法不需要`return`返回值，它只负责执行任务。
> - **如果方法返回类型是`int`、`double`等**：
>   就相当于你对 “小工人” 说：“你去帮我做一件事（比如数苹果、算平均数），做完后把结果（比如苹果数量、平均数）带回来给我。”
>   这时方法必须用`return`语句返回一个对应类型的值（比如`int`、`double`），否则就像 “小工人” 没完成你的要求，会报错。

```java
package org.code.develop.Method;

// 这是一个用于演示自定义方法定义与调用的类
public class MyMethodTest3 {
    // 定义一个静态方法myMethon，接收一个int类型的参数x
    // 该方法的功能是对传入的参数x进行简单运算，返回5加上x的结果
    static int myMethon(int x) {
        return 5 + x;
    }

    public static void main(String[] args) {
        // 调用myMethon方法，并传入参数3
        // 将方法调用的返回值作为参数传递给System.out.println方法，用于在控制台打印输出
        System.out.println(myMethon(3));
    }
}
```



- 此示例返回方法的两个参数之和:

```java
package org.code.develop.Method;

public class MethodSum {
    static int count(int x,int y) {
        return x + y;
    }

    public static void main(String[] args) {
        System.out.println("计算两数之和");
        System.out.println(count(10,20));
    }
}
```



- 还可以将结果存储在变量中（推荐，因为这样更易于读取和维护）:

```java
package org.code.develop.Method;

public class MyMethod4 {
    static int Sum (int x,int y){
        return  x + y;
    }

    public static void main(String[] args) {
        int z = Sum(7,8);

        System.out.println(z);
    }
}
```



##### 使用IF......Else的方法

- 通常在方法中可以使用`if...else`

```java
package org.code.develop.Method;

public class MyMethodTest6 {
    static void CheckAge(int age){
        // 如果年龄小于18岁。打印"you are so small!"
        // 大于18则输出"you are so big! we need you!!!"
        if (age < 18){
            System.out.println("you are so small!");
        }else {
            System.out.println("you are so big! we need you!!!");
        }
    }

    public static void main(String[] args) {
        CheckAge(20);
    }
}

```



### Java方法重载

使用方法重载，多个方法可以具有相同的名称和不同的参数

```java
int myMethod(int x);
float myMethod(float x);
double myMethod(double x, double y);
```

思考一下，下面的实例，它有两种添加不同类型数字的方法

```java
package org.code.develop.Method;

public class MyMethodTest7 {
  // 计算两数之和（INT）
  static int plusMethodInt (int x, int y){
    return x + y;
  }

  // 计算两数之和（DOUBLE）
  static double plusMethodDouble (Double x,Double y){
    return x + y;
  }

  public static void main(String[] args) {
    int myNum1 = plusMethodInt(8,5);
    double myNum2 = plusMethodDouble(4.3,6.26);
    System.out.println("int: " + myNum1);
    System.out.println("double: " + myNum2);
  }
}
```

在上面的方法中，两个方法都是做同样的事情，为什么我们不重载呢？
在下面的实例中，我们重载`PlusMethod`方法，使其同时适用于`int`,`double`类型

```java
package org.code.develop.Method;

public class MyMethodTest8 {
    static int plusMethod(int x, int y) {
        return x + y;
    }

    static double plusMethod(double x, double y) {
        return x + y;
    }

    public static void main(String[] args) {
        int myNum1 = plusMethod(8, 5);
        double myNum2 = plusMethod(4.3, 6.26);
        System.out.println("int: " + myNum1);
        System.out.println("double: " + myNum2);
    }
}

```

> 注释: 只要**参数的数量或类型不同**，多个方法就可以**具有相同的名称**。


### Java作用域
- 在Java中，变量只能在创建的区域内访问，这称为**作用域**

##### 方法作用域
直接在方法中声明的变量在方法中任何位置都可以使用，位于声明它们的代码行之后：

```java
package org.code.develop.test;

public class MyScope {
    public static void main(String[] args) {
        // 此处的代码不能使用 x
        int x = 100;

        // 这里的代码可以使用 x
        System.out.println(x);
    }
}
```

> 在 Java 方法里，变量只有在声明之后才能被使用，就像只有先给东西起好名字，后面才能喊它干活一样。

##### 块作用域
- 代码块是指大括号`{}`之间的所有代码。在代码块内声明的变量只能由大括号之间的代码访问，大括号在声明变量的那一行之后：

```java
public class MyClass {
  public static void main(String[] args) {

    // 此处的代码不能使用 x

    { // 这是一个块

      // 此处的代码不能使用 x

      int x = 100;

      // 这里的代码可以使用 x
      System.out.println(x);

   } // 区块到此结束
  // 此处的代码不能使用 x
  }
}
```

> 代码块可以单独存在，也可以属于 if, while 或 for 语句。 对于 for 语句，语句本身中声明的变量在块的作用域也可用。



### Java递归

递归是进行函数调用本身的技术。这种技术提供了一种将复杂问题分解为更容易解决的简单问题的方法。

递归可能有点难以理解。弄清楚它是如何工作的最好方法就是用它进行实验。

##### 递归实例
将两个数字相加很容易，但将一系列数字相加则更为复杂。在以下实例中，递归用于将一系列数字相加，方法是将其分解为两个数字相加的简单任务：

```java
package org.code.develop.test;

// 定义一个名为MyRecursion的公共类
public class MyRecursion {
    // 程序的入口点，Java程序从main方法开始执行
    public static void main(String[] args) {
        // 调用sum方法计算1到10的累加和，并将结果赋值给result变量
        int result = sum(10);
        // 输出计算得到的累加和结果
        System.out.println(result);
    }

    // 定义一个静态方法sum，用于计算从1到k的整数累加和，方法接收一个整数参数k
    public static int sum(int k){
        // 判断k是否大于0，如果是则执行递归计算
        if (k > 0){
            // 这里是递归调用，返回k加上k-1到1的累加和
            // 即把当前的k值与比它小1的数的累加和相加
            return k + sum(k - 1);
        }else {
            // 当k不大于0（即k为0或负数）时，作为递归的终止条件，返回0
            return 0;
        }
    }
}
```

