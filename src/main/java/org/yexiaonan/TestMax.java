package org.yexiaonan;

public class TestMax {
    public static void main(String[] args) {
        int i = 5;
        int j = 2;
        int k = max(i,j);
        System.out.println(i + "和" + j + "比较，最大值是: " + k );

    }

    /**
     * 比较两个整数的大小，返回其中的最大值。
     * 
     * @param sum1 第一个整数
     * @param sum2 第二个整数
     * @return 两个整数中的最大值
     */
    public static int max(int sum1, int sum2) {
        // 用于存储比较结果的变量
        int result;
        // 判断 sum1 是否大于 sum2
        if (sum1 > sum2) {
            // 如果 sum1 大于 sum2，则将 sum1 赋值给 result
            result = sum1;
        } else {
            // 否则，将 sum2 赋值给 result
            result = sum2;
        }
        // 返回比较结果
        return result;
    }
}
