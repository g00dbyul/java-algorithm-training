package algorithm_study.second_week.factor_and_multiple;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class KNumber {
    // https://www.acmicpc.net/problem/2501
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        int index = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                arr[index] = i;
                index += 1;
            }
        }

        System.out.println(arr[k-1]);
    }
}
