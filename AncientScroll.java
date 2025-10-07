public class AncientScroll {
    public static void main(String[] args) {
        int[] arr = {2, 5, 7, 8};
        int key = 7;
        System.out.println(search(arr, key));
    }

    public static int search(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) return i;
        }
        return -1;
    }
}