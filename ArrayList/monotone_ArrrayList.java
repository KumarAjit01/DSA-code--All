
package ArrayList;

import java.util.ArrayList;

public class monotone_ArrrayList {
    public static Boolean isCheackMonotone(ArrayList<Integer> nums) {
        Boolean inc = true;
        Boolean dec = true;

        for (int i = 0; i < nums.size() - 1; i++) {
            if (nums.get(i) > nums.get(i + 1)) {
                inc = false;
            }

            if (nums.get(i) < nums.get(i + 1)) {
                dec = false;
            }

        }

        return inc || dec;

    }

    public static void main(String args[]) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(2);
        nums.add(3);

        System.out.println(isCheackMonotone(nums));

    }

}
