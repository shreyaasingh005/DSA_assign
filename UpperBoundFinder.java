public class UpperBoundFinder {
    public static int upperBound(int[] arr, int target) {
        int left = 0;
        int right = arr.length;
        while (left < right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left < arr.length ? left : arr.length;
    }
    public static void main(String[] args) {
        int[] array1 = {1, 2, 4, 6, 6, 8};
        int target1 = 6;
        System.out.println("Upper bound index for target " + target1 + ": " + upperBound(array1, target1)); // Output: 5
        int target2 = 7;
        System.out.println("Upper bound index for target " + target2 + ": " + upperBound(array1, target2)); // Output: 5
        int target3 = 8;
        System.out.println("Upper bound index for target " + target3 + ": " + upperBound(array1, target3)); // Output: 6
    }
}