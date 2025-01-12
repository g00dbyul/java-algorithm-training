package infrean_lecture.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringPress {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        StringBuilder result = new StringBuilder();
        char previous = input.charAt(0);
        int count = 1;
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == previous) {
                count++;
            } else {
                result.append(previous);
                if (count >= 2) {
                    result.append(String.valueOf(count));
                }
                previous = input.charAt(i);
                count = 1;
            }
        }
        result.append(previous);
        if (count >= 2) {
            result.append(String.valueOf(count));
        }
        System.out.println(result);
    }
}
