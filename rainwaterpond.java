public class rainwaterpond {
    public static void main(String[] args) {
        int[][] grid = {
            {1, 0, 1},
            {0, 1, 0},
            {1, 0, 1}
        };
        int n = grid.length;
        int m = grid[0].length;
        boolean[][] visited = new boolean[n][m];
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1 && !visited[i][j]) {
                    dfs(grid, visited, i, j);
                    count++;
                }
            }
        }

        System.out.println(count);
    }

    public static void dfs(int[][] grid, boolean[][] visited, int x, int y) {
        int n = grid.length;
        int m = grid[0].length;
        if (x < 0 || y < 0 || x >= n || y >= m || grid[x][y] != 1 || visited[x][y]) return;
        visited[x][y] = true;
        dfs(grid, visited, x + 1, y);
        dfs(grid, visited, x - 1, y);
        dfs(grid, visited, x, y + 1);
        dfs(grid, visited, x, y - 1);
        dfs(grid, visited, x + 1, y + 1);
        dfs(grid, visited, x - 1, y - 1);
        dfs(grid, visited, x + 1, y - 1);
        dfs(grid, visited, x - 1, y + 1);
    }
}