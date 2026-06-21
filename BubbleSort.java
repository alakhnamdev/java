public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = { 8, 0, 2, 1, 5 };
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int swap = arr[i];
                    arr[i] = arr[j];
                    arr[j] = swap;
                }
            }
        }

        for (int i : arr) {
            System.out.println(i);
        }
    }
}
