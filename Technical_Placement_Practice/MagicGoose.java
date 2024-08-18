package com.main;

import java.util.Scanner;

public class MagicGoose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the day");
        int day = sc.nextInt();

        if (day > 0 && day <= 30) {
            long eggs = calculateEggs(day);
            System.out.println("Number of eggs laid on day " + day + " is " + eggs);
        } else {
            System.out.println(day + " is an invalid day");
        }
    }

    public static long calculateEggs(int day) {
        if (day <= 2) {
            return day;
        } else {
            long a = 1;
            long b = 2;
            long c = 0;

            for (int i = 3; i <= day; i++) {
                c = (2 * b) + a;
                a = b;
                b = c;
            }

            return c;
        }
    }
}
