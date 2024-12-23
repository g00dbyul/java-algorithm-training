package algorithm_study.second_week.two_dimension_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ColorPaper {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );
        StringTokenizer st;
        int t = Integer.parseInt(br.readLine());

        int[][] paper = new int[100][100];
        
        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            for (int j = x; j < x+10; j++) {
                for (int k = y; k < y+10; k++) {
                    paper[j][k] = 1;
                }
            }
        }

        int sum = 0;
        for(int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                sum = sum + paper[i][j];
            }
        }
        System.out.println(sum);
    }
}
