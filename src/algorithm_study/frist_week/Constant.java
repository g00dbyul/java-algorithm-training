package algorithm_study.frist_week;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Constant {
    // https://www.acmicpc.net/problem/2908
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );
        StringTokenizer st = new StringTokenizer(br.readLine());
        String a = st.nextToken();
        String b = st.nextToken();
        StringBuilder reverseA =  new StringBuilder();
        StringBuilder reverseB = new StringBuilder();
        for (int i = a.length() - 1; i >= 0; i--) {
            reverseA.append(a.charAt(i));
        }
        for (int i = b.length() - 1; i >= 0; i--) {
            reverseB.append(b.charAt(i));
        }
        int intA = Integer.parseInt(reverseA.toString());
        int intB = Integer.parseInt(reverseB.toString());
        if (intA > intB) {
            System.out.println(intA);
        } else {
            System.out.println(intB);
        }
    }
}
