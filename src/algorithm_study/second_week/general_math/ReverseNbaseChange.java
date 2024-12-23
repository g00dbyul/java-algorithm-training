package algorithm_study.second_week.general_math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class ReverseNbaseChange {
    // https://www.acmicpc.net/problem/11005
    public static void main(String[] args) throws IOException {
        Map<Integer, String> baseMap = new HashMap<>();
        int num = 0;
        for (char i = '0'; i <= '9'; i++) {
            baseMap.put(num, String.valueOf(i));
            num += 1;
        }
        for (char i = 'A'; i <= 'Z'; i++) {
            baseMap.put(num, String.valueOf(i));
            num += 1;
        }

        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );
        StringTokenizer st = new StringTokenizer(br.readLine());
        int number = Integer.parseInt(st.nextToken());
        int base = Integer.parseInt(st.nextToken());
        StringBuilder result = new StringBuilder();
        while (number > 0) {
            int remain = number % base;
            result.append(baseMap.get(remain));
            number = number / base;
        }
        System.out.println(result.reverse().toString());
    }
}
