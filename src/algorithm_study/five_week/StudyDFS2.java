package algorithm_study.five_week;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class StudyDFS2 {
    static int[] distance;
    static int depth = 1;
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

        distance = new int[n+1];
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

        dfs(r,  vertex);

        for (int i = 1; i <= n; i++) {
            System.out.println(distance[i]);
        }
    }

    private static void dfs(int current, Map<Integer, List<Integer>> vertex) {
        distance[current] = depth;
        for (int v: vertex.get(current)) {
            if (distance[v] == 0) {
                depth++;
                dfs(v, vertex);
            }
        }
    }
}
