
public class ArrayInJava {
    public static void main(String[] args) {
        // int[] arr = { 1, 2, 3, 4, 5 };
        // for (int i : arr) {
        // System.out.println(i);
        // }

        // char chr[] = {'a','b','c','d','e'};
        // String str[] = {"this","is","a","String"};

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter Length = ");
        // int size = sc.nextInt();

        // int num[] = new int[size];
        // int sum = 0;

        // for (int i = 0; i < num.length; i++){
        // System.out.print("Enter Value "+i+" : ");
        // num[i] = sc.nextInt();
        // sum = sum + num[i];

        // }
        // System.out.println("Sum = "+sum);

        int x[] = { 5, 5, 5, 5 };
        int y = 0;

        y = (x[0]++) + (x[0]++);
        System.out.println(y);

        y = (++x[1]) + (++x[1]);
        System.out.println(y);

        y = (++x[2]) + (x[2]++);
        System.out.println(y);

        y = (x[3]++) + (++x[3]);
        System.out.println(y);

    }
}
