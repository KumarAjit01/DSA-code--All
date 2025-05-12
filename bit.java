
public class bit {
    public static void oddeven(int n) {
        int maskbit = 1;
        if ((n & maskbit) == 0) {
            System.out.println(" even");
        } else {
            System.out.println("odd");
        }
    }

    public static void main(String args[]) {
        oddeven(5);
        oddeven(4);
    }

}
