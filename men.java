import java.util.*;

public class men {
    public static int max(int nums[]) {
        if (nums.length <= 2) {
            return -1;
        }

        Arrays.sort(nums);
        int inx = nums.length / 2;
        return inx;

    }

    public static void main(String args[]) {
        int nums[] = { 2, 3, 4, 5 };

        System.out.println(nums);
    }

}
