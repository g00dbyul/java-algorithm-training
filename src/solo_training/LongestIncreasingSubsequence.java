package solo_training;

import java.io.IOException;
import java.util.Arrays;

public class LongestIncreasingSubsequence {
    public static void main(String[] args) throws IOException {
        int[] arr = {1,4,2,3,2,5,7,3};
        int[] dp = new int[arr.length];
        dp[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            int maxValue = 0;
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[i]) {
                    maxValue = Integer.max(maxValue, dp[j]);
                }
            }
            dp[i] = maxValue + 1;
        }
        System.out.println(Arrays.stream(dp).max().orElse(0));
    }
}
