package infrean_lecture.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveRedundacnyWord {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        Set<Character> alphabets = new LinkedHashSet<>();
        for (int i = 0; i < input.length(); i++) {
            if (!alphabets.contains(input.charAt(i))) alphabets.add(input.charAt(i));
        }
        for (char c: alphabets) {
            System.out.print(c);
        }
        System.out.println();
    }
}
