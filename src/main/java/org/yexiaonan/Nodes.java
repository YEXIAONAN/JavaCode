package org.yexiaonan;

public class Nodes {
    public static void main(String[] args) {
        /*
         * 妈妈问我想吃啥，有：
         * 兰州拉面，武汉热干面，北京炸酱面，陕西油泼面
         */
        String Noodles = "1";

        switch (Noodles){
            case "兰州拉面":
                System.out.println("吃兰州拉面");
                break;
            case "武汉热干面":
                System.out.println("吃武汉热干面");
                break;
            case "北京炸酱面":
                System.out.println("吃北京炸酱面");
                break;
            case "陕西油泼面":
                System.out.println("吃陕西油泼面");
                break;

            default:
                System.out.println("我吃你妈逼呢 操你妈小逼崽子 吃你妈逼去");
                break;
        }
    }
}
