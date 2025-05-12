package Stack;

import java.util.*;

public class blance_Stack {
    public static boolean isCheack(String str) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(') {
                s.push(ch);
            } else {// ch==')'
                if (s.isEmpty())
                    return false;

                s.pop();

            }
        }
        if (s.isEmpty())
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        String str = "(()()()()())";// Flase;
        System.out.println(isCheack(str));

    }

}
