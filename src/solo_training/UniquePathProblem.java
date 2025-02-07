package solo_training;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class UniquePathProblem {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] cases = new int[n][m];
        for (int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if (i == 0 || j == 0) {
                    cases[i][j] = 1;
                } else {
                    cases[i][j] = cases[i-1][j] + cases[i][j-1];
                }
            }
        }
        System.out.println(cases[n-1][m-1]);
    }
}
