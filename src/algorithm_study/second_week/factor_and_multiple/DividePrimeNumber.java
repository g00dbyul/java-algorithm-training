package algorithm_study.second_week.factor_and_multiple;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

// 아직 못 품 ㅠㅠ
public class DividePrimeNumber {
    // https://www.acmicpc.net/problem/11653
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        if (n != 1) {
            List<Integer> divider = new ArrayList<>();
            
            for (Integer i: divider) {
                System.out.println(i);
            }
        }
    }

    public static boolean isPrime(int k) {
        if (k == 1) return false;
        for (int i = 2; i <= Math.sqrt(k); i++) {
            if (k % i == 0) return false;
        }
        return true;
    }
}
