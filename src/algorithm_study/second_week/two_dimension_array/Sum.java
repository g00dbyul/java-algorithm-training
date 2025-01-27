package algorithm_study.second_week.two_dimension_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Sum {
    // https://www.acmicpc.net/problem/2738
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            st =  new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < n; i++) {
            st =  new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                arr[i][j] = arr[i][j] + Integer.parseInt(st.nextToken());
            }
        }

        for(int[] ai : arr) {
            for(int a: ai) {
                System.out.print(a + " ");
            }
            System.out.println();
        }
    }
}
