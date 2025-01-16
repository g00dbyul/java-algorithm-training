package algorithm_study.five_week;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class HideAndSeek {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        System.out.println(bfs(n, m));
    }

    private static int bfs(int start, int target) {
        Queue<Integer> queue = new ArrayDeque<>();
        int[] visited = new int[100001];
        queue.add(start);
        while (!queue.isEmpty()) {
            int pop = queue.poll();
            if (pop == target) break;
            for (int move: new int[] {pop + 1, pop - 1, pop * 2}) {
                if ((0 <= move) && (move < 100001) && (visited[move] == 0)) {
                    queue.add(move);
                    visited[move] = visited[pop] + 1;
                }
            }  
        }
        return visited[target];
    }
}
