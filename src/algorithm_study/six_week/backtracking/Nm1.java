package algorithm_study.six_week.backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class Nm1 {
    static int n;
    static int m;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        
        IntStream.range(1, n+1).forEach((int i) -> {
            Deque<Integer> set = new ArrayDeque<>();
            set.add(i);
            search(m, set);
        });
    }

    private static void search(int m, Deque<Integer> set) {
        if (set.size() == m) {
            for(int i: set) {
                System.out.print(i + " ");
            }
            System.out.println();
            return;
        }   
        IntStream.range(1, n+1).forEach((int i) -> {
            if (!set.contains(i)) {
                set.add(i);
                search(m, set);
                set.pollLast();   
            }
        });
    }
}
