package array_training;

import java.util.Arrays;

public class ArrayTowMatrixArray {
    public static void main(String[] args) {
        int[][] arr = new int[][] {{1,3}, {2,0}, {1,1}};

        Arrays.sort(arr, (i1, i2) -> {
            return Integer.compare(i2[1], i1[1]);
        });

        for (int[] a: arr) {
            System.out.println(Arrays.toString(a));
        }
    }
}
