public class Prime {
    static boolean checkPrime(int num) {
        boolean isPrime;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isPrime = false;
                return isPrime;
            }
        }
        isPrime = true;
        return isPrime;
    }

    public static void main(String[] args) {
        for (int i = 2; i < 100; i++) {
            if(checkPrime(i)){ // if i is true print value
                System.out.print(i+",");
            }
        }
    }
}