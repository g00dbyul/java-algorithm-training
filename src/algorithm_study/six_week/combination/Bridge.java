package algorithm_study.six_week.combination;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * (n r) + (n r + 1) -> (n+1 r+1)
 * 
 *       (1 1)
 *    (2 1) (2 2)
 * (3 1) (3 2) (3 3) 
 * 
 *   1 2 3 4
 * 1 1 
 * 2 2 1
 * 3 3 3 1
 * 4 4 6 4 1  
 * 
 * -> if (i == j) -> 1
 * -> if (j == 1) -> i
 * -> else (i-1, r-1) + (i-1 r)
 */

public class Bridge {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            if (n == m) {
                System.out.println(1);
            } else if (n == 1) {
                System.out.println(m);
            } else {
                long[][] arr = new long[m+1][m+1];
                for (int j = 1; j < m+1; j++) {
                    for (int k = 1; k <= j; k++) {
                        if (k == 1) {
                            arr[j][k] = j;
                        } else if (j == k) {
                            arr[j][k] = 1;
                        } else {
                            arr[j][k] = arr[j-1][k-1] + arr[j-1][k];
                        }
                    }
                }
                System.out.println(arr[m][n]);
            }
        }        
    }
}
