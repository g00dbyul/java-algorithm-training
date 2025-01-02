package algorithm_study.three_week;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class StrangeProblem {
    // https://www.acmicpc.net/problem/4949
    // Pass ㅠㅠㅠㅠ
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String page = br.readLine();
        Stack<Character> stack = new Stack();
        boolean isFailed = false;
        for (int i = 0; i < page.length(); i++) {
            char word = page.charAt(i);
            System.out.println(word);
            // if (word == '.') {
            //     if(stack.isEmpty() && !isFailed) {
            //         System.out.println("yes");
            //     } else {
            //         System.out.println("no");
            //     }
            //     stack.clear();
            //     isFailed = false;
            // } else if((word == '(' || word == '[') && !isFailed) {
            //     stack.push(word);
            // } else if((word == ')' || word == ']') && !isFailed) {
            //     if (stack.isEmpty()) {
            //         isFailed = true;
            //     } else {
            //         char pop = stack.pop();
            //         if (pop != word) {
            //             isFailed = true;
            //         }
            //     }
            // }
        }
    }
}
