// 自动类型转换
package org.code.general;

@SuppressWarnings({})
public class AutomaticConvertDetail {
    public static void main(String[] args) {
        /*
        有多种数据类型混合运算时，系统将所有数据转换成最大的数据类型，在进行计算。
         */
        int a1 = 10;
        float a2 = 10.5f;
        double a3 = a1 +a2;
        System.out.println(a3);
    }
}
