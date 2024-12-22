package algorithm_study.frist_week;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class GroupWordChecker {
    // https://www.acmicpc.net/problem/1316
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );
        int n = Integer.parseInt(br.readLine());
        int count = 0;
        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            if(isGroupWord(input)) {
                count += 1;
            }
        }
        System.out.println(count);
    }

    public static boolean isGroupWord(String input) {
        String previous = String.valueOf(input.charAt(0));
        List<String> candidate = new ArrayList<>();
        candidate.add(previous);
        for (int i = 1; i < input.length(); i++) {
            String word = String.valueOf(input.charAt(i));
            if (previous.equals(word)) {
                continue;
            } else {
                if (candidate.contains(word)) {
                    return false;
                } else {
                    previous = word;
                    candidate.add(word);
                }
            }
        }
        return true;
    }
}
