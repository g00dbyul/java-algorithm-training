package algorithm_study.frist_week;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ascii {
    // https://www.acmicpc.net/problem/11654
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );
        String input = br.readLine();
        System.out.println((int) input.charAt(0));
    }
}
