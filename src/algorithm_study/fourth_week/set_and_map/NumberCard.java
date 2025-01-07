package algorithm_study.fourth_week.set_and_map;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/10815
public class NumberCard {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        int[] cards = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            cards[i] = Integer.parseInt(st.nextToken());
        }

        int m = Integer.parseInt(br.readLine());
        Map<Integer, Boolean> comparison = new LinkedHashMap<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            comparison.put(Integer.parseInt(st.nextToken()), false);
        }

        for (int card: cards) {
            if(comparison.containsKey(card)) comparison.put(card, true);
        }

        for (boolean result: comparison.values()) {
            if (result) {
                System.out.print(1 + " ");
            } else {
                System.out.print(0 + " ");
            }      
        }
        System.out.println();
    }
}
