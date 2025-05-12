import java.util.*;

public class togle {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter String name");
        String s = sc.nextLine();
        StringBuilder str = new StringBuilder(s);

        for (int i = 0; i < str.length(); i++) {

            // cheack -> alphabet -small ,captital
            boolean flag = true; // true capital
            char ch = str.charAt(i);
            if (ch == ' ')
                continue;
            int asci = (int) ch;
            if (asci >= 97)
                flag = false;// small
            if (flag == true) {// capital
                asci += 32;
                char dh = (char) asci;
                str.setCharAt(i, dh);

            } else {// small
                asci -= 32;
                char dh = (char) asci;
                str.setCharAt(i, dh);

            }

        }

        System.out.println(str);
        sc.close();
    }

}
