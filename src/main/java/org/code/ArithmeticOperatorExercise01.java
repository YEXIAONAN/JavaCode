package org.code;

public class ArithmeticOperatorExercise01 {
    public static void main(String[] args) {
        int i = 1;
        i = i++;
        System.out.println(i);
        // 这道题就是一个很经典的临时变量例子
        // i 在被赋值为 i++ 之前就把值存储在了一个临时变量中（temp）那么temp = i的原值（1）
        // 随后，在进行自增，i ++ = 2，然后temp的值又重写了i。
        // 最终的结果就为 1

        int s = 1;
        s = ++s;
        System.out.println(s);
        // 先自增，然后再赋值，简简单单最后结果是2
    }
}
