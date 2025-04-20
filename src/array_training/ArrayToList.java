package array_training;

import java.util.Arrays;
import java.util.List;

public class ArrayToList {
    public static void main(String[] args) {
        Integer[] arr = {1,3,2,4};
        List<Integer> list = Arrays.asList(arr); // Wrapper Type(Object) Array to List

        int[] primitiveArr = {1,5,4,8};
        // boxed -> primitive stream to Object stream
        List<Integer> fromPrimitive = Arrays.stream(primitiveArr).boxed().toList(); // Primitive Type Array to List

        System.out.println(list);
        System.out.println(fromPrimitive);
    }
}
