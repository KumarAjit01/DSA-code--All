import java.util.*;

public class neg_posi {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your num:=");
        int num = sc.nextInt();
        if (num == 0) {
            System.out.println("you enter zero" + num);
        } else if (num > 0) {
            System.out.println("you entered positive num=" + num);
        } else {
            System.out.println("you entered negative num=" + num);
        }
        sc.close();

    }
}
