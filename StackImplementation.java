import java.util.Scanner;

public class StackImplementation {
    static int size = 5;
    static int counter = -1;
    static int stack[] = new int[size];

    static void push(int value) {
        if (counter == size - 1) {
            System.out.println("Stack Overflow!");
            return;
        }
        counter++;
        stack[counter] = value;
        System.out.println(value + " added to stack!");
    }

    static void pop() {
        if (counter == -1) {
            System.out.println("Stack Underflow!");
            return;
        }
        int deletedElement = stack[counter];
        System.out.println(deletedElement + " popped from stack");
        counter--;
    }

    static void display() {
        if (counter == -1) {
            System.out.println("Stack is Empty!");
            return;
        }
        System.out.println("\nStack :-\n--------");
        for (int i = counter; i >= 0; i--) {
            System.out.printf("|- %d \n", stack[i]);
        }
        System.out.println("--------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(
                "Stack Commands :-\n" +
                        "1) Push\n" +
                        "2) POP\n" +
                        "3) DISPLAY\n" +
                        "0) EXIT");

        while (true) {
            System.out.print("\nEnter Command = ");
            int value, command = sc.nextInt();

            if (command == 0) {
                System.out.println("Stack Exitted Successfully");
                break;
            }

            switch (command) {
                case 1:
                    System.out.print("Enter Value : ");
                    value = sc.nextInt();
                    push(value);
                    break;
                case 2:
                    pop();
                    break;
                case 3:
                    display();
                    break;
                default:
                    System.out.println("Wrong Input!!, Please check stack commands.");
            }
        }
    }
}
