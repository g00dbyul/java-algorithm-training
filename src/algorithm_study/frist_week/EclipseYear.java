package algorithm_study.frist_week;

import java.util.Scanner;

public class EclipseYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        // year % 4 == 0 and ()
        if ((year%4 == 0) & ((year%100 !=0) || (year%400 == 0))) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
