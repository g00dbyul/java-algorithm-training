package algorithm_study.three_week;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Deque2 {
    /*
     * q : 2 3 5 
     * 1
     * 8
     * 3
     * 8
     */
    public static void main(String[] args) throws IOException {
        Deque<Integer> deque = new ArrayDeque<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int command = 0;
            int target = 0;
            if (st.countTokens() == 2) {
                command = Integer.parseInt(st.nextToken());
                target = Integer.parseInt(st.nextToken());
            } else {
                command = Integer.parseInt(st.nextToken());
            }
            switch (command) {
                case 1:
                    deque.addFirst(target);
                    break;
                case 2:
                    deque.add(target);
                    break;
                case 3:
                    if (deque.isEmpty()) {
                        System.out.println(-1);
                    } else {
                        System.out.println(deque.poll());
                    }
                    break;
                case 4:
                    if (deque.isEmpty()) {
                        System.out.println(-1);
                    } else {
                        System.out.println(deque.pollLast());
                    }
                    break;
                case 5:
                    System.out.println(deque.size());
                    break;
                case 6:
                    if (deque.isEmpty()) {
                        System.out.println(1);
                    } else {
                        System.out.println(0);
                    }
                    break;
                case 7:
                    if (deque.isEmpty()) {
                        System.out.println(-1);
                    } else {
                        System.out.println(deque.peekFirst());
                    }
                    break;
                case 8:
                    if (deque.isEmpty()) {
                        System.out.println(-1);
                    } else {
                        System.out.println(deque.peekLast());
                    }
                    break;
                default:
                    break;
            }

        }
    }
}
