public class CeilFinder {
    public static int findCeil(int[] arr, int target) {
        int left = 0;
        int right = arr.length;
        int result = -1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] >= target) {
                result = arr[mid]; 
                right = mid;       
            } else {
                left = mid + 1;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] array = {1, 2, 4, 6, 6, 8};
        int target1 = 5;
        System.out.println("Ceil for " + target1 + ": " + findCeil(array, target1)); 
        int target2 = 9;
        System.out.println("Ceil for " + target2 + ": " + findCeil(array, target2)); 
        int target3 = 6;
        System.out.println("Ceil for " + target3 + ": " + findCeil(array, target3)); 
    }
}