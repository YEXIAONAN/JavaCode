package org.yexiaonan;

import java.util.Objects;
import java.util.Scanner;

public class ForSwitch {
    public static void main(String[] args) {
//        Scanner  sc  = new Scanner(System.in);
//        int mum = sc.nextInt();
//        if (mum == 5201314){
//            System.out.println("5201314");
//        }else {
//            System.out.println("3388");
//        }
        Scanner sc = new Scanner(System.in);

        for (;;){
            System.out.println("请输入你要输入的话：");
            String data = sc.next();
            System.out.println("你输入了："+data);
        }


    }
}
