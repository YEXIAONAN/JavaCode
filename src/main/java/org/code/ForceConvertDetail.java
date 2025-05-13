package org.code;

public class ForceConvertDetail {
    public static void main(String[] args) {
        // 如果需要对多种数据进行求和，需要使用（）来提升计算的优先级，然后才能进行编译。
        // 例如像下方的代码就是无法运行的，因为其最终得到的数据类型与赋值数据类型不相符
        //int x = (int)10*3.5+6*1.5;
        // 正确写法：
        //        int x = (int)(10*3.5+6*1.5);
        //        System.out.println(x);

        char c1 = 100;
        int m = 100;

        // char 只能保存常量，不能覆盖变量值
//        char c2 = m;
        // 强制类型转换
        char c3 = (char)m;

    }
}
