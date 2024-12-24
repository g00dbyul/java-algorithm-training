package algorithm_study.second_week.factor_and_multiple;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PerfectNumber {
    // https://www.acmicpc.net/problem/9506
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );

        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == -1) break;
            int[] arr = new int[n];
            int index = 0;
            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    arr[index] = i;
                    index += 1;
                }
            }

            int sum = 0;
            for (int i = 0; i < index; i++) {
                sum += arr[i];
            }
            if (sum == n) {
                System.out.print(n + " = ");
                for (int i =0; i < index; i++) {
                    if (i == index - 1) {
                        System.out.print(arr[i]);
                    } else {
                        System.out.print(arr[i] + " + ");
                    }
                }
                System.out.println();
            } else {
                System.out.println(n + " is NOT perfect.");
            }
        }
    }
}
