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