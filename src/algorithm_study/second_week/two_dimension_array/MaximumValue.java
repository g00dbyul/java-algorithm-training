package algorithm_study.second_week.two_dimension_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MaximumValue {
    // https://www.acmicpc.net/problem/2566
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );
        StringTokenizer st;
        int maxRow = 0;
        int maxColumn = 0;
        int maxValue = 0;
        for (int i = 0; i < 9; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 9; j++) {
                int value = Integer.parseInt(st.nextToken());
                if (value > maxValue) {
                    maxValue = value;
                    maxRow = i;
                    maxColumn = j;
                }
            }
        }
        System.out.println(maxValue);
        System.out.println((maxRow+1) +" "+ (maxColumn+1));
    }
}
