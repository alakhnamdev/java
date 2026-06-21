public class SelectionSort {
    
    public static void main(String[] args) {
        int arr[] = { 65, 25, 12, 22, 11 };

        for (int i = 0; i < arr.length - 1; i++) {
            int min_index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min_index] > arr[j]) {
                    min_index = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }

        for (int i : arr) {
            System.out.println(i);
        }
    }
}