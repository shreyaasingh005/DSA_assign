public class archersrange {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3};
        int key = 2;
        System.out.println(firstOccurrence(arr, key));
    }

    public static int firstOccurrence(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) return i;
        }
        return -1;
    }
}