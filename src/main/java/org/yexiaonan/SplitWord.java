package org.yexiaonan;

public class SplitWord {
    public static void main(String[] args) {
        String Stri = "木木老师，叶叶老师，黄黄老师，想想老师";

        String[] MM = Stri.split("，");

        for (String Kery : MM){
            System.out.println(Kery);
        }
    }
}
