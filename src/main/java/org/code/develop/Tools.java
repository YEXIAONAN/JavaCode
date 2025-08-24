package org.code.develop;

// 导入工具类
import org.code.tools.MainTools;

import java.util.Scanner;

import static org.code.tools.MainTools.XNInfomation.printAuthor;

public class Tools {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MainTools.setDebug(true);

        String Userinput_1 = sc.next();

        String Userinput_2 = sc.next();


        System.out.println(MainTools.TextContext(Userinput_1,Userinput_2));


        printAuthor();
    }
}
