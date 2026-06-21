import java.util.Scanner;

public class Methods {

    // Armstrong Number
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

    // Fibonacci Series
    static void fibonacci(int terms) {
        int a = 0;
        int b = 1;
        int sum;
        System.out.println("Fibonacci Series:");
        System.out.println(a + "\n" + b);

        for (int i = 0; i < terms; i++) {
            sum = a + b;
            System.out.println(sum);
            a = b;
            b = sum;
        }
    }

    // Palindrome Number
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

    // Prime Check
    static boolean checkPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) { // optimized loop
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Reverse Number
    static int reverseNumber(int num) {
        int rev = 0;
        while (num > 0) {
            int temp = num % 10;
            rev = (rev * 10) + temp;
            num = num / 10;
        }
        return rev;
    }

    // Print Multiplication Table
    static void printTable(int num) {
        System.out.println("Table of " + num + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }

    // Main Method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Armstrong check
        int armNum = 153;
        if (isArmstrong(armNum)) {
            System.out.println(armNum + " is an Armstrong Number");
        } else {
            System.out.println(armNum + " is NOT an Armstrong Number");
        }

        // Fibonacci
        fibonacci(10);

        // Palindrome check
        System.out.print("Enter number to check Palindrome: ");
        int palNum = sc.nextInt();
        if (isPalindrome(palNum)) {
            System.out.println(palNum + " is Palindrome");
        } else {
            System.out.println(palNum + " is NOT Palindrome");
        }

        // Prime numbers up to 100
        System.out.println("Prime numbers from 2 to 100:");
        for (int i = 2; i < 100; i++) {
            if (checkPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        // Reverse number
        System.out.print("Enter a number to Reverse: ");
        int revNum = sc.nextInt();
        System.out.println("Reversed Number = " + reverseNumber(revNum));

        // Multiplication Table
        System.out.print("Enter a number to print Table: ");
        int tableNum = sc.nextInt();
        printTable(tableNum);

        sc.close();
    }
}
