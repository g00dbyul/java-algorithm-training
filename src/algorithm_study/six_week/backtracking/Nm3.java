package algorithm_study.six_week.backtracking;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class Nm3 {
    static int n;
    static int m;
    static StringBuilder sb = new StringBuilder();
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
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
        bw.flush();
    }

    private static void search(int m, Deque<Integer> set) {
        if (set.size() == m) {
            try {
                for(int i: set) {
                    bw.write(String.valueOf(i) + " ");
                }
                bw.newLine();
                return;
            } catch(IOException e) {
                e.printStackTrace();
            }
        }   
        IntStream.range(1, n+1).forEach((int i) -> {
            set.add(i);
            search(m, set);
            set.pollLast();   
        });
    }
}
