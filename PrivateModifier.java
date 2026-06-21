import java.util.Scanner;

class Bank {
    private int balance = 0;

    private int platformFees(int value) {
        return value - 100;
    }

    public void updateBalance(int value) { // setter function
        value = platformFees(value);
        this.balance += value;
    }

    public void printBalance() { // getter function
        System.out.println(balance);
    }
}

class ArrayMethods {
    private int arr[] = new int[5];
    Scanner sc = new Scanner(System.in);

    public void inputElements() {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter Value : ");
            arr[i] = sc.nextInt();
        }
    }

    public void printElements() {
        for (int i : arr) {
            System.out.println(i);
        }
    }
}

public class PrivateModifier {
    public static void main(String[] args) {
        Bank bn = new Bank();
        bn.updateBalance(1000);
        bn.printBalance();

        ArrayMethods am = new ArrayMethods();
        am.inputElements();
        am.printElements();
    }
}
