import java.util.Scanner;

public class Age {
    public static void main(String[] args) {        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Age : ");
        int age = sc.nextInt();
        
        if(age>0 && age<=2){
            System.out.println("Infant");
        }
        else if (age>2 && age<12) {
            System.out.println("Childhood");
        }
        else if (age>=12 && age<16) {
            System.out.println("Adolescent");
        }
        else if (age>=16 && age<18) {
            System.out.println("Teenage");
        }
        else if (age>=18) {
            System.out.println("Adult");
        }
        else{
            System.out.println("Wrong Input");
        }
    }
}
