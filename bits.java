public class bits {
    public static void geteven(int n) {
        int bitmask = 1 >> 0;
        if ((bitmask & n) == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }

    public static int getithbit(int n, int i) {
        int bitmask = 1 << i;
        if ((bitmask & n) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static int setithbit(int n, int i) {
        int bitmask = 1 << i;
        return n | bitmask;
    }

    public static void main(String[] args) {
        System.out.println(setithbit(10, 3));

    }

}
