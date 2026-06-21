package com;

public class Armstrong {
    static boolean isArmstrong(int num) {
        int org = num;
        int arm = 0;

        String l = String.valueOf(num); // convert int -> string
        int len = l.length(); // length of number

        while (num > 0) {
            int temp = num % 10;
            arm = (int) (arm + (Math.pow(temp, len)));
            num = num / 10;
        }

        return org == arm;
    }

    public static void main(String[] args) {
        for (int i = 1; i < 1000; i++) {
            if (isArmstrong(i)) {
                System.out.println(i);
            }
        }
    }
}
