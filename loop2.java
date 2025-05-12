import java.util.*;

public class loop2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter num");
        int num = sc.nextInt();
        int sum = 0;
        int i = 1;
        while (i <= num) {
            sum = sum + i;
            i++;
        }

    }

}
