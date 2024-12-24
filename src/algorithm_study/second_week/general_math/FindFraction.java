package algorithm_study.second_week.general_math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindFraction {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );

        int n = Integer.parseInt(br.readLine());
        int i = 1;
        int sum = 0;
        while (sum < n) {
            sum = sum + i;
            i += 1;
        }
        int son = 0;
        int mother = 0;
        // i가 홀수냐 짝수냐에 따라서 진행 방향이 다름;;
        // System.out.println(i - 1);
        if ((i-1)%2 == 0) {
            son = i - 1;
            mother = 1;
            for (int j = 0; j < sum - n; j++) {
                son -= 1;
                mother += 1;
            }
        } else {
            son = 1;
            mother = i - 1;
            for (int j = 0; j < sum - n; j++) {
                son += 1;
                mother -= 1;
            }
        }
        System.out.println(son + "/" + mother);
    }
}
