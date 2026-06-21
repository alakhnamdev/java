public class Sorting {
    static int[] SelectionSort(int arr[]) {
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
        return arr;
    }

    static int[] BubbleSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = { 65, 25, 12, 22, 11 };

        int sortedArray[] = SelectionSort(arr);

        System.out.println("Sorted Array using Selection Sort :- ");
        for (int i : sortedArray) {
            System.out.print(i + ",");
        }
        System.out.println("\n");

        sortedArray = BubbleSort(arr);

        System.out.println("Sorted Array using Bubble Sort :- ");
        for (int i : sortedArray) {
            System.out.print(i + ",");
        }
    }
}
