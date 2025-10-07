public class QueensJewel {
    public static int[] findFirstOccurrence(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        int left = 0;
        int right = n * m - 1;
        int[] result = {-1, -1};
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int row = mid / m;
            int col = mid % m;
            int value = matrix[row][col];
            if (value == target) {
                result[0] = row;
                result[1] = col;
                right = mid - 1; 
            } else if (value < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 2},
            {3, 4, 4},
            {5, 6, 7}
        };
        int target = 4;
        int[] position = findFirstOccurrence(matrix, target);
        System.out.println("First occurrence of " + target + ": (" + position[0] + "," + position[1] + ")");
    }
}