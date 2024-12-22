package algorithm_study.frist_week;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class FindAlphabet {
    // https://www.acmicpc.net/problem/10809
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );
        String input = br.readLine();
        Map<String, Integer> map = new HashMap<>();
        for (char i = 'a'; i <= 'z'; i++) {
            map.put(String.valueOf(i), -1);
        }
        for (int i = 0; i < input.length(); i++) {
            String alphabet = String.valueOf(input.charAt(i));
            if (map.get(alphabet) == -1) {
                map.put(alphabet, i);
            }
        }

        for (char i = 'a'; i <= 'z'; i++) {
            System.out.print(map.get(String.valueOf(i)) + " ");
        }
        System.out.println();
    }
}
