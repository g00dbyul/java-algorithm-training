package array_training;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArraySlice {
    public static void main(String[] args) {
        int[] arr = IntStream.range(1, 9).toArray();
        System.out.println(Arrays.toString(arr));

        // skip -> 시작 위치(index - 1)
        // limit -> skip으로 부터 개수
        int[] slice = Arrays.stream(arr).skip(3).limit(3).toArray();
        System.out.println(Arrays.toString(slice));
    }
}
