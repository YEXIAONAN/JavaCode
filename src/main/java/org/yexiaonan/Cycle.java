package org.yexiaonan;

/**
 * 循环的写法
 */
public class Cycle {
    public static void main(String[] args) {
        // while语法
        // 在控制台输出 1~10
        int i1  = 0;
        while (i1<=10) {
            System.out.println(i1);
            i1++;
        }

        // do while 语法
        int i2 = 0;
        do {
            System.out.println(i2);
            i2++;
        }while (i2<=10);

        // for 语法
        for (int i3 = 0 ; i3<=10; i3++){
            System.out.println(i3);
        }

        // for 增强语法
        int[] a = new int[]{1,2,3,4,5,6,7,8,9,10};
        for (int num:a){
            System.out.println(num);
        }
    }
}
