package algorithm_study.three_week;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class StrangeProblem {
    // https://www.acmicpc.net/problem/4949
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String line = br.readLine();
            if (line.equals(".")) break;
            if (isValid(line)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }

    public static boolean isValid(String line) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < line.length(); i++) {
            char word = line.charAt(i);
            if (word == '(' || word == '[') {
                stack.add(word);
            } else if(word == ')' || word == ']') {
                if (stack.isEmpty()) return false;
                char pop = stack.pop();
                if (!((pop == '(' && word == ')') || (pop == '[' && word == ']'))) return false;
            }
        }
        if (!stack.isEmpty()) return false;
        return true;
    }
}
