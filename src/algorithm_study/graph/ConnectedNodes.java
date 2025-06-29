package algorithm_study.graph;

import java.io.*;
import java.util.*;

public class ConnectedNodes {
    private static Map<Integer, List<Integer>> vertex = new HashMap<>();
    private static boolean[] visited;
    private static int connectedLines = 0;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        visited = new boolean[n + 1];

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
            if (!visited[i]) {
                // System.out.println(Arrays.toString(visited));
                bfs(i);
                connectedLines++;
            }
        }
        System.out.println(connectedLines);
    }

    private static void bfs(int n) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(n);
        visited[n] = true;

        while (!queue.isEmpty()) {
            int pop = queue.poll();
            for (int v: vertex.get(pop)) {
                if (!visited[v]) {
                    queue.add(v);
                    visited[v] = true;
                }
            }
        }
    }
}
