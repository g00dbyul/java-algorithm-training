package infrean_lecture.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


/*
 * 
4
#****###**#####**#####**##** 

 */
public class Password {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(br.readLine());
        String input = br.readLine().trim();
        List<String> words = new ArrayList<>();
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if (temp.length() == 7) {
                words.add(temp.toString());
                temp = new StringBuilder(String.valueOf(input.charAt(i)));
            } else {
                temp.append(String.valueOf(input.charAt(i)));
            }
        }
        words.add(temp.toString());
        for (String word: words) {
            System.out.print((char) toDecimal(convertToBinary(word)));
        }
        System.out.println();
    }

    private static String convertToBinary(String word) {
        return word.replaceAll("[*]", "0")
            .replaceAll("[#]", "1");
    }

    private static int toDecimal(String binary) {
        int head = 0;
        int sum = 0;
        for (int i = binary.length() - 1; i >= 0; i--) {
            int n = Integer.parseInt(String.valueOf(binary.charAt(i)));
            sum = sum + (int) (n * Math.pow(2, head));
            head++;
        }
        return sum;
    }
}
