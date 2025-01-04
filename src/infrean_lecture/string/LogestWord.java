package infrean_lecture.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LogestWord {
    // it is time to study
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] splitted = input.split(" ");
        String longWord = "";
        for (String word : splitted) {
            if (longWord.length() < word.length()) longWord = word;
        }
        System.out.println(longWord);
    }
}
