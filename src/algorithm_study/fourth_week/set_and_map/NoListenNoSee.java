package algorithm_study.fourth_week.set_and_map;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class NoListenNoSee {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<String> noListen = new HashSet<>();
        Set<String> noSee = new HashSet<>();
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++) {
            noListen.add(br.readLine());
        }

        for (int i = 0; i < m; i++) {
            noSee.add(br.readLine());
        }

        List<String> result = new ArrayList<>();
        noListen.retainAll(noSee);
        noListen.stream().forEach(name -> result.add(name));

        result.sort((n1, n2) -> n1.compareTo(n2));
        System.out.println(result.size());
        for (String name: result) {
            System.out.println(name);
        }
    }
}
