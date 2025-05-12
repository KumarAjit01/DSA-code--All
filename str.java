//import java.util.*;

public class str {
    public static void print(String name) {
        for (int i = 0; i < name.length(); i++) {
            System.out.print(name.charAt(i) + " ");
        }
    }

    public static void main(String args[]) {
        String firstname = "ajit";
        String lastname = "kumar";
        String fullname = firstname + lastname;
        print(fullname);

    }

}
