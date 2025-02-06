package algorithm_study.seven_week.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

/**
 * -10 -9 2 4
 * 
 * 2 3 0 3 1
 */

public class PositionPress {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Integer[] arr = new Integer[n];
        Set<Integer> set = new TreeSet<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            arr[i] = num;
            set.add(num);
        }
        Integer[] sorted = set.toArray(new Integer[0]);
        StringBuilder result = new StringBuilder();
        for (int i: arr) {
            int start = 0;
            int end = sorted.length;
            while (start <= end) {
                int mid = (start + end) / 2;
                if (sorted[mid] == i) {
                    result.append(mid + " ");
                    break;
                }
                if (sorted[mid] < i) {
                    start = mid;
                } else {
                    end = mid;
                }
            }  
        }
        System.out.println(result);
    }
}
