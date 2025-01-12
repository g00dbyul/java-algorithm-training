package infrean_lecture.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TurnableString {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine().toLowerCase();
        String reverse = new StringBuilder(input).reverse().toString();
        if (input.equals(reverse)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
