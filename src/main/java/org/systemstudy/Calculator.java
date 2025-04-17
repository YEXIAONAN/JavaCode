package org.systemstudy;

public class Calculator {
    public static double average(int[] numbers) {
        int sum  = 0;
        for (int number : numbers) {
            sum += number;
        }
        double avg = (double) sum / numbers.length;
        return avg;

    }
}
