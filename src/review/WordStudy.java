package review;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class WordStudy {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine().toLowerCase();
    
        Map<String, Integer> wordMap = new HashMap<>();
        for(String s: input.split("")) {
            if (wordMap.containsKey(s)) {
                wordMap.put(s, wordMap.get(s) + 1);
            } else {
                wordMap.put(s, 1);
            }
        }

        List<Integer> values = new ArrayList<>(wordMap.values());
        values.sort((o1, o2) -> {
            return o2.compareTo(o1);
        });

        int maxValue = values.get(0);

        List<String> maxKey = new ArrayList<>();
        wordMap.forEach((k, v) -> {
            if (wordMap.get(k) == maxValue) {
                maxKey.add(k);
            }
        });

        if (maxKey.size() == 1) {
            System.out.println(maxKey.get(0).toUpperCase());
        } else {
            System.out.println("?");
        }
    }
}
