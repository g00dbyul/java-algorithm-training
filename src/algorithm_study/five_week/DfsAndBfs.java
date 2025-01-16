package algorithm_study.five_week;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.StringTokenizer;

public class DfsAndBfs {
    static Map<Integer, List<Integer>> vertex;
    static boolean[] dfsVisited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());

        vertex = new HashMap<>();
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

        for (int i = 1; i <= n; i++) {
            Collections.sort(vertex.get(i));
        }

        dfsVisited = new boolean[n+1];
        dfs(v);
        System.out.println();
        bfs(v);
        System.out.println();
    }

    private static void dfs(int current) {
        dfsVisited[current] = true;
        System.out.print(current + " ");
        for (int v: vertex.get(current)) {
            if (!dfsVisited[v]) dfs(v);
        }

    }

    private static void bfs(int start) {
        Queue<Integer> queue = new ArrayDeque<>();
        boolean[] visited = new boolean[vertex.size() + 1];
        queue.add(start);
        visited[start] = true;

        while (!queue.isEmpty()) {
            int pop = queue.poll();
            System.out.print(pop + " ");
            for (int v: vertex.get(pop)) {
                if (!visited[v]) {
                    queue.add(v);
                    visited[v] = true;
                }
            }
        }
    }
}
