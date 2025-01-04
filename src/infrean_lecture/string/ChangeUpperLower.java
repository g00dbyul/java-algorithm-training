package infrean_lecture.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChangeUpperLower {
    public static void main(String[] args) throws IOException {
        // StuDY
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        StringBuilder result = new StringBuilder();
        for (char i : input.toCharArray()) {
            if (Character.isUpperCase(i)) {
                result.append(
                    String.valueOf(i).toLowerCase()
                );
            } else {
                result.append(
                    String.valueOf(i).toUpperCase()
                );
            }
        }
        System.out.println(result);
    }
}
