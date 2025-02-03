package algorithm_study.six_week.recursive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cantona {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int length = (int) Math.pow(3, n);
        System.out.println(length);
        String[] arr = new String[length];
        for (int i = 0; i < length; i++) {
            arr[i] = "-";
        }

        cantora(arr, 0, length);
        for(String s: arr) {
            System.out.print(s);
        }
        System.out.println();
    }
    /**
     * 
     * 
     * --- -> (1,2)
     * --------- -> (3,6)
     * (0,8)
     * (0,3) (6,8)
     * (0,0)
     * (2,2)
     */

    private static void cantora(String[] arr, int start, int end) {
        int size = (start + end) / 3;
        System.out.println("size : "+ size);
        System.out.println(start +" "+ end);
        if (size == 0) {
            return;
        }
        
        for (int i = size; i < size * 2; i++) {
            arr[i] = " ";
        }
        cantora(arr, start, size-1);
        cantora(arr, size * 2, end);
    }
}
