package algorithm_study.three_week;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class CardGame2 {
    // https://www.acmicpc.net/problem/2164
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        LinkedList<Integer> cards = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            cards.add(i);
        }
        while (cards.size() > 1) {
            cards.pop();
            int pop = cards.pop();
            cards.add(pop);
        }
        System.out.println(cards.getFirst());
    }
}
