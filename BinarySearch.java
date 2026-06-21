public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };

        int low, mid, high, target;

        target = 3;

        low = 0;
        high = arr.length - 1;

        while (low <= high) {
            mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                System.out.println("Element Found at index " + mid);
                break;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
    }
}
