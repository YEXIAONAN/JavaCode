package org.code.general;

import java.util.Scanner;

public class StringBuilderTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a string");

        String input = sc.nextLine();

        String sb = new StringBuilder(input).reverse().toString();

        System.out.println(sb);

    }
}
