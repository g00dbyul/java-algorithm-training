package algorithm_study.five_week;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Tomato {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken()); // 가로
        int n = Integer.parseInt(st.nextToken()); // 세로
        int[][] graph = new int[n][m];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                graph[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int result = bfs(graph, m, n);
        System.out.println(result);
    }

    private static int bfs(int[][] graph, int width, int height) {
        Queue<Position> queue = new ArrayDeque<>();
        boolean[][] visited = new boolean[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (graph[i][j] == 1 && !visited[i][j]) {
                    queue.add(new Position(i, j));
                    visited[i][j] = true;
                }
            }
        }
        
        while (!queue.isEmpty()) {
            Position pop = queue.poll();
            for (int[] move: new int[][] {{-1,0}, {1,0}, {0,-1}, {0,1}}) {
                int moveI = pop.i + move[0];
                int moveJ = pop.j + move[1];
                if (isValidPosition(moveI, moveJ, width, height) && graph[moveI][moveJ] > -1 && !visited[moveI][moveJ]) {
                    graph[moveI][moveJ] = graph[pop.i][pop.j] + 1;
                    queue.add(new Position(moveI, moveJ));
                    visited[moveI][moveJ] = true;
                }
            }
        }
        
        int result = 0;
        for (int[] g: graph) {
            for (int i = 0; i < g.length; i++) {
                if (g[i] == 0) {
                    return -1;
                } else {
                    result = Integer.max(result, g[i]);
                }
            }
        }
        return result - 1;
    }

    private static boolean isValidPosition(int i, int j, int width, int height) {
        return (0 <= i) && (i < height) && (0 <= j) && (j < width);
    }

    private static class Position {
        int i;
        int j;
        Position(int i, int j) {
            this.i = i;
            this.j = j;
        }
    }
}
