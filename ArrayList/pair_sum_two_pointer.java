package ArrayList;

import java.util.*;

public class pair_sum_two_pointer {
    public static Boolean isCheack(ArrayList<Integer> pairsum, int target) {
        int lp = 0;
        int rp = pairsum.size() - 1;
        while (lp != rp) {
            // case 1
            if (pairsum.get(lp) + pairsum.get(rp) == target) {
                return true;
            }
            // case 2
            if (pairsum.get(lp) + pairsum.get(rp) < target) {
                lp++;
            } else {
                // case 3
                rp--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> pairsum = new ArrayList<>();
        pairsum.add(1);
        pairsum.add(2);
        pairsum.add(3);
        pairsum.add(4);
        pairsum.add(5);
        System.out.println(isCheack(pairsum, 3));
    }

}
