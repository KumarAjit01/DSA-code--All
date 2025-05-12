import java.util.*;

public class sii {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter amount");
        int amount = sc.nextInt();
        System.out.println("enter rate ");
        int rate = sc.nextInt();
        System.out.println("enter time ");
        int time = sc.nextInt();
        int si = amount * rate * time;
        System.out.println("the interset=" + si);
        sc.close();
    }

}
