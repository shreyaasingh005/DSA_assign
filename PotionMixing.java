import java.util.*;
class PotionMixing {
    public static void main(String[] args) {
        int n = 4;
        int[] arr = {3, 2, 4, 7};
        int target = 6;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int complement = target - arr[i];
            if (map.containsKey(complement)) {
                System.out.println("(" + map.get(complement) + "," + i + ")");
                return;
            }
            map.put(arr[i], i);
        }
    }
}