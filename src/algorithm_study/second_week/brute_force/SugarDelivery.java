package algorithm_study.second_week.brute_force;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class SugarDelivery {
    /*
     * 3 5
     * 
     * 3 1
     * 4 0
     * 5 1
     * 6 2 -> 6 - 3, 6 - 5
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );
        int n = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();
        list.add(-1); // 0
        list.add(-1); // 1
        list.add(-1); // 2
        list.add(1); // 3
        list.add(-1); // 4
        list.add(1); // 5
        if (n <= 5) {
            System.out.println(list.get(n));
        } else {
            for (int i = 6; i <= n; i++) {
                if ((list.get(i - 3) == -1) && (list.get(i - 5) == -1)) {
                    list.add(-1);
                } else if (list.get(i - 3) == -1) {
                    list.add(
                        list.get(i - 5) + 1
                    );
                } else if (list.get(i - 5) == -1) {
                    list.add(
                        list.get(i - 3) + 1
                    );
                } else {
                    list.add(
                        Integer.min(list.get(i - 3) + 1, list.get(i - 5) + 1)
                    );
                }
            }
            System.out.println(list.get(n));
        }
    }
}
