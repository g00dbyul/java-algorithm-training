package algorithm_study.five_week;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.StringTokenizer;

public class Virus {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        Map<Integer, List<Integer>> vertex = new HashMap<>();
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        for (int i = 1; i <= n; i++) {
            vertex.put(i, new ArrayList<>());
        }
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            vertex.get(a).add(b);
            vertex.get(b).add(a);
        }

        int result = bfs(vertex);
        System.out.println(result);
    }

    private static int bfs(Map<Integer, List<Integer>> vertex) {
        int count = 0;
        Queue<Integer> queue = new ArrayDeque<>();
        boolean[] visited = new boolean[vertex.size() + 1];

        queue.add(1);
        visited[1] = true;
        while (!queue.isEmpty()) {
            int pop = queue.poll();
            for(int v: vertex.get(pop)) {
                if (!visited[v]) {
                    queue.add(v);
                    visited[v] = true;
                    count++;
                }
            }
        }

        return count;
    }
}
