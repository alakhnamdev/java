public class MethodsInJava {
    // Declaration and definition of method
    static void greet(String name) {
        System.out.printf("Hello %s !\n", name);
    }

    static int add(int a, int b) {
        System.out.println("Result = " + (a + b));
        return a + b;
    }

    int substract(int a, int b) {
        return a - b;
    }

    static void print1toN(int range) {
        for (int i = 0; i <= range; i++) {
            System.out.println(i);
        }
    }

    public static void table(int num) {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d X %d = %d\n", num, i, num * i);
        }
    }

    static void evenOdd(int num) {
        System.out.println(num % 2 == 0 ? "Even" : "Odd");
    }

    static boolean isPrime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    static int[] test(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= 2;
        }
        return arr;
    }

    static int[] fibonacci(int range) {
        int a = 0, b = 1;
        int fibo[] = new int[range];
        fibo[0] = a;
        fibo[1] = b;

        for (int i = 2; i < range; i++) {
            fibo[i] = a + b;
            a = b;
            b = fibo[i];
        }

        return fibo;
    }

    public static void main(String[] args) {
        int fibo[] = fibonacci(10);

        for (int i : fibo) {
            System.out.println(i);
        }

    }
}
