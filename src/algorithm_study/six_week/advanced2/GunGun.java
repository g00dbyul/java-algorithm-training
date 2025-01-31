package algorithm_study.six_week.advanced2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class GunGun {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<String> dance = new HashSet<>();
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String a = st.nextToken();
            String b = st.nextToken();
            if (dance.size() == 0) {
                if (a.equals("ChongChong") || b.equals("ChongChong")) {
                    dance.add(a);
                    dance.add(b);
                } else {
                    continue;
                }
            } else {
                if (dance.contains(a)) {
                    dance.add(b);
                } else if (dance.contains(b)) {
                    dance.add(a);
                }
            }
        }
        System.out.println(dance.size());
    }
}
