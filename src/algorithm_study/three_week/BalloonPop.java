package algorithm_study.three_week;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class BalloonPop {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Deque<Balloon> arr = new ArrayDeque<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr.add(new Balloon(i + 1, Integer.parseInt(st.nextToken())));
        }
        
        StringBuilder result = new StringBuilder();

        Balloon poll = arr.poll();
        result.append(poll.index + " ");
        int step = poll.num;

        while (!arr.isEmpty()) {
            if (step > 0) {
                for (int i = 0; i < step - 1; i++) {
                    Balloon first = arr.poll();
                    arr.add(first);
                }
            } else {
                for (int i = 0; i < Math.abs(step); i++) {
                    Balloon end = arr.pollLast();
                    arr.addFirst(end);
                }
            }

            Balloon pick = arr.poll();
            result.append(pick.index + " ");
            step = pick.num;
        }

        System.out.println(result);
    }

    static class Balloon {
        int index;
        int num;

        Balloon(int index, int num) {
            this.index = index;
            this.num = num;
        }
    }
}
