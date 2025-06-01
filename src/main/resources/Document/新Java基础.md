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


实例解析

调用sum()函数时，它将参数k添加到小于k的所有数字的和中，并返回结果。 当k变为0时，函数只返回0。运行时，程序遵循以下步骤:

10 + sum(9)

10 + ( 9 + sum(8) )

10 + ( 9 + ( 8 + sum(7) ) )

...

10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 + sum(0)

10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 + 0

由于函数在k为0时不调用自身，因此程序停止并返回结果。

##### 停止状态
正如循环会遇到无限循环的问题一样，递归函数也会遇到无限递归的问题。 无限递归是指函数从不停止调用自身。每个递归函数都应该有一个停止条件，即函数停止调用自身的条件。 在前面的示例中，停止条件是当参数k变为0时。

看到各种不同的例子有助于更好地理解这个概念。在本例中，函数在起点和终点之间添加一系列数字。 此递归函数的停止条件为end不大于start时:

```java
// 使用递归将5到10之间的所有数字相加。
public class MyClass {
  public static void main(String[] args) {
    int result = sum(5, 10);
    System.out.println(result);
  }
  public static int sum(int start, int end) {
    if (end > start) {
      return end + sum(start, end - 1);
    } else {
      return end;
    }
  }
}
```

## JavaOOP面向对象编程

**Java - 什么是OOP?**
> OOP代表面向对象编程。

过程编程是关于编写对数据执行操作的过程或函数，而面向对象编程是创建同时包含数据和函数的对象。

与过程编程相比，面向对象编程有几个优点:

- OOP 更快更容易执行
- OOP 为程序提供了清晰的结构
- OOP 有助于保持C#代码"不重复自己"，并使代码更易于维护、修改和调试。
- OOP 使得用更少的代码和更短的开发时间创建完全可重用的应用程序成为可能

提示: "不要重复你自己 "（DRY）原则是关于减少代码的重复。您应该提取出应用程序通用的代码，并将它们放在一个地方，然后重用它们，而不是重复使用它们。

 

**Java - 什么是类和对象?**
类和对象是面向对象编程的两个主要方面。

请看下图以了解类和对象之间的区别:

![image](https://img.dexbug.com/i/2025/05/27/gnqp6l.png)



### Java 对象和类

- Java是一种面向对象的编程语言

- Java中的一切都与类和对象及其属性方法相关联。

- 例如:在现实生活中，汽车是一个物体。汽车有**属性**，比如重量和颜色，还有**方法**，比如驱动和刹车。

  类类似于对象构造函数，或用于创建对象的"蓝图"。



#### 创建一个类

创建一个类，使用`class`关键字

```java
public class MyClass {
  int x = 5;
}
```



#### 创建一个对象

在Java中，对象是从类创建的。我们已经创建了名为`MyClass` 的类，因此现在可以使用它来创建对象。

要创建`MyClass`的对象，请指定类名，后跟对象名，并使用`new`关键字:

```java
public class MyClass {
  int x = 5;

  public static void main(String[] args) {
    MyClass myObj = new MyClass();
    System.out.println(myObj.x);
  }
}
```



#### 多个对象

可以创建一个类的多个对象

```java
public class MyClass {
  int x = 5;

  public static void main(String[] args) {
    MyClass myObj1 = new MyClass();  // 对象 1
    MyClass myObj2 = new MyClass();  // 对象 2
    System.out.println(myObj1.x);
    System.out.println(myObj2.x);
  }
}
```



#### 使用多个类

可以创建一个类的对象并在另一个类中访问它。这通常用于更好地组织类（一个类拥有所有属性和方法，而另一个类拥有`main()`方法（要执行的代码））。



### Java类属性

我们在示例中使用了`x`的术语"变量"（如下所示）。它实际上是类的一个属性。或者可以说类属性是类中的变量:

```java
public class MyClass {
  int x = 5;
  int y = 3;
}
```



> 类属性的另一个术语是**字段**。





#### 访问属性

可以通过创建类的对象和使用点语法(`.`)来访问属性:

下面的示例将创建`MyClass`类的对象，名称为`myObj`。我们使用对象上的`x`属性打印其值:



```java
public class MyClass {
  int x = 5;

  public static void main(String[] args) {
    MyClass myObj = new MyClass();
    System.out.println(myObj.x);
  }
}
```





#### 修改属性

```java
public class MyClass {
  int x;

  public static void main(String[] args) {
    MyClass myObj = new MyClass();
    // 指定大小
    myObj.x = 40;
    System.out.println(myObj.x);
  }
}
```

或者替代现有

```java
public class MyClass {
  int x = 10;

  public static void main(String[] args) {
    MyClass myObj = new MyClass();
    myObj.x = 25; // x 现在是 25
    System.out.println(myObj.x);
  }
}
```

如果不希望覆盖现有值，请将该属性声明为 `final`:

```java
public class MyClass {
  final int x = 10;
  public static void main(String[] args) {
    MyClass myObj = new MyClass();
    myObj.x = 25; // 将产生错误:无法为 final 变量赋值
    System.out.println(myObj.x);
  }
}
```



> 如果希望变量始终存储相同的值，如PI（3.14159…），则 `final`关键字非常有用。
>
> `final` 关键字称为"修饰符"。



#### 多个对象

如果创建一个类的多个对象，可以在更改一个对象中的属性值时，而不会影响另一个对象中的属性值:

```java
public class MyClass {
  int x = 5;
  public static void main(String[] args) {
    MyClass myObj1 = new MyClass();  // 对象 1
    MyClass myObj2 = new MyClass();  // 对象 2
    // 这里之更改了myObj2的值为25
    myObj2.x = 25;
    System.out.println(myObj1.x);  // 输出 5
    System.out.println(myObj2.x);  // 输出 25
  }
}
```



#### 多属性

可以指定任意数量的属性:

```java
public class Person {
  String fname = "John";
  String lname = "Doe";
  int age = 24;
    
  public static void main(String[] args) {
    Person myObj = new Person();
      
    System.out.println("Name: " + myObj.fname + " " + myObj.lname);
    System.out.println("Age: " + myObj.age);
  }
}
```




### Java类方法
- 方法是在类中声明的，他们用于执行某些操作

```java
package org.code.develop.test;

public class MyClass {
    static void myMethod(){
        System.out.println("Hello,World!");
    }
}
```

- `myMethod()`在调用时打印文本。要调用一个方法，请写出该方法的名称，后跟两个`()`和分号`;`

下面，在`Main`中调用`myMethod()`
```java
package org.code.develop.test;

public class MyClass {
    static void myMethod(){
        System.out.println("Hello,World!");
    }

    public static void main(String[] args) {
        myMethod();
    }

    // 输出"Hello,World!"
}

```


#### 静态与非静态
经常会看见，具有`static`静态或`public`公共属性和方法的Java程序
在上面的示例中，我们创建了一个`static`静态方法，这意味着可以在不创建类的对象下访问该方法，而`public`只能由对象访问

- `static` 决定“是否需要通过对象来访问”；

- `public` 决定“是否可以在其他类中访问”。

你可以把它们看作是分别控制 `“方式”` 和 `“权限”` 的两个维度。

下面，演示`static`静态或`public`公共方法之间的差异
```java
package org.code.develop.test;

public class MyClassTest1 {
  // Static 方法
  static void myStaticMethod() {
    System.out.println("Static methods can be called without creating objects");
  }

  // Public 方法
  public void myPublicMethod() {
    System.out.println("Public methods must be called by creating objects");
  }

  // Main 方法
  public static void main(String[] args) {
    myStaticMethod(); // 调用静态方法
    // myPublicMethod(); 这会编译一个错误

    MyClassTest1 myObj = new MyClassTest1(); // 创建一个 MyClass 的对象
    myObj.myPublicMethod(); // 调用对象的公共方法
  }
}
```


#### Java对象的访问方法
```java
// 创建一个名为myCar的汽车对象。对myCar对象调用fullThrottle()和speed()方法，然后运行程序:
package org.code;

// 创建Car类
public class Car {
    // 创建一个 fullThrottle() 方法
    public void fullThrottle() {
        System.out.println("这辆车正在尽力以最快的速度行驶！");
    }

    // 创建speed() 方法，并添加一个参数
    public void speed(int maxSpeed) {
        System.out.println("最大速度为： " + maxSpeed);
    }

    // 在Main中调用上方的方法
    public static void main(String[] args) {
        Car myCay = new Car(); // 创建对象
        myCay.fullThrottle(); // 调用方法
        myCay.speed(120); // 调用speed方法，传入参数
    }
}
```

**解析**
1. 我们在`class`关键字创建了一个`car`类
2. 我们在`Car`类中创建了`fullThrottle()`方法和`speed()`方法
3. `fullThrottle()`方法和`speed()`方法在调用时将打印出一些文本
4. `speed()`方法接受一个名为`maxSpeed`的`int`类型参数
5. 为了使用`Car`方法，我们需要创建`Car`类的**对象**
6. 然后转到`main()方法`知道其是一个运行程序的入口
7. 通过`new`关键字，我们创建了一个名为`myCar`的`Car`对象
8. 然后我们调用了这两个方法，在第二个方法中进行了传参，设置速度为120最大

> 记住..
> 点 (.) 用于访问对象的属性和方法。
> 
> 要在Java中调用方法，请编写方法名称，后跟一组括号()，后跟分号(;)
> 
> 类必须具有匹配的文件名(Car 和 Car.java).


#### 使用多个类
就像我们在之前中指定的那样，创建一个类的对象并在另一个类中访问它是一种很好的做法。

请记住，java文件的名称应该与类名匹配。

### Java构造函数
Java中构造函数是一种用于初始化对象的**特殊方法**。在创建类的对象时调用构造函数。它可用于设置对象属性的初始值。

#### 创建构造函数

```java
package org.code.develop.function;

public class MyClass {
  int x; // 创建类属性

  // 为MyClass类创建一个类构造函数
  public MyClass() {
    // 设置类属性x初始值为5
    x = 5;
  }

  public static void main(String[] args) {
    org.code.develop.MyClass myObj = new org.code.develop.MyClass(); //创建一个 MyClass 类的对象（这将调用构造函数）
    System.out.println(myObj.x); // 打印x的值
  }
}
```

> 请注意，构造函数名称必须与类名匹配，并且不能有返回类型(如 void).
> 
> 还要注意，在创建对象时会调用构造函数。
> 
> 默认情况下，所有类都有构造函数:如果您自己不创建类构造函数，Java会为您创建一个。但是，您无法设置对象属性的初始值。


##### 构造函数参数

构造函数还可以用于获取参数，初始化属性

下面将演示`int i`参数添加到构造函数中。在构造函数找那个，我们将 x 设置为 y （x = y） 。调用构造函时，我们向构造函数(5)传递一个参数，将参数x的值设置为5.

```java
package org.code.develop.function;

/**
 * 这是一个演示Java类和构造函数用法的示例类。
 * 该类包含一个实例变量和一个带参数的构造函数，
 * 并在main方法中展示了如何创建对象和访问实例变量。
 */
public class MyClass1 {
    // 声明一个名为x的整型实例变量，用于存储对象的状态
    int x;

    /**
     * 构造函数：用于初始化MyClass1对象
     * @param y 用于初始化实例变量x的值
     */
    public MyClass1(int y) {
        // 将参数y的值赋给当前对象的实例变量x
        x = y;
    }

    /**
     * 程序入口点
     * @param args 命令行参数数组
     */
    public static void main(String[] args) {
        // 创建MyClass1类的一个实例（对象），并通过构造函数传递初始值5
        MyClass1 myObj = new MyClass1(5);

        // 访问对象的实例变量x并打印其值到控制台
        System.out.println(myObj.x); // 输出结果：5
    }
}
```

也可以有任意多个参数

```java
package org.code.develop.function;

/**
 * MultiParameterFunction 类用于演示如何通过构造函数传递多个参数
 * 并将这些参数赋值给类的成员变量，以实现对象属性的初始化。
 */
public class MultiParameterFunction {

    // 成员变量：记录年份（可以理解为出生年份或其他年份信息）
    int PersonYear;

    // 成员变量：记录名字
    String PersonName;

    /**
     * 构造函数：
     * 在创建对象时被自动调用，用于初始化对象的成员变量。
     * 构造函数名称必须与类名一致。
     *
     * @param Year  初始化年份的参数，赋值给成员变量 PersonYear
     * @param Name  初始化姓名的参数，赋值给成员变量 PersonName
     */
    public MultiParameterFunction(int Year, String Name) {
        // 将传入的参数 Year 赋值给成员变量 PersonYear
        PersonYear = Year;

        // 将传入的参数 Name 赋值给成员变量 PersonName
        PersonName = Name;
    }

    /**
     * 主方法（程序入口）：
     * Java 程序从 main 方法开始执行。
     *
     * @param args  命令行参数（此示例未使用）
     */
    public static void main(String[] args) {
        // 使用构造函数创建 MultiParameterFunction 类的实例
        // 并传入两个参数：年份 2007 和姓名 "MuGay"
        MultiParameterFunction MPF = new MultiParameterFunction(2007, "MuGay");

        // 打印对象的成员变量，输出格式为：2007 MuGay
        System.out.println(MPF.PersonYear + " " + MPF.PersonName);
    }
}
```

### Java修饰符

到这里，你几乎看到所有示例中出现的关键字了

```java
public class MyClass
```

`public`关键字是一个**访问修饰符**，这表示它用于设置类，属性，方法和构造函数级别的访问。

我们将修饰符分为两组

- 访问修饰符 - 控制访问级别
- 非访问修饰符 - 不控制访问级别，但提供其他功能

#### 访问修饰符
对于classes，可以使用`public`或**default**:

| 修饰符  | 描述                                                   |
| ------- | ------------------------------------------------------ |
| public  | 该类可以由任何其他类访问                               |
| default | 该类只能由同一包中的类访问。在不指定修改器时使用此选项 |

对于**属性，方法和构造函数**，可以使用以下选项之一：

| 修饰符    | 描述                                                   |
| --------- | ------------------------------------------------------ |
| public    | 所有类都可以访问该代码                                 |
| private   | 代码只能在声明的类中访问                               |
| default   | 该类只能由同一包中的类访问。在不指定修改器时使用此选项 |
| protected | 代码可以在相同的包和子类中访问                         |

#### 非访问修饰符

对于**类**，可以使用`final`或`abstract`:

|修饰符|描述|
|----|----|
|final|该类不能被其他类继承|
|abstract|该类不能用于创建对象（要访问抽象类，他必须从另一个类继承）|

对于属性和方法，可以使用以下选项之一：

|修饰符|描述|
|----|----|
|**final**|无法覆盖/修改属性和方法|
|**static**|属性和方法术语类，而不是对象|
|**abstract**|只能在抽象类中使用，并且只能在方法中使用。该方法没用主体，例如抽象abstract void run();。主体由子类（继承自）提供。|
|**transient**|序列化包含属性和方法对象时，将跳过属性和方法|
|**synchronized**|方法一次只能由一个线程访问|
|**volatile**|属性值不是本地缓存的线程，总是从"主内存"中读取|

#### Final

- 如果不希望覆盖现有属性值，将属性声明为`final`

```java
package org.code.develop.Modifier;

public class MyFinal {
  final String name = "MuGay";
  final int x = 91;

  public static void main(String[] args) {
    MyFinal MF = new MyFinal();

    // 如果尝试重新定义一个本来就是final类型的变量，编译器会报错
    //MF.x =50;
    System.out.println(MF.name);
    System.out.println(MF.x);
  }
}
```

#### Static

- `static`静态方法意味着可以在不创建类对象的情况下访问它，这与`pubic`不同

```java
package org.code.develop.Modifier;

public class MyStatic {
  // 静态方法
  static void myStaticMethod() {
    System.out.println("Static methods can be called without creating objects");
  }

  // 公共方法
  public void myPublicMethod() {
    System.out.println("Public methods must be called by creating objects");
  }

  // Main方法
  public static void main(String[] args) {
    // 调用静态方法
    myStaticMethod();

    // 创建一个对象
    MyStatic MS = new MyStatic();
    MS.myPublicMethod();
  }
}
```

#### Abstract

abstract 抽象方法属于abstract抽象类，它没有主体。主体由子类提供:

```java
package org.code.develop.Modifier;

// Code from filename: Person.java
// 抽象类
abstract class Person {
  public String fname = "John";
  public int age = 24;

  public abstract void study(); // 抽象方法
}

// 子类（从 Person 继承）
class Student extends Person {
  public int graduationYear = 2018;

  public void study() { // 此处提供了抽象方法的主体
    System.out.println("Studying all day long");
  }
}
// End code from filename: Person.java

// Code from filename: MyClass.java
class MyClass {
  public static void main(String[] args) {
    // 创建 Student 类的对象（从 Person 继承属性和方法）
    Student myObj = new Student();

    System.out.println("Name: " + myObj.fname);
    System.out.println("Age: " + myObj.age);
    System.out.println("Graduation Year: " + myObj.graduationYear);
    myObj.study(); // 调用抽象方法
  }
}
```

### Java封装

- 封装的意义是确保对用户隐藏"敏感"数据。要实现这一点
  - 将变量/属性声明为`private`
  - 提供公共**get**和**set**方法来访问和更新`private`私有变量的值

#### Get和Set

- 从上一章中了解到，只能在同一个类内访问 `private`私有变量（外部类无权访问它）。但是，如果我们提供公共get和set方法，就可以访问它们。

**get**方法返回变量值，**set**方法设置值。

两者的语法都是以 **get** 或 **set**开头，后跟变量名，第一个字母大写:

```java
package org.code.develop.encapsulation;

// Person类，用于表示一个人的信息
// 这里体现了封装的概念，将数据（如name）隐藏起来，通过公共的方法（getter和setter）来访问和修改
public class Person {
    // 私有属性name，用于存储人的名字
    // 使用private修饰符，将其封装起来，外部类不能直接访问
    private String name;

    // Getter方法，用于获取name属性的值
    // 外部类可以通过调用这个方法来获取name的值，而不是直接访问私有属性
    public String getName() {
        return name;
    }

    // Setter方法，用于设置name属性的值
    // 外部类可以通过调用这个方法来设置name的值，并且可以在方法内部添加一些逻辑来验证或处理新的值
    // 例如，可以在这里添加对新名字的长度限制等验证逻辑
    public void setName(String newName) {
        this.name = newName;
    }
}
```

> 解析：
> ``get``方法返回变量`name`的值
> ``set``方法接受一个参数(`newName`)并将其分配给`name`变量。`this`关键字用于引用当前对象。
> 但是由于`name`变量声明为`private`,因此我们无法从此类外部访问它

为什么要封装?
- 更好地控制类属性和方法
- 类属性可以设置为只读（如果只使用get方法），也可以设置为只写（如果只使用set方法）
- 灵活:程序员可以在不影响其他部分的情况下更改代码的一部分
- 提高数据的安全性

### Java 包(Packages)
- Java包与API
  Java中的包用于对相关类进行分组。可将其视为文件目录中的文件夹。我们使用包来规避名称冲突，并编写更好的可维护代码。软件包分为两类：
  - 内置包（来自JavaAPI的包）
  - 用户自定包（创建自己的包）

#### 内置软件包

JavaAPI 是 Java开发环境中包含的一个预编写类库，可以直接使用。

该库用于管理输入，数据库编程等组件。完整列表可以在Oracles网站上找到:https://docs.oracle.com/javase/8/docs/api/

该库分为包和类，这意味着可以导入单个类（及其方法和属性）也可以导入包含属于指定包的所有类的整个包。

如果需要使用该库中的类或者包，需要使用`import`关键字

```java
import package.name.Class;   // 导入 single 类
import package.name.*;   // 导入整个包
```

#### 导入类
如果需要找到使用的类，例如获取用户输入的`Scanner`类，请编写以下代码
```java
import java.util.Scanner;
```

在上面的实例中，`java.util`是一个包，而`Scanner`是`java.util`包的一个类。
要使用`Scanner`类，请创建该类的对象，即可使用`Scanner`类文档中的任何可用方法。

- 示例：使用Scanner获取用户输入

```java
import java.util.Scanner;

class MyClass {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    System.out.println("Enter username");

    String userName = myObj.nextLine();
    System.out.println("Username is: " + userName);
  }
}
```

#### 导入包
有许多软件包可供选择。在前面的示例中，我们使用了`java.util`包中的`Scanner`类。该软件包还包含日期和时间工具，随机数生成器和其他使用程序类。
要导入整个软件包，请在句子末尾加上星号（*）。以下示例将导入`java.util`包中的所有类：

```java
import java.util.*;
```

#### 用户定义包
要创建包，请使用`package`关键字


### Java继承
- 子类和超类
Java中可以将属性和方法从一个类继承到另一个类。我们将"继承概念"分为两种

- 子类 (Subclass) - 子，从另一个类继承的类
- 超类 (Superclass) - 父，被继承的类

要从类继承，请使用`extends`关键字。

在下面的示例中，`Car`类（子类）继承了`Vehicle`类（超类）的属性和方法：

```java
class Vehicle {
  protected String brand = "Ford";        // Vehicle 属性
  public void honk() {                    // Vehicle 方法
    System.out.println("Tuut, tuut!");
  }
}

class Car extends Vehicle {
  private String modelName = "Mustang";    // Car 属性
  public static void main(String[] args) {

    // 创建一个 myCar 对象
    Car myCar = new Car();

    // 在 myCar 对象上调用 honk() 方法（来自 Vehicle 类）
    myCar.honk();

    // 显示 brand 属性的值（来自 Vehicle 类）和来自 Car 类的 modelName 值
    System.out.println(myCar.brand + " " + myCar.modelName);
  }
}
```

你是否注意到Vehicle中的protected修饰符?

我们将Vehicle中的brand属性设置为protected受保护的访问修饰符。 如果设置为private，则Car类将无法访问它。

为什么使用继承?
- 因为它对于代码的可重用性很有用:在创建新类时重用现有类的属性和方法。

### Java多态
多态意味着“多种形式”，当我们有许多通过继承相互关联的类时，就会产生多态性。

**继承**允许我们从另一个类继承属性和方法。多态使用这些方法来执行不同的任务。这允许我们以不同的方式执行单个操作。

例如。考虑一个名为`Animal`的超类，它有一个名为`animalSound()`的方法。动物的亚类可以是猪，猫，狗，鸟，他们也有自己的动物声音（猪叫，猫叫等）：

```java
class Animal {
  public void animalSound() {
    System.out.println("The animal makes a sound");
  }
}

class Pig extends Animal {
  public void animalSound() {
    System.out.println("The pig says: wee wee");
  }
}

class Dog extends Animal {
  public void animalSound() {
    System.out.println("The dog says: bow wow");
  }
}
```

> 请记住，我们使用**extends**关键字从类继承。

现在，我们可以创建`pig`和`Dog`对象，并对它们调用`animalSound()`方法

```java
class Animal {
  public void animalSound() {
    System.out.println("The animal makes a sound");
  }
}

class Pig extends Animal {
  public void animalSound() {
    System.out.println("The pig says: wee wee");
  }
}

class Dog extends Animal {
  public void animalSound() {
    System.out.println("The dog says: bow wow");
  }
}

class MyMainClass {
  public static void main(String[] args) {
    Animal myAnimal = new Animal();  // 创建一个 Animal 对象
    Animal myPig = new Pig();  // 创建 Pig 对象
    Animal myDog = new Dog();  // 创建一个 Dog 对象
    myAnimal.animalSound();
    myPig.animalSound();
    myDog.animalSound();
  }
}
```

为什么要使用"继承"和"多态性"?
- 因为它对于代码的可重用性很有用:在创建新类时可以重用现有类的属性和方法。


### Java 内部类 (嵌套类)
在Java中，也可以嵌套类（类中的类）。嵌套类的目的是将属于同一类的类分组，这使代码更具有可读性和维护性。

要访问内部类，请创建外部类的对象，然后创建内部类的对象：

```java
package org.code.develop.inheritance;

class OuterClass {
    int x = 10;
    class InnerClass {
        int y = 5;
    }
}

public class MyNestedClass {
    public static void main(String[] args) {
        OuterClass myOuter = new OuterClass();
        OuterClass.InnerClass myInner = myOuter.new InnerClass();
        System.out.println(myInner.y + myOuter.x);
    }
}
```


#### 私有的内部类
与“常规”类不同，内部类可以是`private`私有的或`protected`受保护的。

如果不希望外部对象访问内部类，请将该类声明为`private`

```java
package org.code.develop.inheritance;

class OutClass {
    int x = 9;
    private class InnerClass {
        int y = 1;
    }
}

public class PrivateInnerClass {
    public static void main(String[] args) {
        OutClass out = new OutClass();

        // 将上方的内部类修改为`private`编译器会立即报错，因为无法访问到
        OutClass.InnerClass outInner = out.new InnerClass();

        System.out.println(out.x + outInner.y);
    }
}
```

#### Static内部类
内部类也可以是`static`静态的，这意味着可以在不创建外部类的对象的情况下访问它。

```java
package org.code.develop.inheritance;

class MyOutClass {
    int x = 8;
    static class MyInnerClass {
        int y = 2;
    }
}


public class StaticInnerClass {
    public static void main(String[] args) {
        MyOutClass.MyInnerClass MyInner = new MyOutClass.MyInnerClass();

        System.out.println(MyInner.y);
    }
}
```

> 注释: 与 static静态属性和方法一样，static静态内部类无权访问外部类的成员。


#### 从内部类访问外部类

内部类的一个优点是，它们可以访问外部类的属性和方法。

```java
package org.code.develop.inheritance;

class OClass {
  int x = 10;
  class IClass {
    public int myInnerMethod(){
      return x;
    }
  }
}

public class MainClass {
  public static void main(String[] args) {
    // 创建外部类的访问对象
    OClass OC = new OClass();

    // 引用新对象再创建一个内部对象
    OClass.IClass OI = OC.new IClass();

    // 引用内部对象的方法输出
    System.out.println(OI.myInnerMethod());
  }
}
```



### Java抽象类

数据**抽象**是隐藏某些细节并仅向用户显示基本信息的过程。

抽象可以通过**abstract classes**抽象类或`interfaces`接口实现



`abstract `关键字是非访问修饰符，用于类和方法：

- 抽象类：是一个不能用于创建对象的受限类（要访问它，必须从另一个类继承）
- 抽象方法：只能在抽象类中使用，并且它没有主体。主体由子类（继承自）提供



抽象类可以由抽象方法和常规方法：

```java
abstract class Animal {
  public abstract void animalSound();
  public void sleep() {
    System.out.println("Zzz");
  }
}
```



根据上面的示例，不可能创建 Animal动物类的对象：

```java
Animal myObj = new Animal(); // 会产生错误
```



要访问抽象类，他必须从另一个类继承。（使用extends关键字继承）

```java
package org.code;

// 抽象类
abstract class Animal{
    // 抽象方法（没主体）
    public abstract void animalSound();

    // 常规方法
    public void sleep() {
        System.out.println("I am sleep~~~");
    }
}

// 子类，继承自（Animal）
class Pig extends Animal {
    public void animalSound(){
        // 这里提供 animalSound() 的主体
        System.out.println("I am Pig!");
    }
}

class AbstractClass {
    public static void main(String[] args) {
        Pig myPig = new Pig();
        myPig.animalSound();
        myPig.sleep();
    }
}
```

> **为什么以及何时使用抽象类和方法?**
>
> 因为要实现安全性，要隐藏某些细节并仅显示对象的重要细节。
>
> **注释:** 抽象也可以通过接口实现


### Java接口
Java中实现**abstraction**抽象的另一种方法是使用接口。

An ``interface``接口是一个完全“抽象类”，用于将相关方法与空实体分组：

```java
package org.code.develop.Interface;

interface Animal {
    // 接口方法
    public void animalSound();

    // 接口方法
    public void run();
}
```

要访问接口方法，接口必须由另一个具有`implements`关键字（而不是`extends`）的类“实现”（类似于继承）。接口方法的主体由“implements”类提供：

```java
package org.code.develop.Interface;

interface Animal{
    public void animalSound();
    public void sleep();
}

// Pig “实现” Animal 接口
class Pig implements Animal {
    public void animalSound(){
        // 这里提供 animalSound() 主体
        System.out.println("I am Pig");
    }
    public void sleep() {
        System.out.println("Zzz...");
    }
}


// Main方法入口
class MyMainClass {
    public static void main(String[] args) {
        // 创建Pig对象
        Pig myPig = new Pig();

        myPig.animalSound();
        myPig.sleep();
    }
}
```

> 关于接口的说明：
> - 与抽象类一样，**接口不能用于创建对象**（在上面的示例中，不可能在Main方法中创建“Animal”对象）
> - 接口方法没有主体-主体由“implement”类提供
> - 在实现接口时，必须重写其所有方法
> - 默认情况下，接口方法是`abstract`抽象的和`public`公共的
> - I接口属性默认为`public`,`static`,`final`
> - 接口不能包含构造函数（因为其不能用于创建对象）
> 
> 为什么以及何时使用接口？
> 1）为了实现安全性-隐藏某些细节，只显示对象（接口）的重要细节
> 2）Java不支持“多重继承”（一个类只能从一个超类继承）。但是，它可以通过接口实现，因为该类可以实现多个接口。
> **注释：**要实现多个接口，请用逗号分隔它们 

#### 多个接口
要实现多个接口，用逗号分隔：

```java
package org.code.develop.Interface;

interface FirstInterface {
    // 接口方法
    public void myMethod();
}

interface SecondInterface {
    public void myOtherMethod();
}

class DemoClass implements FirstInterface,SecondInterface {
    public void myMethod() {
        System.out.println("Some text...");
    }

    public void myOtherMethod() {
        System.out.println("some other text...");
    }
}

class MainClass {
    public static void main(String[] args) {
        DemoClass myObj = new DemoClass();

        myObj.myMethod();
        myObj.myOtherMethod();
    }
}
```

### Java枚举
`enum`枚举是一个特殊的“类”，它用于表示一组**常量**（不可更改的变量，如`final`变量）
要创建`enum`，请使用`enum`关键字（而不是类或者接口），并用逗号分隔常量。请注意，其应为大写字母

```java
package org.code.develop.Enums;

enum Level {
    LOW,
    MEDIUM,
    HIGH
}
```

可以使用.语法访问`enum`枚举常量，如：
```java
package org.code;

public class enums {
    public static void main(String[] args) {
        enum size{
            LONG,
            SMALL,
        }
//   ----------------------------  
        size myVar = size.LONG; // 访问常量
//   ----------------------------   
        System.out.println(myVar);
    }
}
```

> Enum 是"enumerations"的缩写，意思是"特别列出"。

#### 类内枚举
还可以在类中具有enum枚举：

```java
package org.code.develop.Enums;

public class MyClass {
    enum Level {
        LOW,
        MEDIUM,
        HIGH
    }

    public static void main(String[] args) {
        Level myVar = Level.HIGH;
        System.out.println(myVar);
    }
}
```

#### Switch语句中的枚举
枚举通常用于`switch`语句中检查相应的值：

```java
package org.code.develop.Enums;

enum Size {
    LOW,
    MEDIUM,
    HIGH
}

public class SwitchEnum {
    public static void main(String[] args) {
        Size mySize = Size.HIGH;

        switch (mySize){
            case LOW :
                System.out.println("Low Size");
                break;
            case MEDIUM:
                System.out.println("MEDIUM Size");
                break;
            case HIGH:
                System.out.println("you are so high!");
                break;
        }
    }
}
```

输出：
> D:\develop\JDK17\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.2.3\lib\idea_rt.jar=10292" -Dfile.encoding=UTF-8 -classpath D:\TestCode\Java\JavaCode\target\classes;C:\Users\Karey\.m2\repository\com\mysql\mysql-connector-j\8.0.33\mysql-connector-j-8.0.33.jar;C:\Users\Karey\.m2\repository\com\google\protobuf\protobuf-java\3.21.9\protobuf-java-3.21.9.jar;C:\Users\Karey\.m2\repository\com\google\genai\google-genai\1.0.0\google-genai-1.0.0.jar;C:\Users\Karey\.m2\repository\com\google\auth\google-auth-library-oauth2-http\1.30.1\google-auth-library-oauth2-http-1.30.1.jar;C:\Users\Karey\.m2\repository\com\google\auto\value\auto-value-annotations\1.11.0\auto-value-annotations-1.11.0.jar;C:\Users\Karey\.m2\repository\com\google\code\findbugs\jsr305\3.0.2\jsr305-3.0.2.jar;C:\Users\Karey\.m2\repository\com\google\auth\google-auth-library-credentials\1.30.1\google-auth-library-credentials-1.30.1.jar;C:\Users\Karey\.m2\repository\com\google\http-client\google-http-client\1.45.2\google-http-client-1.45.2.jar;C:\Users\Karey\.m2\repository\io\grpc\grpc-context\1.68.2\grpc-context-1.68.2.jar;C:\Users\Karey\.m2\repository\io\grpc\grpc-api\1.68.2\grpc-api-1.68.2.jar;C:\Users\Karey\.m2\repository\io\opencensus\opencensus-api\0.31.1\opencensus-api-0.31.1.jar;C:\Users\Karey\.m2\repository\io\opencensus\opencensus-contrib-http-util\0.31.1\opencensus-contrib-http-util-0.31.1.jar;C:\Users\Karey\.m2\repository\com\google\http-client\google-http-client-gson\1.45.2\google-http-client-gson-1.45.2.jar;C:\Users\Karey\.m2\repository\com\google\code\gson\gson\2.11.0\gson-2.11.0.jar;C:\Users\Karey\.m2\repository\com\google\guava\guava\33.3.1-android\guava-33.3.1-android.jar;C:\Users\Karey\.m2\repository\com\google\guava\failureaccess\1.0.2\failureaccess-1.0.2.jar;C:\Users\Karey\.m2\repository\com\google\guava\listenablefuture\9999.0-empty-to-avoid-conflict-with-guava\listenablefuture-9999.0-empty-to-avoid-conflict-with-guava.jar;C:\Users\Karey\.m2\repository\org\checkerframework\checker-qual\3.43.0\checker-qual-3.43.0.jar;C:\Users\Karey\.m2\repository\com\google\errorprone\error_prone_annotations\2.36.0\error_prone_annotations-2.36.0.jar;C:\Users\Karey\.m2\repository\org\apache\httpcomponents\httpclient\4.5.14\httpclient-4.5.14.jar;C:\Users\Karey\.m2\repository\commons-logging\commons-logging\1.2\commons-logging-1.2.jar;C:\Users\Karey\.m2\repository\commons-codec\commons-codec\1.11\commons-codec-1.11.jar;C:\Users\Karey\.m2\repository\org\apache\httpcomponents\httpcore\4.4.16\httpcore-4.4.16.jar;C:\Users\Karey\.m2\repository\com\google\auto\value\auto-value\1.11.0\auto-value-1.11.0.jar;C:\Users\Karey\.m2\repository\com\google\api\api-common\2.42.1\api-common-2.42.1.jar;C:\Users\Karey\.m2\repository\javax\annotation\javax.annotation-api\1.3.2\javax.annotation-api-1.3.2.jar;C:\Users\Karey\.m2\repository\com\google\j2objc\j2objc-annotations\3.0.0\j2objc-annotations-3.0.0.jar;C:\Users\Karey\.m2\repository\com\fasterxml\jackson\core\jackson-databind\2.17.2\jackson-databind-2.17.2.jar;C:\Users\Karey\.m2\repository\com\fasterxml\jackson\core\jackson-annotations\2.17.2\jackson-annotations-2.17.2.jar;C:\Users\Karey\.m2\repository\com\fasterxml\jackson\core\jackson-core\2.17.2\jackson-core-2.17.2.jar;C:\Users\Karey\.m2\repository\com\fasterxml\jackson\datatype\jackson-datatype-jdk8\2.17.2\jackson-datatype-jdk8-2.17.2.jar;C:\Users\Karey\.m2\repository\com\fasterxml\jackson\datatype\jackson-datatype-jsr310\2.17.2\jackson-datatype-jsr310-2.17.2.jar;C:\Users\Karey\.m2\repository\org\java-websocket\Java-WebSocket\1.6.0\Java-WebSocket-1.6.0.jar;C:\Users\Karey\.m2\repository\org\slf4j\slf4j-api\2.0.13\slf4j-api-2.0.13.jar;C:\Users\Karey\.m2\repository\org\jspecify\jspecify\1.0.0\jspecify-1.0.0.jar org.code.develop.Enums.SwitchEnum
> you are so high!
> 
> 进程已结束，退出代码为 0

#### 循环遍历枚举
枚举中有一个`values()`方法，该方法返回所有枚举常量的数组。如果要循环遍历枚举常量，此方法非常有效：

```java
package org.code.develop.Enums;

public class LoopThroughTheEnumeration {
    public static void main(String[] args) {
        for (Size mySize : Size.values()) {
            System.out.println(mySize);
        }
    }
}
```


输出：
> D:\develop\JDK17\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.2.3\lib\idea_rt.jar=13276" -Dfile.encoding=UTF-8 -classpath D:\TestCode\Java\JavaCode\target\classes;C:\Users\Karey\.m2\repository\com\mysql\mysql-connector-j\8.0.33\mysql-connector-j-8.0.33.jar;C:\Users\Karey\.m2\repository\com\google\protobuf\protobuf-java\3.21.9\protobuf-java-3.21.9.jar;C:\Users\Karey\.m2\repository\com\google\genai\google-genai\1.0.0\google-genai-1.0.0.jar;C:\Users\Karey\.m2\repository\com\google\auth\google-auth-library-oauth2-http\1.30.1\google-auth-library-oauth2-http-1.30.1.jar;C:\Users\Karey\.m2\repository\com\google\auto\value\auto-value-annotations\1.11.0\auto-value-annotations-1.11.0.jar;C:\Users\Karey\.m2\repository\com\google\code\findbugs\jsr305\3.0.2\jsr305-3.0.2.jar;C:\Users\Karey\.m2\repository\com\google\auth\google-auth-library-credentials\1.30.1\google-auth-library-credentials-1.30.1.jar;C:\Users\Karey\.m2\repository\com\google\http-client\google-http-client\1.45.2\google-http-client-1.45.2.jar;C:\Users\Karey\.m2\repository\io\grpc\grpc-context\1.68.2\grpc-context-1.68.2.jar;C:\Users\Karey\.m2\repository\io\grpc\grpc-api\1.68.2\grpc-api-1.68.2.jar;C:\Users\Karey\.m2\repository\io\opencensus\opencensus-api\0.31.1\opencensus-api-0.31.1.jar;C:\Users\Karey\.m2\repository\io\opencensus\opencensus-contrib-http-util\0.31.1\opencensus-contrib-http-util-0.31.1.jar;C:\Users\Karey\.m2\repository\com\google\http-client\google-http-client-gson\1.45.2\google-http-client-gson-1.45.2.jar;C:\Users\Karey\.m2\repository\com\google\code\gson\gson\2.11.0\gson-2.11.0.jar;C:\Users\Karey\.m2\repository\com\google\guava\guava\33.3.1-android\guava-33.3.1-android.jar;C:\Users\Karey\.m2\repository\com\google\guava\failureaccess\1.0.2\failureaccess-1.0.2.jar;C:\Users\Karey\.m2\repository\com\google\guava\listenablefuture\9999.0-empty-to-avoid-conflict-with-guava\listenablefuture-9999.0-empty-to-avoid-conflict-with-guava.jar;C:\Users\Karey\.m2\repository\org\checkerframework\checker-qual\3.43.0\checker-qual-3.43.0.jar;C:\Users\Karey\.m2\repository\com\google\errorprone\error_prone_annotations\2.36.0\error_prone_annotations-2.36.0.jar;C:\Users\Karey\.m2\repository\org\apache\httpcomponents\httpclient\4.5.14\httpclient-4.5.14.jar;C:\Users\Karey\.m2\repository\commons-logging\commons-logging\1.2\commons-logging-1.2.jar;C:\Users\Karey\.m2\repository\commons-codec\commons-codec\1.11\commons-codec-1.11.jar;C:\Users\Karey\.m2\repository\org\apache\httpcomponents\httpcore\4.4.16\httpcore-4.4.16.jar;C:\Users\Karey\.m2\repository\com\google\auto\value\auto-value\1.11.0\auto-value-1.11.0.jar;C:\Users\Karey\.m2\repository\com\google\api\api-common\2.42.1\api-common-2.42.1.jar;C:\Users\Karey\.m2\repository\javax\annotation\javax.annotation-api\1.3.2\javax.annotation-api-1.3.2.jar;C:\Users\Karey\.m2\repository\com\google\j2objc\j2objc-annotations\3.0.0\j2objc-annotations-3.0.0.jar;C:\Users\Karey\.m2\repository\com\fasterxml\jackson\core\jackson-databind\2.17.2\jackson-databind-2.17.2.jar;C:\Users\Karey\.m2\repository\com\fasterxml\jackson\core\jackson-annotations\2.17.2\jackson-annotations-2.17.2.jar;C:\Users\Karey\.m2\repository\com\fasterxml\jackson\core\jackson-core\2.17.2\jackson-core-2.17.2.jar;C:\Users\Karey\.m2\repository\com\fasterxml\jackson\datatype\jackson-datatype-jdk8\2.17.2\jackson-datatype-jdk8-2.17.2.jar;C:\Users\Karey\.m2\repository\com\fasterxml\jackson\datatype\jackson-datatype-jsr310\2.17.2\jackson-datatype-jsr310-2.17.2.jar;C:\Users\Karey\.m2\repository\org\java-websocket\Java-WebSocket\1.6.0\Java-WebSocket-1.6.0.jar;C:\Users\Karey\.m2\repository\org\slf4j\slf4j-api\2.0.13\slf4j-api-2.0.13.jar;C:\Users\Karey\.m2\repository\org\jspecify\jspecify\1.0.0\jspecify-1.0.0.jar org.code.develop.Enums.LoopThroughTheEnumeration
> LOW
> MEDIUM
> HIGH
> 
> 进程已结束，退出代码为 0



枚举和类之间的差异

enum枚举可以像class类一样具有属性和方法。唯一的区别是枚举常量是public, static 和 final（不可更改-无法重写）。

enum 枚举不能用于创建对象，也不能扩展其他类（但可以实现接口）。

为什么以及何时使用枚举?
当您知道值不会更改时，如月日期、星期、颜色等，请使用枚举。

### Java用户输入
Scanner 类用于获取用户输入，它位于 java.util包中。

要使用 Scanner 类，请创建该类的对象，并使用 Scanner 类文档中的任何可用方法。 在我们的示例中，我们将使用nextLine()方法，该方法用于读取字符串:

```java
package org.code;

import java.util.Scanner;

public class Userinput {
    public static void main(String[] args) {
        // 导入Scanner
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入内容");
        String userinput =  sc.next();

        System.out.println("你输入了： " + userinput);
    }
}
```

#### 输入类型
在上面的示例中，我们使用了 next()方法，该方法用于读取字符串。要阅读其他类型，请查看下表:

|方法	          |描述|
|----|----|
|nextBoolean()	  |从用户处读取boolean布尔值|
|nextByte()	      |从用户处读取byte字节值|
|nextDouble()     |从用户处读取double双精度值|
|nextFloat()      |从用户处读取float浮点值|
|nextInt()	      |从用户处读取int值|
|nextLine()	      |从用户处读取String字符串值|
|nextLong()	      |从用户处读取long值|
|nextShort()	  |从用户处读取short值|


在下面的示例中，我们使用不同的方法读取各种类型的数据:

```java
package org.code;

import java.util.Scanner;

class AllMethod {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter name, age and salary:");

        // 字符串输入
        String name = myObj.nextLine();

        // 数字输入
        int age = myObj.nextInt();
        double salary = myObj.nextDouble();

        // 输出用户输入
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }
}
```

> 注释: 如果输入错误（例如数字输入中的文本），将收到异常/错误消息 (如 "InputMismatchException").


### Java日期和时间
Java没有内置的Date类，但是我们可以导入`java.time`包来使用Date和time API。该包包括许多日期类和时间类。例如：


|类	|描述|
|----|----|
|LocalDate|	表示日期（年、月、日（yyyy-MM-dd））|
|LocalTime|	表示时间（小时、分钟、秒和纳秒（HH-mm-ss-ns））|
|LocalDateTime|	表示日期和时间（yyyy-MM-dd-HH-MM-ss-ns）|
|DateTimeFormatter|	格式化显示日期时间|

#### 显示当前日期
如果需要显示当前日期，请导入`java.time.LocalDate`类，并使用其`now()`方法：

```java
package org.code;

import java.time.LocalDate;

public class ShowLoaclDate {
    public static void main(String[] args) {
        LocalDate LD = LocalDate.now(); // 创建日期对象
        System.out.println("当前日期: " + LD);
    }
}
```

**输出将是**

> 当前日期: 2025-05-31

#### 显示当前日期
要显示当前时间（小时，分钟，秒和纳秒）请导入`java.time.LocalTime`类，并使用其`now()`方法：

```java
package org.code;

import java.time.LocalTime;

public class ShowLocalTime {
    public static void main(String[] args) {
        LocalTime NowTime = LocalTime.now();  // 创建获取当前时间的对象
        System.out.println("当前时间： " + NowTime);
    }
}
```

**输出将是**

> 当前时间： 13:16:38.722713700

#### 显示当前时间和日期
要实现当前时间和日期，请导入 java.time.LocalDateTime 类，并使用其now()方法:

```java
package org.code;

import java.time.LocalDateTime;

public class ShowLocalDateTime {
    public static void main(String[] args) {
        LocalDateTime LDateTime = LocalDateTime.now(); // 创建获取对象
        System.out.println(LDateTime);
    }
}
```

**输出将是**

> 2025-05-31T13:22:05.367890900

#### 格式化日期和时间
上列中的“T”用于将时间和日期分开。可以在同一个包中使用`DateTimeFormatter`类和`ofPattern()`方法格式化或者解析日期时间对象。

下面示例展示从日期时间中删除"T"和纳秒

```java
package org.code;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * 演示Java 8+中LocalDateTime类的日期时间格式化功能
 */
public class FormatDateTime {
    public static void main(String[] args) {
        // 1. 创建当前系统时间的LocalDateTime对象
        // LocalDateTime是Java 8引入的不可变类，用于表示不含时区的日期时间
        LocalDateTime currentDateTime = LocalDateTime.now();

        // 2. 打印未格式化的日期时间（默认格式：ISO-8601）
        System.out.println("未格式化 ： " + currentDateTime);

        // 3. 定义自定义日期时间格式
        // 使用DateTimeFormatter模式：
        // dd - 两位日(01-31)
        // MM - 两位月(01-12)
        // yyyy - 四位年
        // HH - 24小时制小时(00-23)
        // mm - 分钟(00-59)
        // ss - 秒(00-59)
        DateTimeFormatter customFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        // 4. 执行格式化并打印结果
        // format()方法将LocalDateTime按照指定格式转换为字符串
        String formattedDateTime = currentDateTime.format(customFormatter);
        System.out.println("格式化 ： " + formattedDateTime);
    }
}
```
**输出**

> 未格式化 ： 2025-05-31T13:50:15.037500300
> 格式化 ： 31-05-2025 13:50:15

如果希望以不同的格式显示日期和时间，则``ofPattern()`方法接受所有类型的值，例如：

|值|实例|
|----|----|
|yyyy-MM-dd|"1988-09-29"|
|dd/MM/yyyy|"29/09/1988"|
|dd-MMM-yyyy|"29-Sep-1988"|
|E, MMM dd yyyy|"Thu, Sep 29 1988"|


### JavaArrayList数组列表
`ArrayList`类是一个可调整大小的**array**数组，可以在`java.util`包中找到。
Java中内置数组和`ArrayList`的区别在于数组的大小不能修改（如果需要向数组中添加或者删除元素，必须创建一个新的数组）而可以随时从`ArrayList`中添加和删除元素。语法也略有不同：

```java
package org.code;

import java.util.ArrayList;

public class AList {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>(); // 创建一个 ArrayList 对象
    }
}
```

#### 添加元素
`ArrayList`类提供了很多有用的方法，添加元素到`ArrayList`可以使用`add()`方法
```java
package org.code;

import java.util.ArrayList;

public class ArrayListAdd {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();

        cars.add("MuGay");
        cars.add("XiaoBa");
        cars.add("High");
        cars.add("SmallGay");
        System.out.println(cars);
    }
}
```

**输出**
> [MuGay, XiaoBa, High, SmallGay]


#### 访问元素
访问`ArrayList`中的元素可以使用`get()`方法：

```java
package org.code;

import java.util.ArrayList;

public class AccessArrayListElements {
  public static void main(String[] args) {
    ArrayList<String> i = new ArrayList<String >();

    // 添加元素
    i.add("MUMu");

    // 访问元素
    System.out.println(i.get(0));
  }
}
```

> 注意：
> 数组索引从0开始，[0]是第一个元素，[1]是第二个元素

#### 修改元素
如果需要修改ArrayList中的元素可以使用`set()`方法

```java
i.set(0,"需要修改的内容");
```

#### 删除元素
如果需要删除ArrayList中的元素，可以使用`remove()`方法

```java
i.remove();
```

如果需要删除数组中的所有元素，请使用`clear()`方法
```java
i.clear();
```

#### 计算大小
如果需要计算ArrayList数组中元素的书香，可以使用`size.()`方法
```java
i.size();
```

#### 遍历数组列表
我们可以使用for循环遍历ArrayList中的元素，并使用siez.()方法指定循环应运行的次数：

```java
package org.code.develop;

import java.util.ArrayList;

public class ArrayListFor {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();

        cars.add("MuGay");
        cars.add("XiaoBa");
        cars.add("High");
        cars.add("SmallGay");

        for (int i = 0; i < cars.size();i++){
            System.out.println(cars.get(i));
        }

    }
}
```


**输出**
> MuGay
> XiaoBa
> High
> SmallGay

还可以使用for-each循环遍历：

```java
package org.code;

import java.util.ArrayList;

public class ForEachArrayList {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();

        cars.add("MuGay");
        cars.add("XiaoBa");
        cars.add("High");
        cars.add("SmallGay");

        for (String i : cars){
            System.out.println(i);
        }
    }
}
```


**输出**
> MuGay
> XiaoBa
> High
> SmallGay

#### 其他类型
ArrayList的元素实际上是对象。在上面的示例中，我们创建了类型为“String”的元素（对象。）请记住。Java的字符串是对象（而不是基元类型）。要使用其他类型，如int则必须指定一个等效的**包装类**：Integer。对于其他基本类型，请使用Boolean,Character,Double等等：

```java
package org.code;

import java.util.ArrayList;

public class ArrayListOtherTypes {
    public static void main(String[] args) {
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(10);
        myNumbers.add(15);
        myNumbers.add(20);
        myNumbers.add(25);
        for (int i : myNumbers) {
            System.out.println(i);
        }
    }
}
```

#### ArrayList排序
`java.util`包中另一个有用的类是`Collections`类，它包括用于按字母或者数字排序列表的`sort()`方法

```java
package org.code;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSort {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        Collections.sort(cars); // 排序 cars

        // 遍历输出
        for (String i : cars){
            System.out.println(i);
        }
    }
}
```

> 以此类推，我们也可以进行整数类型的排序

```java
import java.util.ArrayList;
import java.util.Collections;  // 导入集合类

public class MyClass {
  public static void main(String[] args) {
    ArrayList<Integer> myNumbers = new ArrayList<Integer>();
    myNumbers.add(33);
    myNumbers.add(15);
    myNumbers.add(20);
    myNumbers.add(34);
    myNumbers.add(8);
    myNumbers.add(12);

    Collections.sort(myNumbers);  // 排序 myNumbers

    for (int i : myNumbers) {
      System.out.println(i);
    }
  }
}
```


### Java链表
在上面中，我们了解了ArrayList类，LinkedList类与ArrayList几乎相同：

```java
package org.code;

import java.util.LinkedList;

public class LinkedListClass {
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);
    }
}
```

ArrayList与LinkedList
LinkedList 类是一个集合，可以包含许多相同类型的对象，就像 ArrayList 一样。

LinkedList 类具有与 ArrayList 类相同的所有方法，因为它们都实现了 List 接口。这意味着您可以以相同的方式添加项目、更改项目、删除项目和清除列表。

然而，虽然 ArrayList 类和 LinkedList 类可以以相同的方式使用，但它们的构建方式却大不相同。

**ArrayList 的工作原理**
ArrayList 类内部有一个常规数组。添加元素时，会将其放入数组中。如果阵列不够大，则会创建一个更大的新阵列来替换旧阵列，并移除旧阵列。

**LinkedList 的工作原理**
LinkedList 将其项目存储在"容器"中。该列表有一个指向第一个容器的链接，每个容器都有一个指向列表中下一个容器的链接。要将元素添加到列表中，将该元素放入一个新容器中，并且该容器链接到列表中的其他容器之一。

何时使用

在以下情况下最好使用 **ArrayList**:

- 想经常访问随机项目
- 只需要在列表末尾添加或删除元素

在以下情况下最好使用 **LinkedList**:

- 只能通过循环使用列表而不是访问随机项目
- 经常需要从开头或中间添加和删除项目



#### LinkedList 链表方法
在许多情况下，ArrayList 更有效，因为通常需要访问列表中的随机项，但 LinkedList 提供了几种方法来更有效地执行某些操作:

|方法|描述|
|----|----|
|addFirst()|将一个项目添加到列表的开头。|
|addLast()|将项目添加到列表末尾|
|removeFirst()|从列表的开头删除一个项目|
|removeLast()|从列表末尾删除一个项目|
|getFirst()|获取列表开头的项目|
|getLast()|获取列表末尾的项目|

### JavaHashMap

在ArayList中，我们知道了数组将项目存储为有序集合，并且必须使用索引号（`int`类型）来访问他们。然而，`HashMap`将项目存储在"key/value"对中，可以通过另一种类型的索引，（例如`String`）访问它们。

一个对象作用的另一个对象（值）的键（索引）。它们可以存储不同的类型：`String`字符串键和`Integer`整数值，或者相同类型，例如`String`字符串键和`String`字符串值：

在下方，我们创建一个名为"CapitalCities"的`HashMap`对象，它将存储字符键和字符串值：

```java
package org.code;

import java.util.HashMap;

public class CapitalCitiesClass {
  public static void main(String[] args) {
    // HashMap 对象
    HashMap<String,String> CapitalCities = new HashMap<String,String>();
  }
}
```

#### 添加项目

`HashMap`类由很多有用的方法。例如，要强其中添加项目，请使用`put()`方法：

```java
package org.code;

import java.util.HashMap;


public class CapitalCitiesClass {
  public static void main(String[] args) {
    // 创建HashMap对象
    HashMap<String,String> CapitalCities = new HashMap<String,String>();

    // 添加键和值 (Country, City)
    CapitalCities.put("England", "London");
    CapitalCities.put("Germany", "Berlin");
    CapitalCities.put("Norway", "Oslo");
    CapitalCities.put("USA", "Washington DC");

    System.out.println(CapitalCities);
  }
}
```

**输出**
> {USA=Washington DC, Norway=Oslo, England=London, Germany=Berlin}

#### 访问项目

如果需要访问`HashMap`中的值，请使用`get()`方法引用其键：

```java
capitalCities.get("England");
```

#### 移除项目

要删除一个项目，使用`remove()`方法：

```java
capitalCities.remove("England");
```

要删除所有项目，使用`clear()`方法：

```java
capitalCities.clear();
```

#### HashMap大小

要找出有多少项目，使用`size()`方法

```java
capitalCities.size();
```

#### 循环遍历 HashMap

使用For-each循环遍历`HashMap`项目。

注释：如果只需要使用键，请使用`keySet()`方法，如果只需要值，请使用`values()`方法：

```java
package org.code;

import java.util.HashMap;


public class CapitalCitiesClass {
  public static void main(String[] args) {
    // 创建HashMap对象
    HashMap<String,String> CapitalCities = new HashMap<String,String>();

    // 添加键和值 (Country, City)
    CapitalCities.put("England", "London");
    CapitalCities.put("Germany", "Berlin");
    CapitalCities.put("Norway", "Oslo");
    CapitalCities.put("USA", "Washington DC");
// --------
// 打印 keys
    for (String i : CapitalCities.keySet()) {
      System.out.println(i);
    }
// --------
  }
}
```

**输出**
> USA
> Norway
> England
> Germany

下面演示打印 values

```java
package org.code;

import java.util.HashMap;


public class CapitalCitiesClass {
  public static void main(String[] args) {
    // 创建HashMap对象
    HashMap<String,String> CapitalCities = new HashMap<String,String>();

    // 添加键和值 (Country, City)
    CapitalCities.put("England", "London");
    CapitalCities.put("Germany", "Berlin");
    CapitalCities.put("Norway", "Oslo");
    CapitalCities.put("USA", "Washington DC");
// --------
// 打印 values
    for (String i : CapitalCities.values()) {
      System.out.println(i);
    }
// --------
  }
}
```

**输出**
> Washington DC
> Oslo
> London
> Berlin

下面演示打印键和值

```java
package org.code;

import java.util.HashMap;


public class CapitalCitiesClass {
  public static void main(String[] args) {
    // 创建HashMap对象
    HashMap<String,String> CapitalCities = new HashMap<String,String>();

    // 添加键和值 (Country, City)
    CapitalCities.put("England", "London");
    CapitalCities.put("Germany", "Berlin");
    CapitalCities.put("Norway", "Oslo");
    CapitalCities.put("USA", "Washington DC"); 
    
    // 打印键和值 
    for(String i : CapitalCities.keySet()){
      System.out.println("Key: " + i + "Value: " + CapitalCities.values());
    }
  }
}
```

**输出**
> Key: USAValue: [Washington DC, Oslo, London, Berlin]
> Key: NorwayValue: [Washington DC, Oslo, London, Berlin]
> Key: EnglandValue: [Washington DC, Oslo, London, Berlin]
> Key: GermanyValue: [Washington DC, Oslo, London, Berlin]

#### 其他类型
HashMap中的键和值实际上是对象。在上面的实例中，我们使用了“String”类型的对象。请记住，Java中的String是一个对象（不是原始类型）要使用其他类型，例如int，则必须指定一个等效的包装类：Integer。对于其他原始类型，请使用: Boolean 用于 boolean, Character 用于 char, Double 用于 double 等:

下面演示，创建一个HashMap对象，存储String类型键和Integer值

```java
package org.code;

import java.util.HashMap;

public class MyHashMapPeople {
  public static void main(String[] args) {
    
    // 创建HashMap对象
    HashMap<String,Integer> people = new HashMap<String,Integer>();
    
    // 添加键和值（Name，Age）
    people.put("John", 32);
    people.put("Steve", 30);
    people.put("Angie", 33);

    for(String i : people.keySet()){
      System.out.println("Key: " + i + "Value: " + people.get(i));
    }
  }
}
```

### JavaHaspSet 集合
是项目的集合，其中每个项目都是唯一的，可以在`java.util`包中找到：

下面演示，创建一个名为cars的HashSet对象，该对象用于存储字符串：

```java
package org.code;

import java.util.HashSet;

public class MyHashSet {
    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<String>();
    }
}
```

#### 添加项目
`HashSet`类有很多有用的方法。例如，要想其中添加项目，使用`add()`方法：

```java
package org.code;

import java.util.HashSet;

public class MyHashSet {
    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Mazda");

        System.out.println(cars);
    }
}
```

> 注释：注释: 在上面的示例中，即使 BMW 被添加了两次，但它在集合中只出现一次，因为集合中的每个项目都必须是唯一的。

#### 检查项目是否存在
要检查某个项目是否存在于HashSet中，请使用`contains()`方法

```java
cars.contains("BWM");
```

#### 删除项目
如果需要删除项目，请使用`remove()`方法

```java
cars.remove("Volvo");
```

要删除所有项目，使用`clear()`方法

```java
cars.clear();
```

#### HashSet大小
要找出有多少项目，请使用`size`方法

```java
cars.size();
```

#### 遍历一个
使用for-each循环遍历`HashSet`的项目：

```java
for (String i : cars) {
    System.out.println(i);
}
```

#### 其他类型
HashSet 中的项目实际上是对象。 在上面的示例中，我们创建了"String"类型的项目（对象）。 请记住，Java 中的 String 是一个对象（不是原始类型）。 要使用其他类型，例如 int，必须指定一个等效的 包装类: Integer。 对于其他原始类型，请使用: Boolean 用于 boolean, Character 用于 char, Double 用于 double 等:

```java
package org.code;

import java.util.HashSet;

public class MyHashSetClass {
    public static void main(String[] args) {
        // 创建一个名为 numbers 的 HashSet 对象
        HashSet<Integer> numbers = new HashSet<Integer>();

        // 将值添加到集合
        numbers.add(4);
        numbers.add(7);
        numbers.add(8);

        // 显示 1 到 10 之间的数字在集合中
        for(int i = 1; i <= 10; i++) {
            if(numbers.contains(i)) {
                System.out.println(i + " was found in the set.");
            } else {
                System.out.println(i + " was not found in the set.");
            }
        }
    }
}
```

### Java迭代器
`Iterator`是一个可用于循环遍历集合的对象，例如`ArrayList`和`HashSet`。他被称为“迭代器”，因为**迭代**是指循环的技术术语。

要使用迭代器，必须要从`java.util`中导入

#### 获取迭代器

```java
package org.code;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorOperator {
    public static void main(String[] args) {

        // 创建一个集合
        ArrayList<String> cars = new ArrayList<String>();

        // 向集合中添加数据
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        // 获取迭代器
        Iterator<String> it = cars.iterator();

        // 打印第一项
        System.out.println(it.next());
    }
}
```

**输出**
> Volvo

#### 循环遍历集合
要遍历集合，请使用迭代器的`hasNext()`和`next()`方法：

```java
while(it.hashNext()) {
    System.out.println(it.next())    
}
```

#### 从集合中删除项目
迭代器旨在轻松更改它们循环的集合。`remove()`方法可以在循环时从集合中删除项目。

下面演示，使用迭代器从集合中删除小于10的数字：

```java
package org.code;

import java.util.ArrayList;
import java.util.Iterator;

public class DeleteItemsFromSet {
    public static void main(String[] args) {
        // 创建集合
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        // 向集合中添加数据
        numbers.add(12);
        numbers.add(8);
        numbers.add(2);
        numbers.add(23);

        // 创建迭代器
        Iterator<Integer> it = numbers.iterator();

        // 使用while删除数据
        while (it.hasNext()){
            Integer i = it.next();
            if (i < 10) {
                it.remove();
            }
        }

        System.out.println(numbers);

    }
}
```

> 注释：尝试使用 for 循环或 for-each 循环删除项目将无法正常工作，因为集合在代码尝试循环的同时改变大小。

### Java包装类
包装类提供了一种将原始数据类型（int,boolean等）用作对象的方法。

下表显示了原始类型和等效的包装类：

|原始数据类型|包装类|
|----|----|
|byte|Byte|
|short|Short|
|int|Integer|
|long|Long|
|float|Float|
|double|Double|
|boolean|Boolean|
|char|Character|

有时您必须使用包装类，例如在使用 Collection 对象时，例如 ArrayList，其中不能使用原始类型（列表只能存储对象）:

```java
ArrayList<int> myNumbers = new ArrayList<int>(); // 无效的
```

```java
ArrayList<Integer> myNumbers = new ArrayList<Integer>(); // 有效的
```

#### 创建包装对象
要创建包装器对象，请使用包装器类而不是原始类型。要获取值，只需要打印对象：

```java
public class MyClass {
  public static void main(String[] args) {
    Integer myInt = 5;
    Double myDouble = 5.99;
    Character myChar = 'A';
    System.out.println(myInt);
    System.out.println(myDouble);
    System.out.println(myChar);
  }
}
```

由于您现在正在处理对象，因此您可以使用某些方法来获取有关特定对象的信息。

例如，以下方法用于获取与对应包装对象关联的值: intValue(), byteValue(), shortValue(), longValue(), floatValue(), doubleValue(), charValue(),
booleanValue().

此示例将输出与上例相同的结果:

```java
public class MyClass {
  public static void main(String[] args) {
    Integer myInt = 5;
    Double myDouble = 5.99;
    Character myChar = 'A';
    System.out.println(myInt.intValue());
    System.out.println(myDouble.doubleValue());
    System.out.println(myChar.charValue());
  }
}
```

> 输出：
> 5
> 5.99
> A

另一个有用的方法时`toString()`方法，它用于将包装对象转换为字符串

在下面的例子中，我们将Integer转换为String，并使用String类的length()方法输出"字符串"的长度：

```java
package org.code;

public class IntegerToString {
    public static void main(String[] args) {
        Integer myInt =10;

        String myString = myInt.toString();

        System.out.println(myString.length());
    }
}
```

### Java异常 - Try...Catch

在执行Java代码时，可能会出现不同的错误：程序员编写的编码错误，错误输入导致的错误或者其他无法预料的事情。

发生错误时，Java通常回停止并生成错误信息。对此的技术术语是：Java将抛出异常

#### Java Try 和 Catch

try 语句允许定义一个代码块，以便在执行时对其进行错误测试。

如果 try 块中发生错误， catch 语句允许您定义要执行的代码块。

try 和 catch 关键字成对出现:

```java
try {
  //  要尝试的代码块
}
catch(Exception e) {
  //  处理错误的代码块
}
```

我们可以使用下面的示例来捕获错误信息

```java
package org.code;

public class MyTryCatch {
  public static void main(String[ ] args) {
    try {
      int[] myNumbers = {1, 2, 3};
      System.out.println(myNumbers[10]);
    } catch (Exception e) {
      System.out.println("Something went wrong.");
    }
  }
}
```

**输出**

> Something went wrong.


#### Finally
`finally`语句运行在`try...catch`之后执行代码，而不管结果如何：

```java
package org.code;

public class MyFinally {
  public static void main(String[] args) {
    try {
      int[] myNumbers = {1,2,3};
      System.out.println(myNumbers[10]);
    }catch(Exception e){
      System.out.println("Something went wrong.");
    }finally {
      System.out.println("The 'try catch' is finished.");
    }
  }
}
```

**输出**

> Something went wrong.
> The 'try catch' is finished.

#### throw 关键字

`throw`语句允许创建自定义错误

`throw`语句与**异常类型**一起使用。Java中许多异常类型可用：ArithmeticException, FileNotFoundException, ArrayIndexOutOfBoundsException, SecurityException, etc:

| 异常类型                         | 运行时异常 | 所属包                     | 简要说明                                                                 |
|----------------------------------|------------|----------------------------|--------------------------------------------------------------------------|
| ArithmeticException              | 是         | java.lang                  | 算术运算异常，如除以0                                                   |
| ArrayIndexOutOfBoundsException   | 是         | java.lang                  | 数组下标越界                                                             |
| NullPointerException             | 是         | java.lang                  | 访问 null 引用对象的方法或属性                                          |
| ClassCastException               | 是         | java.lang                  | 类型强制转换错误                                                         |
| IllegalArgumentException         | 是         | java.lang                  | 传递非法参数给方法                                                       |
| NumberFormatException            | 是         | java.lang                  | 字符串转换为数字时格式不正确                                             |
| IllegalStateException            | 是         | java.lang                  | 在不适合当前状态下调用方法                                               |
| IndexOutOfBoundsException        | 是         | java.lang                  | 索引越界（如 List、字符串等）                                            |
| SecurityException                | 是         | java.lang                  | 安全管理器检测到安全违规                                                |
| UnsupportedOperationException    | 是         | java.lang                  | 对象不支持调用的操作                                                     |
| FileNotFoundException            | 否         | java.io                    | 文件未找到                                                              |
| IOException                      | 否         | java.io                    | 输入/输出操作异常                                                       |
| EOFException                     | 否         | java.io                    | 输入流已到达文件结尾                                                    |
| ClassNotFoundException           | 否         | java.lang                  | 找不到指定类                                                            |
| NoSuchMethodException            | 否         | java.lang                  | 访问的类中不存在某方法                                                  |
| InterruptedException             | 否         | java.lang                  | 线程被中断                                                              |
| SQLException                     | 否         | java.sql                   | JDBC 操作数据库时发生异常                                               |
| InvocationTargetException        | 否         | java.lang.reflect          | 调用通过反射机制执行的方法时抛出的异常                                   |
| InstantiationException           | 否         | java.lang                  | 尝试创建抽象类或接口的实例时抛出                                        |
| MalformedURLException            | 否         | java.net                   | URL 格式不正确                                                           |

> **备注**：
>
> - 运行时异常（RuntimeException 及其子类）不强制捕获，可选 try-catch
> - 非运行时异常（Checked Exception）必须通过 try-catch 或 throws 显式处理。

下面演示如果年龄低于 18 岁，则抛出异常（打印"访问被拒绝"）。如果年龄为 18 岁或以上，请打印"访问权限":

```java
package org.code;

public class IfThrow {
  static void checkAge(int age) {
    if (age < 18) {
      throw new ArithmeticException("访问拒绝 - 未满18岁！");
    } else {
      System.out.println("访问允许！");
    }
  }

  public static void main(String[] args) {
    checkAge(1);
  }
}
```

输出

> Exception in thread "main" java.lang.ArithmeticException: 访问拒绝 - 未满18岁！
> at org.code.IfThrow.checkAge(IfThrow.java:6)
> at org.code.IfThrow.main(IfThrow.java:13)

如果年龄为20岁，则不会抛出异常

```java
checkAge(20);
```

输出将是:

> Access granted - You are old enough!

### Java正则表达式

Q&A

Q：什么是正则表达式？
A：正则表达式是形成搜索模式的字符序列。当在文本中搜索数据时，可以使用此搜索模式来描述需要搜索的内容

A：正则表达式可以是单个字符，也可以是更复杂的模式

A：正则表达式可以用于执行所有类型的文本搜索和文本替换操作

- Java中没有内置的正则表达式类，但我们可以导入`java.util.regex`包来使用正则表达式。该软件包包括以下类：
  - `Pattern`类 - 定义模式（用于搜索）
  - `Matcher`类 - 用于搜索模式
  - `PatternSyntaxException`类 - 指示正则表达式模式中的语法错误

下面演示，从句中找出是否出现 “MuGay” 这个词：

```java
// 声明包名，表示该类属于 org.code.develop.RegularExpression 包
package org.code.develop.RegularExpression;

// 导入 Java 正则表达式相关的类
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * FindMuGay 类用于演示如何使用 Java 正则表达式
 * 来在字符串中查找是否存在指定的模式。
 */
public class FindMuGay {

  // 主方法：程序入口点
  public static void main(String[] args) {
    
    // 创建一个正则表达式模式对象，匹配字符串 "MuGay"，忽略大小写
    Pattern pattern = Pattern.compile("MuGay", Pattern.CASE_INSENSITIVE);

    // 创建一个匹配器对象，用于在指定字符串中搜索 pattern 所定义的正则表达式
    Matcher matcher = pattern.matcher("I am MuGay!");

    // 尝试在字符串中查找是否存在匹配项
    boolean matchFound = matcher.find();

    // 根据查找结果输出匹配是否成功的信息
    if (matchFound) {
      System.out.println("Match Found!");  // 如果找到了匹配项，输出此信息
    } else {
      System.out.println("Match not Found!");  // 如果没有找到匹配项，输出此信息
    }
  }
}
```

输出：

> Match Found!

**实例解析**

在此示例中，正在一个句子中搜索单词 "MuGay" 。

首先，使用 Pattern.compile() 方法创建模式。第一个参数指示正在搜索的模式，第二个参数有一个标志来指示搜索应该不区分大小写。第二个参数是可选的。

matcher() 方法用于搜索字符串中的模式。它返回一个 Matcher 对象，其中包含有关已执行搜索的信息。

如果在字符串中找到模式，find() 方法返回 true，如果没有找到，则返回 false。

#### Flags标志
`compile()`方法中的标志改变了搜索的执行方式，这里有几个：
- `Pattern.CASE_INSENSITIVE` - 执行搜索时将忽略字母的大小写
- `Pattern.LITERAL` - 模式中的特殊字符没有任何特殊含义，在执行搜索时将被视为普通字符
- `Pattern.UNICODE_CASE` - 将它与 `CASE_INSENSITIVE` 标志一起使用，也可以忽略英文字母之外的字母的大小写

#### 正则表达式模式
`Pattern.compile()方法的第一个参数是模式。他描述了正在搜索的内容`

括号用于查找一系列字符：

|表达式|描述|
|----|----|
|[abc]|从括号内的选项中查找一个字符|
|[^abc]|找到一个不在括号内的字符|
|[0-9]|从 0 到 9 范围内查找一个字符|

#### 元字符

元字符是具有特殊含义的字符：

|元字符|描述|
|----|----|
| I | 查找由 I 分隔的任意一种模式的匹配项如: cat dog fish |
|.|只查找任何字符的一个实例|
|^|查找作为字符串开头的匹配项，如: ^Hello|
|$|在字符串末尾查找匹配项，如: World$|
|\d|找一个数字|
|\s|查找空白字符|
|\b|在这样的单词开头查找匹配项: \bWORD，或在这样的单词结尾处查找匹配项: WORD\b|
|\uxxxx|查找十六进制数 xxxx 指定的 Unicode 字符|

> 元字符第一个 “I” 严格意义上来说是 " | " 制表符的这个符号，但是由于Markdown格式无法写入，所以只能用I替代，在实际开发时，请使用 " | "!

#### 量词

量词定义数量：

|量词|描述|
|----|----|
|n+|匹配任何至少包含一个 n 的字符串|
|n*|匹配包含零次或多次出现 n 的任何字符串|
|n?|匹配包含零次或一次出现 n 的任何字符串|
|n{x}|匹配任何包含一系列 X n 的字符串|
|n{x,y}|匹配任何包含 X 到 Y n 序列的字符串|
|n{x,}|匹配任何包含至少 X n 的序列的字符串|

> 注释: 如果您的表达式需要搜索其中一个特殊字符，您可以使用反斜杠 (\) 对其进行转义。在Java中，字符串中的反斜杠需要自己转义，所以需要两个反斜杠来转义特殊字符。例如，要搜索一个或多个问号，您可以使用以下表达式:"\\?"

### Java线程