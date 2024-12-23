package algorithm_study.second_week.general_math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class NbaseChange {
    // https://www.acmicpc.net/problem/2745
    public static void main(String[] args) throws IOException {
        Map<String, Integer> base = new HashMap<>();
        int num = 0;
        for (char i = '0'; i <= '9'; i++) {
            base.put(String.valueOf(i), num);
            num += 1;
        }
        for (char i = 'A'; i <= 'Z'; i++) {
            base.put(String.valueOf(i), num);
            num += 1;
        }

        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );
        StringTokenizer st = new StringTokenizer(br.readLine());
        String numberToString = st.nextToken();
        int nBase = Integer.parseInt(st.nextToken());
        double result = 0;
        int position = 0;
        String reverse = new StringBuilder(numberToString).reverse().toString();
        for(int i = 0; i < reverse.length(); i++) {
            int value = base.get(String.valueOf(reverse.charAt(i)));
            // System.out.println(Math.pow(nBase, position));
            result = result + (value * Math.pow(nBase, position));
            position += 1;
        }
        System.out.println((int) result);
    }
}
