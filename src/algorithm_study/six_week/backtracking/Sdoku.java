package algorithm_study.six_week.backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Sdoku {
    private static int[][] sdoku = new int[9][9];
    public static void main(String[] args) throws IOException {
        int comparison = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 9; j++) {
                sdoku[i][j] = Integer.parseInt(st.nextToken());
                if (sdoku[i][j] == 0) {
                    comparison++;
                }
            }
        }
        search(0, 0);


    }
    
    private static void search(int r, int c) {
        if (r == 8 && c == 8) {
            return;
        }

        if (sdoku[r][c] == 0) {
            for (int i = 1; i <= 9; i++) {
                if (isValid(r, c, i)) {
                    sdoku[r][c] = i;
                    search(r, c + 1);
                }
            }
        }


    }

    private static boolean isValid(int r, int c, int v) {
        
    }
}
