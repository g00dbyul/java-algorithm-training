package infrean_lecture.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UpgradeTurnableString {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String replaced = input.replaceAll("[^a-zA-Z]", "").toLowerCase();
        if (replaced.equals(new StringBuilder(replaced).reverse().toString())) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
