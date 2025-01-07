package algorithm_study.fourth_week.tree;

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

public class SGTravel {
    // https://www.acmicpc.net/problem/9372
    public static void main(String[] args) throws IOException {
        /**
         * 
         *  */  
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            Map<Integer, List<Integer>> vertex = new HashMap<>();
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            for (int j = 1; j <= n; j++) {
                vertex.put(j, new ArrayList<>());
            }
            for (int j = 0; j < m; j++) {
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                vertex.get(a).add(b);
                vertex.get(b).add(a);
            }
            System.out.println(getMinDistance(vertex));
        }
    }

    private static int getMinDistance(Map<Integer, List<Integer>> vertex) {
        int minDistance = Integer.MAX_VALUE;
        for (int i = 1; i <= vertex.size(); i++) {
            int distance = 0;
            Queue<Integer> queue = new ArrayDeque<>();
            boolean[] visited = new boolean[vertex.size() + 1];
    
            queue.add(i);
            visited[i] = true;
            while (!queue.isEmpty()) {
                int pop = queue.poll();
                for (int near: vertex.get(pop)) {
                    if (!visited[near]) {
                        queue.add(near);
                        visited[near] = true;
                    } 
                }
                distance++;
            }
            minDistance = Integer.min(distance, minDistance);
        }
        return minDistance - 1;
    }
}
