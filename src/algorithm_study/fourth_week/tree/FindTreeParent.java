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

public class FindTreeParent {
    // https://www.acmicpc.net/problem/11725
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        Map<Integer, List<Integer>> vertex = new HashMap<>();
        for (int i = 1; i < n+1; i++) {
            vertex.put(i, new ArrayList<>());
        }

        for (int i = 0; i < n-1; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            vertex.get(a).add(b);
            vertex.get(b).add(a);
        }

        Queue<Integer> queue = new ArrayDeque<>();
        int[] parents = new int[n+1];

        queue.add(1);
        /*
         * 일단 방문 때리기
         * 방문 좌표에 인접한 노드 구하기(아직은 누가 부모인지)
         * 1일 경우 기준 -> pop = 1; 
         * 1에 인접한 노드의 부모는 1이다.
         * pop에 인접한 노드(parent가 0인 경우) 부모는 pop이다.
         * parents 배열이 visit을 대체
         */
        while (!queue.isEmpty()) {
            int pop = queue.poll();
            // visited[pop] = true;
            for (int i: vertex.get(pop)) {
                if (parents[i] == 0) {
                    parents[i] = pop;
                    queue.add(i);
                }
            }
        }
       for(int i = 2; i < n+1; i++) {
            System.out.println(parents[i]);
       }
    }
}
