import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number = ");

        int num = sc.nextInt();
        int org = num;
        int arm = 0;

        while(num>0){
            int temp = num%10;
            arm = (int) (arm+(Math.pow(temp, 3)));
            num = num/10;
        }

        if(org == arm){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not a Armstrong");
        }
    }
}

