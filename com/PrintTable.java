package com;

import java.util.Scanner;

public class PrintTable {
    static void printTable(int num) {
        System.out.println("Table of " + num + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to print Table: ");
        int num = sc.nextInt();
        printTable(num);
    }
}
