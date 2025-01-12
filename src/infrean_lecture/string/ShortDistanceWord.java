package infrean_lecture.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class ShortDistanceWord {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String s = st.nextToken();
        char t = st.nextToken().charAt(0);
        List<Integer> indexList = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == t) indexList.add(i);
        }
        int[] distance = new int[s.length()];
        for (int i = 0; i < distance.length; i++) {
            distance[i] = Integer.MAX_VALUE;
        }

        for (int index: indexList) {
            for (int i = 0; i < s.length(); i++) {
                if (index == i) {
                    distance[i] = 0;
                } else {
                    if (distance[i] == 0) {
                        continue;
                    } else {
                        distance[i] = Math.min(Math.abs(index - i), distance[i]);
                    }
                }
            }
        }

        for (int d: distance) {
            System.out.print(d + " ");
        }
        System.out.println();
    }
}
