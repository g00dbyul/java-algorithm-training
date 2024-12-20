package algorithm_study.frist_week;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Multply {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );

        int a = Integer.parseInt(br.readLine());
        String b = br.readLine();

        for (int i = b.length() - 1; i >= 0; i--) {
            int n = Integer.parseInt(
                String.valueOf(b.charAt(i))
            );
            System.out.println(a * n);
        }
        System.out.println(a * Integer.parseInt(b));
    }
}
