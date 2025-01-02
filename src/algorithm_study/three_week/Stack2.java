package algorithm_study.three_week;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Stack2 {
    // https://www.acmicpc.net/problem/28278
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            // System.out.println("Tokens : " + st.countTokens());
            int command = 0;
            int target = 0;
            if (st.countTokens() != 1) {
                command = Integer.parseInt(st.nextToken());
                target = Integer.parseInt(st.nextToken());
            } else {
                command = Integer.parseInt(st.nextToken());
            }
            switch (command) {
                case 1:
                    // 1 X: 정수 X를 스택에 넣는다. (1 ≤ X ≤ 100,000)
                    stack.push(target);
                    break;
                case 2:
                    // 2: 스택에 정수가 있다면 맨 위의 정수를 빼고 출력한다. 없다면 -1을 대신 출력한다.
                    if (stack.isEmpty()) {
                        System.out.println(-1);
                    } else {
                        System.out.println(stack.pop());
                    }
                    break;
                case 3:
                    //  3: 스택에 들어있는 정수의 개수를 출력한다.
                    System.out.println(stack.size());
                    break;
                case 4:
                    // 4: 스택이 비어있으면 1, 아니면 0을 출력한다.
                    if (stack.isEmpty()) {
                        System.out.println(1);
                    } else {
                        System.out.println(0);
                    }
                    break;
                case 5:
                    //  5: 스택에 정수가 있다면 맨 위의 정수를 출력한다. 없다면 -1을 대신 출력한다.
                    if (stack.isEmpty()) {
                        System.out.println(-1);
                    } else {
                        System.out.println(stack.peek());
                    }
                    break;
                default:
                    break;
            }
        }
    }
}
