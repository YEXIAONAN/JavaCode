package org.yexiaonan;

import java.util.Enumeration;

public class Switchinthree {
    public static void main(String[] args) {
//        int number = 4;
//        switch (number){
//            case 1:
//                System.out.println('1');
//                break;
//            case 2:
//                System.out.println('2');
//                break;
//            case 3:
//                System.out.println('3');
//                break;
//            default:
//                System.out.println('?');
//        }
        int num = 3;
        switch (num) {
            case 1 -> {
                System.out.println('1');
            }
            case 2 -> {
                System.out.println('2');
            }
            default -> {
                System.out.println("Is No");
            }
        }

    }
}
