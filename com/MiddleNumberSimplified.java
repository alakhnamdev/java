package com;

import java.util.Scanner;

public class MiddleNumberSimplified {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        int middle = 0; // Initialize a default value

        // 1. Check if 'a' is the middle number
        if (a > b) {
            // Nested check: If a > b, 'a' is middle if a < c (b < a < c)
            if (a < c) {
                middle = a;
            }
        } else { // This means a < b
            // Nested check: If a < b, 'a' is middle if a > c (c < a < b)
            if (a > c) {
                middle = a;
            }
        }

        // 2. If 'a' wasn't the middle, it must be 'b' or 'c'.
        // We only need to check one of them, then the other is the remainder.
        if (middle == 0) {
            if (b > a) {
                // Nested check: If b > a, 'b' is middle if b < c (a < b < c)
                if (b < c) {
                    middle = b;
                } else {
                    // b > a AND b > c means 'b' is the largest, so 'c' must be the middle.
                    middle = c;
                }
            } else { // This means b < a
                // Nested check: Since 'a' wasn't the middle, and b < a, we check 'b' against 'c'.
                if (b > c) {
                    middle = b; // c < b < a
                } else {
                    // b < a AND b < c means 'b' is the smallest, so 'a' must be the middle (a was already checked, but we're simplifying the final logic here).
                    // In the original, complex code, the logic to find the middle flowed correctly.
                    // To simplify this branch and still guarantee the correct middle, we assign 'c' as the only remaining possibility.
                    middle = c; 
                }
            }
        }

        System.out.println("The middle number is: " + middle);
        sc.close();
    }
}