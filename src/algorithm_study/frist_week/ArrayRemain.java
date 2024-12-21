package algorithm_study.frist_week;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayRemain {
    // https://www.acmicpc.net/problem/3052
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );
        boolean[] isRemain = new boolean[42];
        for (int i = 0; i < 10; i++) {
            int input = Integer.parseInt(br.readLine());
            int remain = input % 42;
            if (!isRemain[remain]) {
                isRemain[remain] = true;
            }
        }

        int result = 0;
        for (int i = 0; i < 42; i++) {
            if (isRemain[i]) {
                result += 1;
            }
        }
        System.out.println(result);
    }
}
