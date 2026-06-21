import java.util.Scanner;

public class Pallindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number : ");
        int num = sc.nextInt();
        int org = num;
        int rev = 0;

        while(num>0){
            int temp = num%10;
            rev = (rev*10)+temp;
            num = num/10;
        }

        if(org == rev){
            System.out.println("Pallindrome");
        }

        else{
            System.out.println("Not a pallindrome");
        }
    }
}
