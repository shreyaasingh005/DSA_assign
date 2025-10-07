public class treasurechest {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3};
        int key = 2;
        System.out.println(lastOccurrence(arr, key));
    }

    public static int lastOccurrence(int[] arr, int key) {
        int low = 0, high = arr.length - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == key) {
                result = mid;
                low = mid + 1; // continue searching to the right
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }
}