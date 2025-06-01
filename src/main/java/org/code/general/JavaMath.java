package org.code.general;

public class JavaMath {
    public static void main(String[] args) {
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
        //如何更好地利用随机数，例如，您只需要一个介于0和100之间的随机数，可以使用以下公式:
        int randomNum = (int)(Math.random() * 101);
        System.out.println(randomNum);


    }
}
