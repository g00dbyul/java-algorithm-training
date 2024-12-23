package algorithm_study.second_week.general_math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BeeHosue {
    // https://www.acmicpc.net/problem/2292
    public static void main(String[] args) throws IOException {
        /*
         * 1 :  1 -> 1개
         * 2 ~ 7 : 2 -> 6개 (6 * 1)
         * 8 ~ 19 : 3 -> 12개 (6 * 2)
         * 20 ~ 37 : 4 -> 18개 (6 * 3)
         */
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );
        int target = Integer.parseInt(br.readLine());
        int i = 1;
        int end = 1;
        while (target > end) {
            end = end + (6 * i);
            i += 1;
        }
        System.out.println(i);
    }
}
