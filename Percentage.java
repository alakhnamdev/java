import java.util.Scanner;

public class Percentage {
    public static void main(String[] args) {        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Subject 1 Marks : ");
        int sub1 = sc.nextInt();
        System.out.print("Enter Subject 2 Marks : ");
        int sub2 = sc.nextInt();
        System.out.print("Enter Subject 3 Marks : ");
        int sub3 = sc.nextInt();
        System.out.print("Enter Subject 4 Marks : ");
        int sub4 = sc.nextInt();
        System.out.print("Enter Subject 5 Marks : ");
        int sub5 = sc.nextInt();

        int totalGivenMarks = sub1+sub2+sub3+sub4+sub5;
        float totalMarks = 500;

        float percentage = (totalGivenMarks/totalMarks)*100;

        System.out.println("Percentage = "+percentage);
    }
}
