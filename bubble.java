import java.util.*;

public class bubble {
    public static void sorting(int bubb[]) {
        for (int i = 0; i < bubb.length; i++) {
            for (int j = 0; j < bubb.length - 1 - i; j++) {
                if (bubb[j] > bubb[j + 1]) {
                    int temp = bubb[j];
                    bubb[j] = bubb[j + 1];
                    bubb[j + 1] = temp;
                }
            }
        }
    }

    public static void arr(int bubb[]) {
        for (int i = 0; i < bubb.length; i++) {
            System.out.print(bubb[i]);
        }
        System.out.println();
    }

    public static void main(String args[]) {
        System.out.println("enter the range");
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        int bubb[] = new int[range];
        System.out.println("enter the elemnt");
        for (int i = 0; i < bubb.length; i++) {
            bubb[i] = sc.nextInt();
        }
        sorting(bubb);
        arr(bubb);
        sc.close();
    }
}