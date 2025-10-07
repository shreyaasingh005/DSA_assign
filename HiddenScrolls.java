public class HiddenScrolls {
    public static boolean searchScroll(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        int row = 0;
        int col = m - 1;
        while (row < n && col >= 0) {
            int value = matrix[row][col];
            if (value == target) {
                return true;
            } else if (value > target) {
                col--; 
            } else {
                row++; 
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 4, 7, 11},
            {2, 5, 8, 12},
            {3, 6, 9, 16},
            {10, 13, 14, 17}
        };
        int target = 6;
        System.out.println("Scroll with ID " + target + " found? " + searchScroll(matrix, target)); 
    }
}