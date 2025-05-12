import java.util.*;

public class twices {
    public static int maxnum(int num[]) {
        Arrays.sort(num);
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];
            }
        }
        return max;

    }

    public static void main(String args[]) {
        int nums[] = { 1, 2, 3, 4 };
        System.out.println(maxnum(nums));
    }

}
