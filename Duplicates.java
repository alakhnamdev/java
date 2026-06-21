public class Duplicates {
    static int size;
    static int org[];
    static int temp[];
    static int result[];
    static int counter = 0;

    public Duplicates(int arr[]) {
        this.size = arr.length;
        this.org = arr;
        this.temp = new int[arr.length];
    }

    static boolean serchElement(int element) {
        for (int i = 0; i < size; i++) {
            if (element == temp[i]) {
                return true;
            }
        }
        return false;
    }

    static void checkDuplicate() {
        for (int i = 0; i < size; i++) {
            int element = org[i];
            if (!serchElement(element)) {
                temp[counter] = element;
                counter++;
            }
        }
    }

    static void printUnique() {
        checkDuplicate();
        System.out.println("Unique Elements");
        for (int i = 0; i < counter; i++) {
            System.out.println(temp[i]);
        }
    }

    static int[] uniqueElements() {
        checkDuplicate();
        result = new int[counter];
        for (int i = 0; i < counter; i++) {
            result[i] = temp[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 2, 3, 3, 3, 4, 4, 5, 5 };
        Duplicates dp = new Duplicates(arr);
        printUnique();

        int unique[] = uniqueElements();
        for (int i = 0; i < unique.length; i++) {
            System.out.println(unique[i]);
        }
    }
}
