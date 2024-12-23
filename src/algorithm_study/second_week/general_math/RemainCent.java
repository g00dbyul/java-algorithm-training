package algorithm_study.second_week.general_math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RemainCent {
    // https://www.acmicpc.net/problem/2720
    public static void main(String[] args) throws IOException {
        int[] cents = {25, 10, 5, 1};
        int[] result = new int[4];
        
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            int money = Integer.parseInt(br.readLine());
            for (int j = 0; j < 4; j++) {
                result[j] = money / cents[j];
                money = money % cents[j];
            }
            for(int r: result) {
                System.out.print(r + " ");
            }
            System.out.println();
        }       
    }
}
