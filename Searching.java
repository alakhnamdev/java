public class Searching {
    public static void main(String[] args) {
        int arr[] = { 1, 0, 3, 4, 5, 6, 7 };

        int low, high, target, index;

        index = -1;
        low = 0;
        high = arr.length - 1;
        target = 2;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                index = mid;
            }
            if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (index == -1) {
            System.out.println("Element Not Found!");
        } else {
            System.out.println("Element found at index " + index);
        }
    }
}
