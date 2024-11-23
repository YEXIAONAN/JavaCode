package org.yexiaonan;

// 由于在Java中没有像Python的Input语句，调用一个包来进行从键盘获取用户输入
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        // 1.编写一个程序，打印出从1到100的所有数字。
        // 使用For循环进行遍历将数字打印
        for (int NumTask = 1; NumTask <= 100 ; NumTask++){
            System.out.println(NumTask);
        }
/*
------------------------------------------------
 */
        // 2.编写一个程序，接受用户输入的一个字符串，然后反转该字符串并输出。
        // 创建一个对象指针，使其可以使用刚刚导入的Scanner包
        Scanner scanner = new Scanner(System.in);

        // 提示用户输入字符串
        System.out.println("Enter String");

        // 将用户输入的字符串存储到一个变量中
        String UserInput = scanner.nextLine();

        // 使用StringBulider将存储进来的变量反转存储到一个新的变量中进行输出
        String UserInputF = new StringBuilder(UserInput).reverse().toString();
        System.out.println(UserInputF);
/*
------------------------------------------------
 */
        // 3.编写一个程序，计算两个整数的和、差、积和商（假设除数不为零）。
        // 将两个整数分别赋值为a1,a2
        int a1 = 10;
        int a2 = 10;
        // 多加一条变量是因为在计算“商”时，如果使用字符串拼接会导致报错，这个不知道怎么解决，只能先计算数值在进行字符串拼接
        int a3 = a1 - a2;

        System.out.println("和：" + a1 + a2);
        System.out.println("差：" + a3);
        System.out.println("积：" + a1 * a2);
        System.out.println("商：" + a1 / a2);

/*
------------------------------------------------
 */
        // 4.编写一个程序，判断一个给定的年份是否是闰年
        System.out.println("请输入一个年份：");
        // 将用户输入的数据进行存储到变量
        int UserYear = scanner.nextInt();

        // 关闭Scanner
        scanner.close();

        // 使用自己新建的一个方法来判断用户输入的是否是闰年
        if (IfYear(UserYear)){
            System.out.println(UserYear + "是闰年");
        }else {
            System.out.println(UserYear + "不是闰年");
        }
        // 5.编写一个程序，找出数组中的最大值和最小值。


    }

    // 声明一个方法使其可以进行计算，判断用户输入的是否是闰年
    public static boolean IfYear(int UserYear){
        // 如果年份能被4整除且不能被100整除，或者能被400整除，则为闰年
        return (UserYear % 4 == 0 && UserYear % 100 != 0) || (UserYear % 400 == 0);
    }




    // 6.编写一个程序，实现一个简单的计算器，能够进行加、减、乘、除运算。

    // 7.编写一个程序，检查一个字符串是否是回文（即正读和反读都一样）。

    // 8.编写一个程序，生成并打印出一个Fibonacci数列的前N项。

    // 9.编写一个程序，读取一个文件中的所有内容，并将其写入到另一个文件中。

    // 10.编写一个程序，实现一个简单的银行账户类，包含存款、取款、查询余额等功能。

}
