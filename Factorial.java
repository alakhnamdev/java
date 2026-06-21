public class Factorial {
    public static void main(String[] args) {
        
        int i = 2;
        int num = 4;
        int factorial = 1;
        while(i<=num){
            factorial *= i;
            i++;
        }
         System.out.println("The factorial of " + num + "is:" + factorial);
    }
}
