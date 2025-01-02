package algorithm_study.three_week;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Zero {
    // https://www.acmicpc.net/problem/10773
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            int target = Integer.parseInt(br.readLine());
            if (target != 0) {
                stack.push(target);
            } else {
                stack.pop();
            }
        }
        int sum = 0;
            while (!stack.isEmpty()) {
                sum += stack.pop();
            }
        System.out.println(sum);
    }
}
