package com;

import java.util.Scanner;

public class Pallindrome {
    static boolean isPalindrome(int num) {
        int org = num;
        int rev = 0;

        while (num > 0) {
            int temp = num % 10;
            rev = (rev * 10) + temp;
            num = num / 10;
        }

        return org == rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter num : ");
        int num = sc.nextInt();
        if (isPalindrome(num)) {
            System.out.println(num + " is Palindrome");
        } else {
            System.out.println(num + " is NOT Palindrome");
        }
    }
}
