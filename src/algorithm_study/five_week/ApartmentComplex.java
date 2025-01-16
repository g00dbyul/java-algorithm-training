package algorithm_study.five_week;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ApartmentComplex {
    static int n;
    static boolean[][] visited;
    static int[][] graph;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        graph = new int[n][n];
        visited = new boolean[n][n];
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            for (int j = 0; j < n; j++) {
                graph[i][j] = Integer.valueOf(String.valueOf(line.charAt(j)));
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((graph[i][j] == 1) && (visited[i][j] == false)) {
                    result.add(bfs(i , j));
                }
            }
        }

        Collections.sort(result);
        System.out.println(result.size());
        result.forEach(System.out::println);
    }

    private static int bfs(int i, int j) {
        Queue<Position> queue = new LinkedList<>();
        int count = 1;
        queue.offer(new Position(i, j));
        visited[i][j] = true;
        while (!queue.isEmpty()) {
            Position pop = queue.poll();
            for (int[] move: new int[][] {{-1,0}, {1,0}, {0,1}, {0,-1}}) {
                int moveI = pop.i + move[0];
                int moveJ = pop.j + move[1];
                if (isValidPosition(moveI, moveJ) && (graph[moveI][moveJ] == 1) && !visited[moveI][moveJ]) {
                    queue.offer(new Position(moveI, moveJ));
                    visited[moveI][moveJ] = true;
                    count+=1;
                }
            }
        }        
        return count;
    }

    private static boolean isValidPosition(int i, int j) {
        return (0 <= i) && (i < n) && (0 <= j) && (j < n);
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
