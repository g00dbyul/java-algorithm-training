package algorithm_study.frist_week;

import java.util.Scanner;

public class LongLong {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder name = new StringBuilder();
        for (int i = 0; i < n/4; i++) {
            name.append("long ");
        }
        name.append("int");
        System.out.println(name);
    }
}
