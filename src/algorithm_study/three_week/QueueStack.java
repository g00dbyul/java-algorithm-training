package algorithm_study.three_week;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class QueueStack {
    public static void main(String[] args) throws IOException {
           BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
           StringTokenizer st;
           int n = Integer.parseInt(br.readLine());
           boolean[] isQueue = new boolean[n];
           st = new StringTokenizer(br.readLine());
           for (int i = 0; i < n; i++) {
                if(st.nextToken().equals("0")) {
                    isQueue[i] = true;
                } else {
                    isQueue[i] = false;
                }
           }

           Deque<Integer> deque = new ArrayDeque<>();
           st = new StringTokenizer(br.readLine());
           for (int i = 0; i < n; i++) {
                int num = Integer.parseInt(st.nextToken());
                if (isQueue[i]) deque.add(num);  
           }

           int m = Integer.parseInt(br.readLine());
           st = new StringTokenizer(br.readLine());
           StringBuffer sb = new StringBuffer();
           for (int i = 0; i < m; i++) {
                deque.addFirst(Integer.parseInt(st.nextToken()));
                sb.append(deque.pollLast() + " ");
           }
            System.out.println(sb);
    }
}
