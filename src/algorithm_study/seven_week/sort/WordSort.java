package algorithm_study.seven_week.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordSort {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Set<String> dictionary = new HashSet<>();
        for (int i = 0; i < n; i++) {
            dictionary.add(br.readLine());
        }

        List<String> list = new ArrayList<>(dictionary);


        Collections.sort(list, (w1, w2) -> {
            if (w1.length() != w2.length()) {
                return Integer.compare(w1.length(), w2.length());
            } else {
                return w1.compareTo(w2);
            }
        });

        StringBuilder result = new StringBuilder();
        for (String w: list) {
            result.append(w + "\n");
        }
        System.out.println(result);
    }
}
