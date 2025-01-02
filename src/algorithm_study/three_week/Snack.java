package algorithm_study.three_week;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Stack;
import java.util.StringTokenizer;

public class Snack {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LinkedList<Integer> queue = new LinkedList<>();
        
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            queue.add(Integer.parseInt(st.nextToken()));
        }
        if (isValid(queue, n)) {
            System.out.println("Nice");
        } else {
            System.out.println("Sad");
        }
    }

    public static boolean isValid(LinkedList<Integer> queue, int size) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 1; i <= size; i++) {
            if (i == 1) {
                while (queue.peek() != i) {
                    stack.add(queue.poll());
                }
                queue.poll();
            } else {
                if (!stack.isEmpty() && stack.peek() == i) {
                    stack.pop();
                } else {
                    if (queue.isEmpty() || !queue.contains(i)) return false;
                    while (queue.peek() != i) {
                        stack.add(queue.poll());
                    }
                    queue.poll();
                }
            }
        } 
        return true;
    }
}
