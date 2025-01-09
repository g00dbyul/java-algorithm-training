package algorithm_study.fourth_week.set_and_map;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class DifferenceSum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        Set<Integer> aSet = new HashSet<>();
        for (int i = 0; i < n; i++) {
            aSet.add(Integer.parseInt(st.nextToken()));
        }
        
        st = new StringTokenizer(br.readLine());
        Set<Integer> bSet = new HashSet<>();
        for (int i = 0; i < m; i++) {
            bSet.add(Integer.parseInt(st.nextToken()));
        }

        Set<Integer> aCopy = new HashSet<>();
        Set<Integer> bCopy = new HashSet<>();

        aSet.stream().forEach(num -> aCopy.add(num));
        bSet.stream().forEach(num -> bCopy.add(num));


        aSet.removeAll(bSet);
        bCopy.removeAll(aCopy);
        System.out.println(aSet.size() + bCopy.size());      
    }
}
