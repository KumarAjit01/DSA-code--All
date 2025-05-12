package RUCURSION;

public class stair {
    public static int findstair(int n) {
        if (n == 1 || n == 2 || n == 3) {
            return n;
        }
        return findstair(n - 1) + findstair(n - 2) + findstair(n - 3);
    }

    public static void main(String[] args) {
        System.out.println(findstair(4));

    }

}
