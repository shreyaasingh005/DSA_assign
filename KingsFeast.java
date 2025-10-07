class KingsFeast1 {
    public static void main(String[] args) {
        int n = 5;
        int[] arr = {2, 7, 1, 9, 5};
        int max = arr[0];
        for (int i = 1; i < n; i++) 
        {
            if (arr[i] > max)
             {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}