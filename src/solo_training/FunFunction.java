package solo_training;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FunFunction {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int[][][] arr = new int[21][21][21];
        for (int k = 0; k <= 20;k++) {
            for (int j = 0; j <= 20; j++) {
                for (int i = 0; i <= 20; i++) {
                    if (i <= 0 || j <= 0 || k <= 0) {
                        arr[i][j][k] = 1;
                    } else if(i > 20 || j > 20 || k > 20) {
                        arr[i][j][k] = arr[20][20][20];
                    }
                    else if((i < j) && (j < k)) {
                        arr[i][j][k] = arr[i][j][k-1] + arr[i][j-1][k-1] - arr[i][j-1][k];
                    } else {
                        arr[i][j][k] = arr[i-1][j][k] + arr[i-1][j-1][k] + arr[i-1][j][k-1] - arr[i-1][j-1][k-1];
                    }
                }
            }
        }

        while (true) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            if (a == -1 && b == -1 && c==-1) {
                break;
            } else if(a <= 0 || b <= 0 || c <= 0) {
                System.out.printf("w(%d, %d, %d) = %d\n", a, b, c, 1);
            } else if(a > 20 || b > 20 || c > 20) {
                System.out.printf("w(%d, %d, %d) = %d\n", a, b, c, arr[20][20][20]);
            } else {
                System.out.printf("w(%d, %d, %d) = %d\n", a, b, c, arr[a][b][c]);
            }
        }
    }
}
