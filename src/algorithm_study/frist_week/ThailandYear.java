package algorithm_study.frist_week;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThailandYear {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );

        int year = Integer.parseInt(br.readLine());
        System.out.println(year - 543);
    }
}
