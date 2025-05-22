package org.code;

public class Displacement {
    public static void main(String[] args) {
        int a = 1 >> 2;
        int b = -1 >> 2;
        int c = 1 << 2;
        int d = -1 << 2;
        int e = 3 >>> 2;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
    }
}
