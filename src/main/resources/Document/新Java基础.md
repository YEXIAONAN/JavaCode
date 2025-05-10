## Java基础

> 痛定思痛，在之前的学习Java过程中感觉之前学习的都没有很理解，因为之前看的是某马程序员的课程，前面还好，到后面感觉不怎么理解了。所以说就打算重新来学习一遍Java，本次课程看的是韩老师的课程编写。

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

### Java开发注意事项和细节说明
