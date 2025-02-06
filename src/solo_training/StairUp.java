package solo_training;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StairUp {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] stair = new int[n];
        for (int i = 0; i < n; i++) {
            stair[i] = Integer.parseInt(br.readLine());
        }

        long[] dp = new long[n];
        dp[0] = stair[0];
        for (int i = 1; i < n; i++) {
            if (i == 1) {
                dp[i] = stair[0] + stair[1];
            } else if (i == 2) {
                dp[i] = Long.max(stair[i] + stair[i-1], dp[i-2] + stair[i]);
            } else {
                dp[i] = Long.max(stair[i] + dp[i-2], stair[i] + stair[i-1] + dp[i-3]); 
            }
        }  
        System.out.println(dp[n-1]);
    }
}
