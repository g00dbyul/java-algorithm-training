package algorithm_study.frist_week;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Diamond {
    // https://www.acmicpc.net/problem/2444
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );
        int n = Integer.parseInt(br.readLine());
        /*
         * 0 1
         * 1 3
         * 2 5
         * 3 7
         * 4 9
         * 5 7
         * 6 5
         * 7 3
         * 8 1
         */
        for (int i = 0; i < 2*n-1; i++) {
            // 공백
            for (int j = 0; j < Math.abs(n-i-1); j++) {
                System.out.print(" ");
            }
            // 별찍기
            if (i < n) {
                // (i < n) -> 증가 -> 2*n + 1
                for (int j = 0; j < 2 * i + 1; j++) {
                    System.out.print("*");
                }
            } else {
                // i >= n -> 감소 -> 
                for (int j = 0; j < (2*n-1 - i) * 2 - 1; j++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
