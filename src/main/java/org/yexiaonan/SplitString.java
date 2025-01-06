package org.yexiaonan;

public class SplitString {
    public static void main(String[] args) {
        // 定义一堆字符串
        String Str = "木木 老师 木木 木棍 小木";

        // 以空格作为分隔符,将字符串类型分割后转换为数组写入mumu变量
        String[] mumu = Str.split(" ");

        // 对数组中的每一个元素(mumu)进行遍历，然后写入MM变量
        for (String MM : mumu){
            System.out.println(MM);
        }
    }
}
