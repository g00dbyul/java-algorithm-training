package algorithm_study.fourth_week.set_and_map;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class RemainPeople {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<String> namSet = new LinkedHashSet<>();
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            boolean status = toStatus(st.nextToken());
            if (status) {
                namSet.add(name);
            } else {
                namSet.remove(name);
            }
        }
        
        List<String> nameList = new ArrayList<>();
        namSet.stream().forEach(name -> nameList.add(name));
        nameList.sort((n1, n2) -> {
            return n2.compareTo(n1);
        });
        for (String name: nameList) {
            System.out.println(name);
        }
    }

    // enter : true, leave : false
    private static boolean toStatus(String input) {
        return input.equals("enter");
    }
}
