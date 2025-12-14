package review;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ModrichAlphabet {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input =  br.readLine();
        
        String[] modrich = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        for(String m : modrich) {
            if(input.contains(m)) {
                input = input.replace(m, " ");
            }
            
        }
        System.out.println(input.length());
    }
}
