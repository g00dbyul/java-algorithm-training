package algorithm_study.six_week.combination;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GreenTower {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println((int) Math.pow(2, n));
    }
}
