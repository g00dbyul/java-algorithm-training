package solo_training;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FibonaciClass {
    private static int recursiveCnt = 0;
    private static int dynamicCnt = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        recursiveFibonaci(n);
        dynamicFibonaci(n);
        System.out.println(recursiveCnt + " " + dynamicCnt);
    }

    private static int recursiveFibonaci(int n) {
        if (n == 1 || n == 2) {
            recursiveCnt++;
            return 1;
        } else {
            return recursiveFibonaci(n - 1) + recursiveFibonaci(n - 2);
        }
    }

    private static int dynamicFibonaci(int n) {
        int[] memory = new int[n+1];
        memory[1] = 1;
        memory[2] = 1;
        for (int i = 3; i <= n; i++) {
            dynamicCnt++;
            memory[i] = memory[i-1] + memory[i-2];
        }
        return memory[n];
    }
}
