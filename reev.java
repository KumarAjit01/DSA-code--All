//import java.util.*;

class reev {
    public static boolean isPalindrome(int x) {
        int originalnum = x;
        int reversenum = 0;
        int remainder;
        while (x != 0 && x > 0) {
            remainder = x % 10;
            reversenum = reversenum * 10 + remainder;
            x /= 10;
        }
        if (originalnum == reversenum) {
            return true;
        }
        return false;

    }

    public static void main(String args[]) {
        int num = -121;
        System.out.println(isPalindrome(num));
    }
}
