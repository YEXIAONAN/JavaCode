package org.code.general;

public class SwitchOperator {
    public static void main(String[] args) {
        int day = 4;
        switch (day) {
            case 6:
                System.out.println("Today is Saturday");
                break;
            case 7:
                System.out.println("Today is Sunday");
                break;
            default:
                System.out.println("Looking forward to the Weekend");
        }
        // 输出 "Looking forward to the Weekend"
    }
}
