package algorithm_study.frist_week;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TurnableString {
    // https://www.acmicpc.net/problem/10988
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );
        String input = br.readLine();
        String reverse = new StringBuilder(input).reverse().toString();
        if (input.equals(reverse)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
