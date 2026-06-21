import java.util.Scanner;

public class SumUsingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size : ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        int sum = 0;

        for(int i = 0; i< arr.length; i++){
            System.out.print("Enter value "+i+" : ");
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }

        System.out.println("Sum = "+sum);
    }
}
