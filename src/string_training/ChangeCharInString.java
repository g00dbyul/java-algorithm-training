package string_training;

public class ChangeCharInString {
    public static void main(String[] args) {
        String str = "abcdefg";
        char[] charArr = str.toCharArray();
        charArr[1] = 'x';
        charArr[2] = 'y';

        String changedString = new String(charArr);
        
        System.out.println(changedString);
    }
}
