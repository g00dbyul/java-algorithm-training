package algorithm_study.frist_week;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class WordStudy {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );
        String input = br.readLine().toUpperCase();
        int arrSize = ((int) 'Z') - ((int) 'A') + 1;
        int aAsciiCode = (int) 'A';
        Alphabet[] alphabets = new Alphabet[arrSize];
        for (int i = 0; i < arrSize; i++) {
            alphabets[i] = new Alphabet((char) (i+aAsciiCode), 0);
        }

        for (int i = 0; i < input.length(); i++) {
            int key = (int) input.charAt(i) - aAsciiCode;
            alphabets[key].count += 1;
        }

        Arrays.sort(alphabets, (o1, o2) -> Integer.compare(o2.count, o1.count));
        if (alphabets[0].count == alphabets[1].count) {
            System.out.println("?");
        } else {
            System.out.println(alphabets[0].alphabet);
        }
    }
}

class Alphabet {
    char alphabet;
    int count;

    Alphabet(char alphabet, int count) {
        this.alphabet = alphabet;
        this.count = count;
    }
}
