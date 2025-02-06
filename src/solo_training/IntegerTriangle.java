package solo_training;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class IntegerTriangle {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] triangle = new int[n][n];
        StringTokenizer st;
        int depth = 1;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < depth; j++) {
                triangle[i][j] = Integer.parseInt(st.nextToken());
            }
            depth++;
        }
        
        long[][] dp = new long[n][n];
        dp[0][0] = triangle[0][0];
        depth = 1;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < depth; j++) {
                dp[i+1][j] = Long.max(dp[i+1][j], dp[i][j] + triangle[i+1][j]);
                dp[i+1][j+1] = Long.max(dp[i+1][j+1], dp[i][j] + triangle[i+1][j+1]);
            }
            depth++;
        }
        
        System.out.println(Arrays.stream(dp[n-1]).max().orElse(0)); 
    }
}
