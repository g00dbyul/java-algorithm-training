package algorithm_study.second_week.brute_force;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DivideSum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );
        String n = br.readLine();
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < Integer.parseInt(n); i++) {
            int sum = i;
            String stringInt = String.valueOf(i);
            for (int j = 0; j < stringInt.length(); j++) {
                sum += Integer.parseInt(String.valueOf(stringInt.charAt(j)));
            }
            if (sum == Integer.parseInt(n)) min = Integer.min(i, min);
        }
        if (min == Integer.MAX_VALUE) {
            System.out.println(0);
        } else {
            System.out.println(min);
        }
    }
}
