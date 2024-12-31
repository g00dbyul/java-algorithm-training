package algorithm_study.second_week.brute_force;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DivideSum {
    /*
     *  245의 분해합은 256(=245+2+4+5)이 된다. 따라서 245는 256의 생성자
     *  216은 225의 생성자
     *  n의 생성자를 구하는 방법? 
     *  생성자가 없는 경우(?)
     */
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );
        String n = br.readLine();
        int sum = 0;
        for (int i = 0; i < n.length(); i++) {
            sum += Integer.parseInt(String.valueOf(n.charAt(i)));
        }
        sum += Integer.parseInt(n);
        System.out.println(sum);
    }
}
