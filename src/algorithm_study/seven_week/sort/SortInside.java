package algorithm_study.seven_week.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortInside {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < input.length(); i++) {
            list.add(
                Integer.valueOf(String.valueOf(input.charAt(i)))
            );
        }
        Collections.sort(list, Collections.reverseOrder());
        StringBuilder result = new StringBuilder();
        for (Integer i: list) {
            result.append(i);
        }
        System.out.println(result);
    }
}
