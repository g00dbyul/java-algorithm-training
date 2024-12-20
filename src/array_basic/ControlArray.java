package array_basic;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ControlArray {
    public static void main(String[] args) {
        int[][] input = {
            {4,2,2,1,3,4},
            {2,1,1,3,2,5,4}
        };

        for(int[] a: input) {
            solution(a);
        }
    }

    public static void solution(int[] arr) {
        Set<Integer> hashSet = new HashSet<>();
        for(int i: arr) {
            if (!hashSet.contains(i)) {
                hashSet.add(Integer.valueOf(i));
            }
        }

        Integer[] result = hashSet.toArray(new Integer[0]);
        Arrays.sort(result, Collections.reverseOrder());
        System.out.println(Arrays.toString(result));
    }
}