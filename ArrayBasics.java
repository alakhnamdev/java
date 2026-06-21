public class ArrayBasics {
    public static void main(String[] args) {
        int[] num; // declaration
        num = new int[5]; // initialization with size

        int[] arr = { 1, 2, 3, 4, 5, };
        char[] str1 = { 'a', 'b', 'c' };
        boolean[] bool = { true, false };
        float[] flt = { 12.0f, 45.2f };
        double[] db = { 12.25d, 78.3 };
        String[] str2 = { "This", "is", "a", "array" };

        // for (int idx = 0; idx < num.length; idx++) {
        // System.out.println(num[idx]);
        // }

        // array[index] = value;

        num[0] = 1;
        num[1] = 2;
        num[2] = 3;
        num[3] = 4;
        num[4] = 5;

        // for (int i = 0; i < num.length; i++) {
        //     num[i] = i + 5;
        //     System.out.println(num[i]);
        // }

        char a = 'a';
        char b = 'b';
        char c = 'c';
        char d = 'd';
        char e = 'e';

        char[] str = { 'a', 'l', 'a', 'k', 'h' };

        String name = "alakh";

        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i]);
        }

        // for (int idx = 0; idx < str.length; idx++) {
        // System.out.print(num[idx]);
        // }

        // int[] numb = { 1, 2, 3, 4, 5 }; // declaration with values

        // Printing array using loop
        // for (int i = 0; i <= numb.length; i++) {
        // System.out.println(numb[i]);
        // }

    }
}
