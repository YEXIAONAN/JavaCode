package org.code.General;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TypeList {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("测试，输入String类型");
        String String_1 = bf.readLine();

        System.out.println("输入Int类型");
        int int_1 = Integer.parseInt(bf.readLine());

        System.out.println(splicing.splicingClass(String_1,int_1));
        System.out.println();



    }

    private static class splicing{
        public static String splicingClass(String in_1, int in_2){
            return in_1 + in_2;
        }
    }



}
