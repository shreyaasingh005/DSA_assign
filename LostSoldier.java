class LostSoldier {
    public static void main(String[] args) {
        int n = 5;
        int[] arr = {0, 1, 2, 4, 5};
        int total = n * (n + 1) / 2;
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        System.out.println(total - sum);
    }
}