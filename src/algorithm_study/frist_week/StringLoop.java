package algorithm_study.frist_week;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class StringLoop {
    // https://www.acmicpc.net/problem/2675
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );
        StringTokenizer st;
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine());
            int count = Integer.parseInt(st.nextToken());
            String input = st.nextToken();
            for (int j = 0; j < input.length(); j++) {
                String word = String.valueOf(input.charAt(j));
                for (int k = 0; k < count; k++) {
                    System.out.print(word);
                }
            }
            System.out.println();
        }
    }
}
