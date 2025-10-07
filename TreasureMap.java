public class TreasureMap {
    public static String isTreasurePresent(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == target) {
                    return "Yes";
                }
            }
        }
        return "No";
    }
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int target = 5;
        System.out.println("Treasure found? " + isTreasurePresent(matrix, target)); 
    }
}