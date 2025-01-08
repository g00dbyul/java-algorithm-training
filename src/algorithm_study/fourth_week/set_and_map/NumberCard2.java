package algorithm_study.fourth_week.set_and_map;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class NumberCard2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        Map<Integer, Integer> numberMap = new HashMap<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int input = Integer.parseInt(st.nextToken());
            if (numberMap.containsKey(input)) {
                int value = numberMap.get(input);
                numberMap.put(input, value + 1);
            } else {
                numberMap.put(input, 1);
            }
        }

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < m; i++) {
            int input = Integer.parseInt(st.nextToken());
            if (numberMap.containsKey(input)) {
                // System.out.print(numberMap.get(input) + " ");
                result.append(numberMap.get(input) + " ");
            } else {
                result.append(0 + " ");
                // System.out.print(0 + " ");
            }
        }
        System.out.println(result);
    }
}
