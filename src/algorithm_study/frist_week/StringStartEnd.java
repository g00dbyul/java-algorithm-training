package algorithm_study.frist_week;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringStartEnd {
    // https://www.acmicpc.net/problem/9086
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            String input = br.readLine();
            System.out.println(input.charAt(0) + "" +input.charAt(input.length() - 1));
        }
    }
}
