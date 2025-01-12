package infrean_lecture.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class PartialWordReverse {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] input = br.readLine().toCharArray();
        int length = input.length;
        ArrayDeque<Character> stack = new ArrayDeque();
        for (int i = 0; i < length; i++) {
            if (input[i] >= 'A' && input[i] <= 'z') stack.add(input[i]);
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < length; i++) {
            if (input[i] >= 'A' && input[i] <= 'z') {
                result.append(stack.pollLast());
            } else {
                result.append(input[i]);
            }
        }
        if (!stack.isEmpty()) {
            while (!stack.isEmpty()) {
                result.append(stack.pollLast());
            }
        }
        System.out.println(result);
    }
}
