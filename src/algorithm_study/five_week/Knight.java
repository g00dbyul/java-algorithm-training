package algorithm_study.five_week;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Knight {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int size = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            int currentI = Integer.parseInt(st.nextToken());
            int currentJ = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            int targetI = Integer.parseInt(st.nextToken());
            int targetJ = Integer.parseInt(st.nextToken());
            int[][] chess = new int[size][size];
            int result = bfs(new Position(currentI, currentJ), new Position(targetI, targetJ), chess);
            System.out.println(result);
        }
    }

    private static int bfs(Position start, Position target, int[][] chess) {
        int count = 0;
        int[][] moves = {{1,2}, {-1,2}, {1,-2}, {-1,-2}, {2,1}, {-2,1}, {2,-1}, {-2,-1}};
        Queue<Position> queue = new ArrayDeque<>();
        queue.add(start);
        int size = chess.length;
        int[][] visited = new int[size][size];
        while (!queue.isEmpty()) {
            Position pop = queue.poll();
            if (pop.equals(target)) {
                break;
            }

            for (int[] move: moves) {
                int moveI = pop.i + move[0];
                int moveJ = pop.j + move[1];
                if (isValidPosition(moveI, moveJ, size) && visited[moveI][moveJ] == 0) {
                    queue.add(new Position(moveI, moveJ));
                    visited[moveI][moveJ] = visited[pop.i][pop.j] + 1;
                }
            }
        }
        return visited[target.i][target.j];
    }

    private static boolean isValidPosition(int moveI, int moveJ, int size) {
        return (0 <= moveI) && (moveI < size) && (0 <= moveJ) && (moveJ < size);
    }

    private static class Position {
        int i;
        int j;
        Position(int i, int j) {
            this.i = i;
            this.j = j;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof Position) {
                Position cast = (Position) obj;
                return (this.i == cast.i) && (this.j == cast.j);
            }
            return false;
        }
    }
}
