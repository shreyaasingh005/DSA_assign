public class MagicPortal {
    public static String activatePortal(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        int row = 0;
        int col = m - 1; 
        while (row < n && col >= 0) {
            int value = matrix[row][col];
            if (value == target) {
                return "Activated";
            } else if (value > target) {
                col--; 
            } else {
                row++; 
            }
        }
        return "Failed";
    }
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 8},
            {3, 6, 10},
            {7, 9, 12}
        };
        int target = 9;
        System.out.println("Portal status: " + activatePortal(matrix, target)); 
    }
}