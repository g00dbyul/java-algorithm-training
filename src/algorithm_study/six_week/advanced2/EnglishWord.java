package algorithm_study.six_week.advanced2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class EnglishWord {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Integer> wordMap = new HashMap<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++) {
            String w = br.readLine();
            if (w.length() < m) {
                continue;
            }
            if (wordMap.containsKey(w)) {
                Integer cnt = wordMap.get(w);
                wordMap.put(w, cnt+1);
            } else {
                wordMap.put(w, 1);
            }
        }

        

        List<WordClass> wordList = new ArrayList<>();
        wordMap.forEach((String w, Integer cnt) -> {
            wordList.add(new WordClass(w, cnt));
        });

        wordList.sort((c1, c2) -> {
            if (c1.count != c2.count) {
                return Integer.compare(c2.count, c1.count);
            } else {
                if (c1.word.length() != c2.word.length()) {
                    return Integer.compare(c2.word.length(), c1.word.length());
                } else {
                    return c1.word.compareTo(c2.word);
                }
            }
        });

        StringBuilder sb = new StringBuilder();
        for (WordClass wc: wordList) {
            sb.append(wc.word+"\n");
        }
        System.out.println(sb);
    }

    private static class WordClass {
        String word;
        int count;

        private WordClass(String word, int count) {
            this.word = word;
            this.count = count;
        }
    }
}
