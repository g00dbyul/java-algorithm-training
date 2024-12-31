package algorithm_study.second_week.brute_force;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Chess {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        char[][] arr = new char[n][m];
        for (int i = 0; i < n; i++) {
            String tmpStr = br.readLine();
            for (int j = 0; j < m; j++) {
                arr[i][j] = tmpStr.charAt(j);
            }
        }

        char[][] wCase = {
            {'W','B','W','B','W','B','W','B'},
            {'B','W','B','W','B','W','B','W'},
            {'W','B','W','B','W','B','W','B'},
            {'B','W','B','W','B','W','B','W'},
            {'W','B','W','B','W','B','W','B'},
            {'B','W','B','W','B','W','B','W'},
            {'W','B','W','B','W','B','W','B'},
            {'B','W','B','W','B','W','B','W'},
        };

        char[][] bCase = {
            {'B','W','B','W','B','W','B','W'},
            {'W','B','W','B','W','B','W','B'},
            {'B','W','B','W','B','W','B','W'},
            {'W','B','W','B','W','B','W','B'},
            {'B','W','B','W','B','W','B','W'},
            {'W','B','W','B','W','B','W','B'},
            {'B','W','B','W','B','W','B','W'},
            {'W','B','W','B','W','B','W','B'},
        };

        int minValue = Integer.MAX_VALUE;
        int count = 0;
        for (int i = 0; i <= n - 8; i++) {
            for (int j = 0; j <= m - 8; j ++) {
                count = 0;
                for (int y = i; y < i + 8; y++) {
                    for (int x = j; x < j + 8; x++) {
                        if (arr[y][x] != bCase[y-i][x-j]) {
                            count += 1;
                        }
                    }
                }
                minValue = Integer.min(minValue, count);
                count = 0;
                for (int y = i; y < i + 8; y++) {
                    for (int x = j; x < j + 8; x++) {
                        if (arr[y][x] != wCase[y-i][x-j]) {
                            count += 1;
                        }
                    }
                }
                minValue = Integer.min(minValue, count);
            }
        }
        System.out.println(minValue);
    }
}
