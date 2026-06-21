public class Fibonacci {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int sum;
        System.out.println(a+"\n"+b);
        
        for (int i = 0; i < 10; i++) {
            sum = a+b;
            System.out.println(sum);
            a = b;
            b = sum;
        }
    }
}
