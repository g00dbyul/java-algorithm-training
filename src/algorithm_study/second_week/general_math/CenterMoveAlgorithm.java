package algorithm_study.second_week.general_math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CenterMoveAlgorithm {
    // https://www.acmicpc.net/problem/2903
    public static void main(String[] args) throws IOException {
        /*
         * 0 2
         * 1 3
         * 2 5
         * 3 9
         * 4 17
         * 5 33
         * 2의n승 씩 증가하는 수열
         */
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );
        int input = Integer.parseInt(br.readLine());
        double target = 2;
        for (int i = 0; i < input; i++) {
            target = target + Math.pow(2, i);
        }
        System.out.println((int) (target * target));
    }
}
