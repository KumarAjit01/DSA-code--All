
//Count how many times lower case vowels occurred in a String entered by the user
import java.util.*;

public class string_asmntques1 {

    public static void main(String args[]) {
        System.out.println("enter string ");
        String str = new Scanner(System.in).nextLine();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        System.out.println("count of vowel is:" + count);

    }

}
