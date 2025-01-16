package algorithm_study.five_week;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Miro {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] miro = new int[n][m];
        for (int i = 0; i < n; i++) {
            String temp = br.readLine();
            for (int j = 0; j < m; j++) {
                miro[i][j] = Integer.parseInt(String.valueOf(temp.charAt(j)));
            }
        }
        System.out.println(getShortestDistance(miro, n, m));
    }

    private static int getShortestDistance(int[][] miro, int height, int width) {
        Queue<Position> queue = new ArrayDeque<>();
        boolean[][] visited = new boolean[height][width];
        queue.add(new Position(0, 0));
        visited[0][0] = true;
        while (!queue.isEmpty()) {
            Position pop = queue.poll();
            int dist = miro[pop.i][pop.j];
            for (int[] move: new int[][] {{-1,0}, {1,0}, {0,1}, {0,-1}}) {
                int moveI = pop.i + move[0];
                int moveJ = pop.j + move[1];
                if (isValidPosition(moveI, moveJ, height, width) && miro[moveI][moveJ] == 1 && !visited[moveI][moveJ]) {
                    queue.add(new Position(moveI, moveJ));
                    visited[moveI][moveJ] = true;
                    miro[moveI][moveJ] = dist + 1;
                }
            }
        }
        return miro[height - 1][width - 1];
    }

    private static boolean isValidPosition(int i, int j, int height, int width) {
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
