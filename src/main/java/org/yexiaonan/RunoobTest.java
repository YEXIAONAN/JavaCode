package org.yexiaonan;

public class RunoobTest{
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder(10);

        sb.append("Runoob..");
        System.out.println(sb);
        sb.append("!");
        System.out.println(sb);
        sb.insert(8, "Java");
        System.out.println(sb);
        sb.delete(5,8);
        System.out.println(sb);
    }
}