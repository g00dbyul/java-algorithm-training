package algorithm_study.three_week;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class ParenthesisString {
    public static void main(String[] args) throws IOException {
        // https://www.acmicpc.net/problem/9012
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            if (isCorrect(input)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    public static boolean isCorrect(String input) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            char parenthesis = input.charAt(i);
            if (parenthesis == '(') {
                stack.push(parenthesis);
            } else {
                if (stack.isEmpty()) return false;
                stack.pop();
            }
        }
        if (stack.isEmpty()) return true;
        return false;
    }
}
