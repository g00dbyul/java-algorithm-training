package algorithm_study.frist_week;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class YourGrade {
    // https://www.acmicpc.net/problem/25206 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );
        StringTokenizer st;
        Map<String, Double> map = new HashMap<>();
        map.put("A+", 4.5);
        map.put("A0", 4.0);
        map.put("B+", 3.5);
        map.put("B0", 3.0);
        map.put("C+", 2.5);
        map.put("C0", 2.0);
        map.put("D+", 1.5);
        map.put("D0", 1.0);
        map.put("F", 0.0);

        double totalPoint = 0;
        double totalMultiplePoint = 0;
        for(int i = 0; i < 20; i++) {
            st  = new StringTokenizer(br.readLine());
            st.nextToken();
            double point = Double.parseDouble(st.nextToken());
            String grade = st.nextToken();
            if (!grade.equals("P")) {
                totalPoint = totalPoint + point;
                totalMultiplePoint = totalMultiplePoint + (point * map.get(grade));
            }
        }
        System.out.println(totalMultiplePoint / totalPoint);
    }
}
