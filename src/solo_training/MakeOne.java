package solo_training;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MakeOne {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] dp = new int[n+1];
        for (int i = 1; i <= n; i++) {
            if (i <= 3) {
                dp[i] = 1;
            } else {
                if (i % 3 == 0) {

                }
                if (i % 2 == 0) {
                    
                }
            }
        }
        System.out.println(Arrays.toString(dp));
        System.out.println(dp[n]);
    }
}
