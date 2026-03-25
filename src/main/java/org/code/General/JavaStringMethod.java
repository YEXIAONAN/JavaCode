package org.code.General;

import java.util.Locale;

public class JavaStringMethod {
    public static void main(String[] args) {
        String greeting = "hello";
        System.out.println(greeting.length());
        System.out.println(greeting.toUpperCase(Locale.ROOT));
        System.out.println(greeting.toLowerCase());
    }
}
