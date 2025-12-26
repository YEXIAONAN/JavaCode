package org.code.General;

public class PalindromeCheck {
    public static void main(String[] args) {
        String s1 = "aba";      // 回文
        String s2 = "hello";    // 不是回文
        String s3 = "12321";    // 回文
        String s4 = "AbA";      // 忽略大小写后是回文

        System.out.println(s1 + " -> " + isPalindrome(s1));
        System.out.println(s2 + " -> " + isPalindrome(s2));
        System.out.println(s3 + " -> " + isPalindrome(s3));
        System.out.println(s4 + " -> " + isPalindrome(s4));
    }

    // 判断是否为回文的方法
    public static boolean isPalindrome(String s) {
        if (s == null) return false;

        // 统一转换为小写，忽略大小写
        s = s.toLowerCase();

        // 反转字符串再比较
        String reversed = new StringBuilder(s).reverse().toString();

        return s.equals(reversed);
    }
}
