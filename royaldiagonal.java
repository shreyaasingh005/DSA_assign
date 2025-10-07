public class royaldiagonal {
    public static void main(String[] args) {
        int[][] hall = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int n = hall.length;
        int mainDiagonal = 0;
        int secondaryDiagonal = 0;
        for (int i = 0; i < n; i++) {
            mainDiagonal += hall[i][i];
            secondaryDiagonal += hall[i][n - 1 - i];
        }
        System.out.println("Main Diagonal Sum = " + mainDiagonal);
        System.out.println("Secondary Diagonal Sum = " + secondaryDiagonal);
    }
}