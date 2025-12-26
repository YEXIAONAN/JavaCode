package org.code.General;

import java.util.Scanner;

public class TextSplicing {

    public class Textadd {
        public static String addText(String input_1, String input_2){
            return input_1 + input_2;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("两段话拼接，请输入第一段话：");
        String user_input_1 = sc.nextLine();

        System.out.println("请输入第二段话：");
        String user_input_2 = sc.nextLine();

        String result = Textadd.addText(user_input_1,user_input_2);

        System.out.println("您输入了：" + result);
    }


}
