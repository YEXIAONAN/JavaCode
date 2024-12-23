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
        boolean result = ++a < 5 & ++b <5;
        System.out.println(result);
        System.out.println(a);
        System.out.println(b);
    }
}
