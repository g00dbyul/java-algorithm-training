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

public class StudyBFS2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());

        Map<Integer, List<Integer>> vertex = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            vertex.put(i, new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            vertex.get(x).add(y);
            vertex.get(y).add(x);
        }
        
        for (int i = 1; i <= n; i++) {
            Collections.sort(vertex.get(i), (n1, n2) -> n2.compareTo(n1));
        }


        int[] result = dfs(vertex, r);
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < result.length; i++) {
            sb.append(result[i] + "\n");
        }
        System.out.println(sb);
    }
    
    private static int[] dfs(Map<Integer, List<Integer>> vertex, int start) {
        int[] visited = new int[vertex.size() + 1];
        int order = 1;
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(start);
        visited[start] = order;
        order++;

        while (!queue.isEmpty()) {
            int pop = queue.poll();
            for (int i: vertex.get(pop)) {
                if (visited[i] == 0) {
                    queue.add(i);
                    visited[i] = order;
                    order++;
                }
            }
        }
        return visited;
    }
}
