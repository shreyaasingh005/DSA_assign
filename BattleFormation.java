public class BattleFormation {
    public static boolean searchSoldier(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        int left = 0;
        int right = n * m - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int row = mid / m;
            int col = mid % m;
            int value = matrix[row][col];
            if (value == target) {
                return true;
            } else if (value < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 3, 5},
            {7, 10, 11},
            {16, 20, 30}
        };
        int target = 10;

        System.out.println("Soldier with strength " + target + " found? " + searchSoldier(matrix, target)); // Output: true
    }
}