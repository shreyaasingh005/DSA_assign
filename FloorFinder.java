public class FloorFinder {
    public static int findFloor(int[] arr, int target) {
        int left = 0;
        int right = arr.length;
        int result = -1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] <= target) {
                result = arr[mid]; 
                left = mid + 1;     
            } else {
                right = mid;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] array = {1, 2, 4, 6, 6, 8};
        int target1 = 5;
        System.out.println("Floor for " + target1 + ": " + findFloor(array, target1)); 
        int target2 = 0;
        System.out.println("Floor for " + target2 + ": " + findFloor(array, target2)); 
        int target3 = 6;
        System.out.println("Floor for " + target3 + ": " + findFloor(array, target3)); 
    }
}