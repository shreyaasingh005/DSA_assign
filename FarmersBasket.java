public class FarmersBasket {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30};
        int key = 25;
        System.out.println(findFruit(arr, key));
    }

    public static int findFruit(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) return i;
        }
        return -1;
    }
}