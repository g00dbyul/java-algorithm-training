package algorithm_study.frist_week;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Output {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );
        String input = "";
        while ((input = br.readLine()) != null) {
            System.out.println(input);
        }
    }
}
