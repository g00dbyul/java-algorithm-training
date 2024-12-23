package algorithm_study.frist_week;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Chess {
    // https://www.acmicpc.net/problem/3003
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] original = {1,1,2,2,2,8};
        for (int i = 0; i < 6; i++) {
            System.out.print(original[i] - Integer.parseInt(st.nextToken()) + " ");
            // original[i] - Integer.parseInt(st.nextToken()); 
        }
        System.out.println();
    }
}
