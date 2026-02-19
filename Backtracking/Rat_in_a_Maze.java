import java.util.*;

public class Main {
    public static void solve(int n, int[][] maze, int row, int col, String path, ArrayList<String> result, boolean[][] visited){
        if (row < 0 || col < 0 || row >= n || col >= n
                || maze[row][col] == 0
                || visited[row][col]) {
            return;
        }
        if (row == n - 1 && col == n - 1) {
            result.add(path);
            return;
        }

        visited[row][col] = true;

        // Down
        solve(n, maze, row + 1, col, path + "D", result, visited);

        // Up
        solve(n, maze, row - 1, col, path + "U", result, visited);

        // Right
        solve(n, maze, row, col + 1, path + "R", result, visited);

        // Left
        solve(n, maze, row, col - 1, path + "L", result, visited);

        visited[row][col] = false; // backtrack
    }
    public static void main(String[] args) {
        int n = 4;
        int[][] grid = {
                {1, 0, 0, 0},
                {1, 1, 0, 1},
                {1, 1, 0, 0},
                {0, 1, 1, 1}
        };
        ArrayList<String> result = new ArrayList<>();
        boolean[][] visited = new boolean[n][n];
        solve(n, grid, 0, 0, "", result, visited);
        System.out.println(result);
    }
}