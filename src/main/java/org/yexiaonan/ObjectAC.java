package org.yexiaonan;

public class ObjectAC {
    public static void main(String[] args) {
        ObjectAS S1 = new ObjectAS();
        ObjectAI I1 = new ObjectAI();

        S1.tString = "ObjectAT-String方法";
        S1.STR_INT = new String[]{String.valueOf(1), String.valueOf(0)};


        // 调用print方法输出
        S1.tPrintInfo();



    }
}
