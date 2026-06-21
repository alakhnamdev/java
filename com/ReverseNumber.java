package com;

import java.util.Scanner;

public class ReverseNumber {
    static int reverseNumber(int num) {
        int rev = 0;
        while (num > 0) {
            int temp = num % 10;
            rev = (rev * 10) + temp;
            num = num / 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Reversed Number = " + reverseNumber(num));
    }
}
