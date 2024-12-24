package algorithm_study.second_week.factor_and_multiple;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FindPrimeNumber {
    // https://www.acmicpc.net/problem/1978
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int result = 0;
        for (int i = 0; i < n; i++) {
            int k = Integer.parseInt(st.nextToken());
            if(isPrime(k)) result += 1;
        }
        System.out.println(result);
        
        // for (int i = 1; i < 10; i++) {
        //     System.out.println(i + " " + isPrime(i));
        // }
    }

    public static boolean isPrime(int k) {
        if (k == 1) return false;
        for (int i = 2; i < k; i++) {
            if (k % i == 0) return false;
        }
        return true;
    }
}
