package solo_training;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WaveNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            long[] memory = new long[101];
            memory[1] = 1;
            memory[2] = 1;
            memory[3] = 1;
            for (int j = 4; j <= n; j++) {
                memory[j] = memory[j-2] + memory[j-3];
            } 
            System.out.println(memory[n]);
        }
    }
}
