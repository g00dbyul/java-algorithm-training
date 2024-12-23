package algorithm_study.second_week.two_dimension_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ColumnRead {
    // https://www.acmicpc.net/problem/10798
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );
        char[][] arr = new char[5][15];
        for (int i = 0; i < 5; i++) {
            String input = br.readLine();
            for (int j = 0; j < 15; j++) {
                if (j < input.length()) {
                    arr[i][j] = input.charAt(j);
                } else {
                    arr[i][j] = ' ';
                }
                
            }
        }

        for (int j = 0; j < 15; j++) {
            for (int i = 0; i < 5; i++) {
                if(!(arr[i][j] == ' ')) {
                    System.out.print(arr[i][j]);
                }
                
            }
        }
    }
}
