package algorithm_study.frist_week;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ExamCheat {
    // https://www.acmicpc.net/problem/1546
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        double[] arr = new double[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        double sum = 0;
        double maximum = arr[n-1];
        for (int i = 0; i < n; i++) {
            arr[i] = (arr[i]/maximum) * 100;
            sum = sum + arr[i];
        }
        System.out.println(sum / n);
    }
}
