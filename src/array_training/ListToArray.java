package array_training;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListToArray {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(2);
        list.add(5);

        // mapToInt -> Object to primitive stream
        int[] arr = list.stream().mapToInt(i -> i.intValue()).toArray();
        System.out.println(Arrays.toString(arr));
    }
}
