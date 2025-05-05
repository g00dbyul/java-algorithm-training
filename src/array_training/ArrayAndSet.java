package array_training;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayAndSet {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 4, 5};
        Set<Integer> intSet = new HashSet<>();
        Set<Integer> tmpSet = Set.of(3,4);

        // array to set : 이게 최선인듯;; -> 합집합
        intSet.addAll(Arrays.stream(arr).boxed().toList());
        
        // 여집합
        intSet.removeAll(tmpSet);
        System.out.println(intSet);

        // 교집합
        intSet.retainAll(Set.of(1,2));
        System.out.println(intSet);

        int[] toArr = intSet.stream().mapToInt(i -> i.intValue()).toArray();
        System.out.println(Arrays.toString(toArr));
    }
}
