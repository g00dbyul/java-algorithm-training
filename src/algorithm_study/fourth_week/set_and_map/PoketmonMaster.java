package algorithm_study.fourth_week.set_and_map;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class PoketmonMaster {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Map<String, String> pocketmonDictionary = new HashMap<>();

        for (int i = 1; i <= n; i++) {
            String input = br.readLine();
            pocketmonDictionary.put(input, String.valueOf(i));
            pocketmonDictionary.put(String.valueOf(i), input);
        }

        for (int i = 0; i < m; i++) {
            System.out.println(pocketmonDictionary.get(br.readLine()));
        }
    }
}
