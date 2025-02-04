package solo_training;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BinaryTile {
    /**
     * 
     * 1 -> 1 (1)
     * 2 -> 2 (11, 00)
     * 3 -> 3 (100, 001, 111)
     * 4 -> 5 (0011, 0000, 1001, 1100, 1111)
     * 5 -> 8 (10000, 00100, 00001, 11100, 11001, 10011, 00111, 11111)
     * 
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long[] memory = new long[1000001];
        memory[1] = 1;
        memory[2] = 2;
        for(int i = 3; i <= n; i++) {
            memory[i] = (memory[i-1] + memory[i-2]) % 15746;
        }
        System.out.println(memory[n]);
    }
}
