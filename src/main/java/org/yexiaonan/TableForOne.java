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

        System.out.println(UserInput01 > UserInput02);


            // 除了可以用关系比较还可以用if判断语句
//        if (UserInput01 >= UserInput02){
//            System.out.println("true");
//        }else {
//            System.out.println("false");
//        }



    }
}
