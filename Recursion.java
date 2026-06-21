public class Recursion {
    public static int SumNumbers(int num) {
        if (num == 0) {
            return 0;
        } else {
            int sum = SumNumbers(num - 1);
            return sum + num;
        }
    }

    public static int factorial(int num) {
        if (num == 1) {
            return 1;
        } else {
            return num * factorial(num - 1);
        }
    }

    public static int fibo(int num) {
        if (num == 0 || num == 1) {
            return num;
        } else {
            return fibo(num - 1) + fibo(num - 2);
        }
    }

    public static void main(String[] args) {
        int sum = SumNumbers(10);
        int fibo = fibo(9);
        int fac = factorial(5);
        
        System.out.println("Sum = " + sum);
        System.out.println("fibo = " + fibo);
        System.out.println("factorial = " + fac);
    }
}
