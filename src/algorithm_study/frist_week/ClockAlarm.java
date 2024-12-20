package algorithm_study.frist_week;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ClockAlarm {
    public static void main(String[] args)  throws IOException {
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );

        StringTokenizer st = new StringTokenizer(
            br.readLine()
        );

        int hour = Integer.parseInt(st.nextToken());
        int minute = Integer.parseInt(st.nextToken());

        /*
         *  minute - 45 > 0 => h: (minute - 45)
         *  minute - 45 < 0 => (h-1) : (minute - 45 + 60)
         */


         if (minute - 45 < 0) {
            hour = hour - 1;
            minute = minute - 45 + 60;
         } else {
            minute = minute - 45;
         }

         if (hour < 0) {
            hour = 24 + hour;
         }

         System.out.println(hour + " " + minute);
    }
}
