import java.util.Scanner;

public class InputExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking String input
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Taking Integer input
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        // Taking Float input
        System.out.print("Enter a float: ");
        float f = sc.nextFloat();

        // Taking Double input
        System.out.print("Enter a double: ");
        double d = sc.nextDouble();

        // Taking Boolean input
        System.out.print("Enter a boolean (true/false): ");
        boolean b = sc.nextBoolean();

        // Taking Character input
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        // Displaying all inputs
        System.out.println("\n--- You Entered ---");
        System.out.println("String: " + str);
        System.out.println("Integer: " + num);
        System.out.println("Float: " + f);
        System.out.println("Double: " + d);
        System.out.println("Boolean: " + b);
        System.out.println("Character: " + ch);
    }
}
