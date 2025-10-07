public class messengerpath {
    public static void main(String[] args) {
        int[][] grid = {
            {0, 0, 0},
            {0, 1, 0},
            {0, 0, 0}
        };
        int n = grid.length;
        int m = grid[0].length;
        boolean[][] visited = new boolean[n][m];
        System.out.println(dfs(grid, 0, 0, visited));
    }

    public static boolean dfs(int[][] grid, int x, int y, boolean[][] visited) {
        int n = grid.length;
        int m = grid[0].length;
        if (x < 0 || y < 0 || x >= n || y >= m || grid[x][y] == 1 || visited[x][y]) return false;
        if (x == n - 1 && y == m - 1) return true;
        visited[x][y] = true;
        return dfs(grid, x + 1, y, visited) ||
               dfs(grid, x - 1, y, visited) ||
               dfs(grid, x, y + 1, visited) ||
               dfs(grid, x, y - 1, visited);
    }
}