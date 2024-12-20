package algorithm_study.frist_week;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class OvenClock {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(
            new InputStreamReader(System.in)
        );
        StringTokenizer st = new StringTokenizer(br.readLine());
        int hour = Integer.parseInt(st.nextToken());
        int minute = Integer.parseInt(st.nextToken());
        int cookingTime = Integer.parseInt(br.readLine());

        /*
         * cookingTime -> n : m 
         */
        int cookingHour = 0;
        int cookingMinute = 0;
        while (cookingTime - 60 > 0) {
            cookingTime -= 60;
            cookingHour += 1;
        }
        cookingMinute = cookingTime;

        hour += cookingHour;
        minute += cookingMinute;

        if (minute >= 60) {
            minute = minute - 60;
            hour = hour + 1;
        }

        if (hour >= 24) {
            hour = hour - 24;
        }

         System.out.println(hour + " " + minute);
    }
}
