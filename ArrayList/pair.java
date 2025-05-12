package ArrayList;

import java.util.*;

public class pair {
    public static boolean cheaksum(ArrayList<Integer> pairsum, int target) {
        for (int i = 0; i < pairsum.size(); i++) {
            for (int j = i + 1; j < pairsum.size(); j++) {
                if (pairsum.get(i) + pairsum.get(j) == target) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> pairsum = new ArrayList<>();
        pairsum.add(11);
        pairsum.add(15);
        pairsum.add(6);
        pairsum.add(8);
        pairsum.add(9);
        pairsum.add(10);
        System.out.println(cheaksum(pairsum, 16));
    }

}
