package algorithm_study.fourth_week.set_and_map;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class DifferentString {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        Set<String> wordSet = new HashSet<>();
        for (int i = 1; i <= input.length(); i++) {
            for (int j = 0; j <= input.length() - i; j++) {
                System.out.println(j +" "+(j+i));
                wordSet.add(input.substring(j, j+i));
            }
        }
        System.out.println(wordSet.size());
    }
}
