package algorithm_study.frist_week;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dial {
    // https://www.acmicpc.net/problem/5622
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );
        String input = br.readLine();
        int minTime = 0;
        for (int i = 0; i < input.length(); i++) {
            char word = input.charAt(i);
            switch (word) {
                case 'A': case 'B': case 'C':
                    minTime += 3;
                    break;
                case 'D': case 'E': case 'F':
                    minTime += 4;
                    break;
                case 'G': case 'H': case 'I':
                    minTime += 5;
                    break;
                case 'J': case 'K': case 'L':
                    minTime += 6;
                    break;
                case 'M': case 'N': case 'O':
                    minTime += 7;
                    break;
                case 'P': case 'Q': case 'R': case 'S':
                    minTime += 8;
                    break;
                case 'T': case 'U': case 'V':
                    minTime += 9;
                    break;
                case 'W': case 'X': case 'Y': case 'Z':
                    minTime += 10;
                    break;
                default:
                    break;
            }
        }
        System.out.println(minTime);
    }
}
