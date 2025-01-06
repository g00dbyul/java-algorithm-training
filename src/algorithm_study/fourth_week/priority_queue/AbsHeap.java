package algorithm_study.fourth_week.priority_queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class AbsHeap {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        PriorityQueue<HeapObject> queue = new PriorityQueue<>((o1, o2) -> {
            if (o1.priority == o2.priority) {
                return o1.origin - o2.origin;
            } else {
                return o1.priority - o2.priority;
            }
        });
        for (int i = 0; i < n; i++) {
            int input = Integer.parseInt(br.readLine());
            if (input == 0) {
                if (queue.isEmpty()) {
                    System.out.println(0);
                } else {
                    System.out.println(queue.poll().origin);
                }
            } else {
                queue.add(new HeapObject(Math.abs(input), input));
            }
        }
    }

    static class HeapObject {
        int priority;
        int origin;

        HeapObject(int priority, int origin) {
            this.priority = priority;
            this.origin = origin;
        }
    }
}
