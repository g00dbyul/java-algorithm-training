package algorithm_study.seven_week.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class AgeOrder {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        List<Student> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            list.add(new Student(i, age, name));
        }
        Collections.sort(list, (s1, s2) -> {
            if (s1.age != s2.age) {
                return Integer.compare(s1.age, s2.age);
            } else {
                return Integer.compare(s1.number, s2.number);
            }
        });
        for (Student s: list) {
            System.out.println(s.age + " " + s.name);
        }
    }

    private static class  Student {
        int number;
        int age;
        String name;

        Student(int number, int age, String name) {
            this.number = number;
            this.age = age;
            this.name = name;
        }
    }
}
