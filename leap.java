import java.util.*;

public class leap {
    public static void main(String arsg[]) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("enter year");
        int year = sc.nextInt();
        if (year % 4 == 0) {
            System.out.println("this is leap year:" + year);
        } else {
            System.out.println("this is not leap year:" + year);
        }

    }

}
