package solo_training;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RgbStreet {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] costs = new int[n][3];
        int[][] dp = new int[n][3];
        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 3; j++) {
                costs[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dp[0][0] = costs[0][0];
        dp[0][1] = costs[0][1];
        dp[0][2] = costs[0][2]; 

        for (int i = 1; i < n; i++) {
            dp[i][0] = Integer.min(dp[i-1][1] + costs[i][0], dp[i-1][2] + costs[i][0]);
            dp[i][1] = Integer.min(dp[i-1][0] + costs[i][1], dp[i-1][2] + costs[i][1]);
            dp[i][2] = Integer.min(dp[i-1][0] + costs[i][2], dp[i-1][1] + costs[i][2]);
        }

        System.out.println(
            Integer.min(Integer.min(dp[n-1][0], dp[n-1][1]), dp[n-1][2])
        );
    }
}
