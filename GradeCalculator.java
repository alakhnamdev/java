import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input percentage
        System.out.print("Enter your percentage: ");
        int percentage = sc.nextInt();

        // Store Grade
        char grade;

        switch (percentage / 10) {
            case 10: // 100%
            case 9:  // 90 - 99
                grade = 'A';
                break;
            case 8:  // 80 - 89
                grade = 'B';
                break;
            case 7:  // 70 - 79
                grade = 'C';
                break;
            case 6:  // 60 - 69
                grade = 'D';
                break;
            case 5:  // 50 - 59
                grade = 'E';
                break;
            default: // Below 50
                grade = 'F';
                break;
        }

        // Output result
        System.out.println("Your grade is: " + grade);

        sc.close();
    }
}