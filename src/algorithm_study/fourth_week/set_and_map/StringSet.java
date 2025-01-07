package algorithm_study.fourth_week.set_and_map;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class StringSet {
            public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            Set<String> stringMap = new HashSet<>();
            for (int i = 0; i < n; i++) {
                stringMap.add(br.readLine());
            }
            
            int count = 0;
            for (int i = 0; i < m; i++) {
                String input = br.readLine();
                if (stringMap.contains(input)) count++;
            }
            System.out.println(count);
        }
}


