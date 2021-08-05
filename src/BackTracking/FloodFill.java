package BackTracking;

import java.util.Scanner;

public class FloodFill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++){
                arr[i][j] = scn.nextInt();
            }
        }
        floodfil(arr, 0, 0, "" , new boolean [n][m]);
    }
    
    // asf -> answer so far
    public static void floodfil(int[][] maze, int sr, int sc, String asf , boolean visited [][]) {
     if (sr == maze.length || sr < 0 || sc < 0 || sc == maze[0].length || maze[sr][sc] == 1 || visited[sr][sc] == true) {
      return;
    }

    if (sr == maze.length - 1 && sc == maze[0].length - 1) {
      System.out.println(asf);
      return;
    }
    visited[sr][sc] = true;
    floodfil(maze, sr - 1, sc, asf + "t", visited);
    floodfil(maze, sr, sc - 1, asf + "l", visited);
    floodfil(maze, sr + 1, sc, asf + "d", visited);
    floodfil(maze, sr, sc + 1, asf + "r", visited);
    visited[sr][sc] = false;
    }

}
