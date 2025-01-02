package algorithm_study.three_week;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Queue2 {
    // https://www.acmicpc.net/problem/18258
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        LinkedList<Integer> queue = new LinkedList<>();
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String command = " ";
            int target = 0;
            if (st.countTokens() != 1) {
                command = st.nextToken();
                target = Integer.parseInt(st.nextToken());
            } else {
                command = st.nextToken();
            }
            switch (command) {
                case "push":
                    // push X: 정수 X를 큐에 넣는 연산이다.
                    queue.add(target);
                    break;
                case "pop":
                    // pop: 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
                    if (queue.isEmpty()) {
                        bw.write(String.valueOf(-1));
                    } else {
                        int pop = queue.pop();
                        bw.write(String.valueOf(pop));
                    }
                    bw.newLine();
                    break;
                case "size":
                    // size: 큐에 들어있는 정수의 개수를 출력한다.
                    bw.write(String.valueOf(queue.size()));
                    bw.newLine();
                    break;
                case "empty":
                    // empty: 큐가 비어있으면 1, 아니면 0을 출력한다.
                    if (queue.isEmpty()) {
                        bw.write(String.valueOf(1));
                    } else {
                        bw.write(String.valueOf(0));
                    }
                    bw.newLine();
                    break;
                case "front":
                    // front: 큐의 가장 앞에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
                    if (queue.isEmpty()) {
                        bw.write(String.valueOf(-1));
                    } else {
                        bw.write(String.valueOf(queue.getFirst()));
                    }
                    bw.newLine();
                    break;
                case "back":
                    // back: 큐의 가장 뒤에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
                    if (queue.isEmpty()) {
                        bw.write(String.valueOf(-1));
                    } else {
                        bw.write(String.valueOf(queue.getLast()));
                    }
                    bw.newLine();
                    break;
                default:
                    break;
            }
            // bw.write(queue.toString());
            // bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
