package org.example;

import java.util.Scanner;

public class Task3Quadratic {
    public static void run(Scanner in) {
        System.out.print("Enter a: ");
        double a = in.nextDouble();
        System.out.print("Enter b: ");
        double b = in.nextDouble();
        System.out.print("Enter c: ");
        double c = in.nextDouble();

        if (a == 0) {
            System.out.println("a must not be zero.");
            return;
        }

        System.out.printf("a = %.2f, b = %.2f, c = %.2f%n", a, b, c);

        double delta = b * b - 4 * a * c;
        System.out.printf("delta = %.2f%n", delta);

        switch (Double.compare(delta, 0)) {
            case -1 -> System.out.println("No real roots.");
            case 0 -> {
                double x1 = -b / (2 * a);
                System.out.printf("x1 = %.2f%n", x1);
            }
            default -> {
                double sqrtDelta = Math.sqrt(delta);
                double x1 = (-b - sqrtDelta) / (2 * a);
                double x2 = (-b + sqrtDelta) / (2 * a);
                System.out.printf("x1 = %.2f, x2 = %.2f%n", x1, x2);
            }
        }
    }
}
