package com;

public class Prime {
    static boolean checkPrime(int num) {
        if (num <= 1)
            return false;
        for (int i = 2; i < num; i++) { // optimized loop
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    static void printPrime(int num) {
        for (int i = 2; i < num; i++) {
            if (checkPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        printPrime(100);
    }
}