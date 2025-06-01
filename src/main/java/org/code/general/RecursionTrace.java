package org.code.general;

public class RecursionTrace {
    public static void main(String[] args) {
        int n = 5;
        int result = sum(n);
        System.out.println("1 到 " + n + " 的累加和是: " + result);
    }

    public static int sum(int k) {
        System.out.println("进入 sum(" + k + ")");
        if (k <= 0) {
            System.out.println("终止递归，返回 0");
            return 0;
        } else {
            int res = k + sum(k - 1);
            System.out.println("sum(" + k + ") 计算结果是: " + res);
            return res;
        }
    }
}
