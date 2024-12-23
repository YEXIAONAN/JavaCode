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
