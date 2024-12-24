package algorithm_study.second_week.general_math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Snail {
    // https://www.acmicpc.net/problem/2869
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );
        StringTokenizer st = new StringTokenizer(br.readLine());
        double up = Double.parseDouble(st.nextToken());
        double down = Double.parseDouble(st.nextToken());
        double arrive = Double.parseDouble(st.nextToken());

        double oneday = up - down;
        double result = (arrive - up) / oneday;
        System.out.println((int) Math.ceil(result) + 1);
    }
}
