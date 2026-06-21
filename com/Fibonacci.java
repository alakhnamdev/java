package com;

public class Fibonacci {
    static int[] fibonacciSeries(int terms) {
        int fibo[] = new int[terms];
        fibo[0] = 0;
        fibo[1] = 1;

        for (int i = 0; i < terms-2; i++) {
            fibo[i+2] = fibo[i] + fibo[i+1];
        }
        return fibo;
    }

    public static void main(String[] args) {
        int fibo[] = fibonacciSeries(10);
        for (int i : fibo) {
            System.out.println(i);
        }
    }
}
