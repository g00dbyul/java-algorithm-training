package array_basic;

import java.util.Arrays;

class SortArray {
    public static void main(String[] args) {
        int[][] input = {
            {1,-5,2,4,3},
            {2,1,1,3,2,5,4},
            {6,1,7}
        };

        for(int[] a: input) {
            solution(a);
        }
    }


    public static void solution(int[] arr) {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}