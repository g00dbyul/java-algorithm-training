package algorithm_study.six_week.advanced2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Bearticon {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<Set<String>> messageHistory = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String history = br.readLine();
            if (history.equals("ENTER")) {
                messageHistory.add(new HashSet<>());
            } else {
                messageHistory.get(messageHistory.size() - 1).add(history);
            }
        }
        int result = 0;
        for (Set<String> set: messageHistory) {
            result += set.size();
        }
        System.out.println(result);
    }
}
