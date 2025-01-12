package infrean_lecture.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PickNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        StringBuilder result = new StringBuilder();
        for (char c: input.toCharArray()) {
            if (Character.isDigit(c)) result.append(String.valueOf(c));
        }
        System.out.println(Integer.parseInt(result.toString()));
    }
}
