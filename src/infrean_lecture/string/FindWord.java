package infrean_lecture.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindWord {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine().toLowerCase();
        char key = br.readLine().toLowerCase().charAt(0);

        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == key) count += 1;
        }
        System.out.println(count);
    }
}
