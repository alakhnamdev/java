import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter operation : ");
        int ops = sc.nextInt();

        int[] arr;
        
        if(ops == 1){
            System.out.print("Enter size : ");
            int size = sc.nextInt();
            arr = new int[size];
            int sum = 0;

            for (int i = 0; i < arr.length; i++) {
                System.out.print("Enter Value "+i+" = ");
                arr[i] = sc.nextInt();
                sum = sum+arr[i];
            }

            System.out.println("Sum = "+sum);
        }
    }
}
