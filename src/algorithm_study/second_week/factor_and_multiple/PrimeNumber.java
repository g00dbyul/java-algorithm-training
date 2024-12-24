package algorithm_study.second_week.factor_and_multiple;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeNumber {
    // https://www.acmicpc.net/problem/2581
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );
        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n - m + 1];
        int index = 0;
        for (int i = m; i <= n; i++) {
            if (isPrime(i)) {
                arr[index] = i;
                index += 1;
            }
        }
        if (index == 0) {
            System.out.println(-1);
        } else {
            int sum = 0;
            for (int i = 0; i < index; i++) {
                sum += arr[i];
            }
            System.out.println(sum);
            System.out.println(arr[0]);
        }
    }

    public static boolean isPrime(int k) {
        if (k == 1) return false;
        for (int i = 2; i < k; i++) {
            if (k % i == 0) return false;
        }
        return true;
    }
}
