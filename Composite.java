import java.util.Scanner;

public class Composite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number : ");
        int num = sc.nextInt();

        int i;
        for (i=2; i < num; i++) {
            if(num%i==0){
                System.out.println("Composite");
                break;
            }
        }
        
        if(num==i){
            System.out.println("Not Composite");
        }
    }
}