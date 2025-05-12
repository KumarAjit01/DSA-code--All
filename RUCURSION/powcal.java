package RUCURSION;

public class powcal {
    public static int findPow(int base, int pow) {
        if (pow == 0) {
            return 1;
        }
        int result = findPow(base, pow - 1);
        return base * result;
    }

    public static void main(String[] args) {
        System.out.println(findPow(3, 4));

    }

}
