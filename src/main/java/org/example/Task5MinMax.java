package org.example;

import java.util.Random;

public class Task5MinMax {
    public static void run() {
        Random random = new Random();
        int count = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        System.out.println("Drawn numbers:");
        while (count < 10) {
            int number = random.nextInt(1, 101);
            System.out.println(number);
            if (number < min) {
                min = number;
            }
            if (number > max) {
                max = number;
            }
            count++;
        }

        System.out.println("Smallest: " + min);
        System.out.println("Largest: " + max);
    }
}
