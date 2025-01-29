package algorithm_study.six_week.combination;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Binary {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int son = 1;
        int mom = 1;
        for (int i = n; i > n - k; i--) {
            son = son * i;
        }

        for (int i = 1; i <= k; i++) {
            mom = mom * i;
        }
        
        System.out.println(son/mom);
    }
}
