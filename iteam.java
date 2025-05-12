import java.util.*;23

public class iteam {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        float total = 0;
        System.out.println("pen");
        float pen = sc.nextFloat();
        System.out.println("pencil");
        float pencil = sc.nextFloat();
        System.out.println("ersaser");
        float eraser = sc.nextFloat();
        float sum = pen + pencil + eraser;
        System.out.println("without gst" + sum);
        total = sum + (sum * 0.18f);
        System.out.println("your bill in gst" + total);

    }

}
