package org.code.develop;

// 导入工具类
import org.code.tools.MainTools;

import java.util.Scanner;

//import static org.code.tools.MainTools.XNInfomation.printAuthor;

public class Tools {
    public static void main(String[] args) {
        // 创建Scanner对象，获取用户输入
        Scanner sc = new Scanner(System.in);

        // 设置NanTools是否启用Debug模式
        MainTools.setDebug(false);

        String Userinput_1 = sc.next();

        String Userinput_2 = sc.next();


        System.out.println(MainTools.TextMatching(Userinput_1,Userinput_2));
    }
}
