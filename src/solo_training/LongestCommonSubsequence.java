package solo_training;

import java.io.IOException;

public class LongestCommonSubsequence {
    public static void main(String[] args) throws IOException {
        String a = "BXDEGK";
        String b = "ABDFEGACB";
        int[][] table = new int[a.length()+1][b.length()+1];
        int maxValue = -1;
        for (int i = 1; i <= a.length(); i++) {
            char row = a.charAt(i-1);
            for (int j = 1; j <= b.length(); j++) {
                char col = b.charAt(j-1);
                if (row == col) {
                    table[i][j] = table[i-1][j-1] + 1;
                } else {
                    table[i][j] = Integer.max(table[i-1][j], table[i][j-1]);
                }
                maxValue = Integer.max(maxValue, table[i][j]);
            }
        }
        System.out.println(maxValue);
    }
}
