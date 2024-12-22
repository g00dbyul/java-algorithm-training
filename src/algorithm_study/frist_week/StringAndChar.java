package algorithm_study.frist_week;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringAndChar {
    // https://www.acmicpc.net/problem/27866
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );

        String s = br.readLine();
        int i = Integer.parseInt(br.readLine());
        System.out.println(s.charAt(i-1));
    }
}
