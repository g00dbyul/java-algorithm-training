package algorithm_study.five_week;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Baechoo {
    static int m; // 가로
    static int n; // 세로
    static boolean[][] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine());
            m = Integer.parseInt(st.nextToken());
            n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            int[][] field = new int[n][m];
            visited = new boolean[n][m];
            for (int j = 0; j < k; j++) {
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                field[b][a] = 1;
            }
            int result = bruteForce(field);
            System.out.println(result);  
        }
    }

    private static int bruteForce(int[][] field) {
        int count = 0;
        for(int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if ((field[i][j] == 1) && !visited[i][j]) {
                    bfs(i, j, field);
                    count++;
                }
            }
        }
        return count;
    }

    private static void bfs(int i, int j, int[][] field) {
        Queue<Position> queue = new ArrayDeque<>();
        queue.add(new Position(i, j));
        visited[i][j] = true;
        while (!queue.isEmpty()) {
            Position pop = queue.poll();
            for (int[] move: new int[][] {{-1,0}, {1,0}, {0,1}, {0,-1}}) {
                int moveI = pop.a + move[0];
                int moveJ = pop.b + move[1];
                if (isValidPosition(moveI, moveJ) && (field[moveI][moveJ] == 1)  && !visited[moveI][moveJ]) {
                    queue.add(new Position(moveI, moveJ));
                    visited[moveI][moveJ] = true;
                }
            }
        }
    }

    private static boolean isValidPosition(int a, int b) {
        return (0 <= a) && (0 <= b) && (a < n) && (b < m);
    }

    private static class Position {
        int a;
        int b;
         Position(int a, int b) {
            this.a = a;
            this.b = b;
         } 
    }
}
