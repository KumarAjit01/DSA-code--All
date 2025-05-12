import java.util.*;

class check {
  public static void main(String arg[]) {
    String x, y;
    Scanner in = new Scanner(System.in);
    System.out.println("enter the a String");
    x = in.nextLine();
    y = x.substring(3, 6);
    System.out.println("String= " + y);
    in.close();
  }
}
