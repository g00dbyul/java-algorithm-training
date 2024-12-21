package algorithm_study.frist_week;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Assignment {
    public static void main(String[] args) throws IOException {
        boolean[] isAssignment = new boolean[31];
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );

        for (int i = 0; i < 28; i++) {
            int n = Integer.parseInt(br.readLine());
            isAssignment[n] = true;
        }

        for (int i = 1; i <= 30; i++) {
            if (!isAssignment[i]) {
                System.out.println(i);
            }
        }
    }
}
