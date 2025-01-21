package algorithm_study.six_week.backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Nm2 {
    static int n;
    static int m;
    static int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }
        search(m, 0, new ArrayDeque<>());
    }

    private static void search(int m, int current, Deque<Integer> set) {
        if (set.size() == m) {
            for(int i: set) {
                System.out.print(i + " ");
            }
            System.out.println();
            return;
        }   
        for (int i = current; i < arr.length; i++) {
            set.add(arr[i]);
            search(m, i+1, set);
            set.pollLast();
        }
    }
}
