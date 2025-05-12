import java.util.*;

public class len {
    public static int chechvalidlength(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                count = 0;
            } else {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String str = "i am ajit kumar";
        System.out.println(chechvalidlength(str));

    }

}
