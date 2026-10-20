package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("--- Task 3: quadratic equation ---");
        Task3Quadratic.run(in);

        System.out.println();
        System.out.println("--- Task 5: smallest and largest of 10 random numbers ---");
        Task5MinMax.run();
    }
}
