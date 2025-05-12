public class leet3190 {
    public static int minimumOperations(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 3 == 2 || nums[i] % 3 == 1) {
                count++;
            } else {
                continue;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int nums[] = { 3, 6, 9 };
        System.out.println(minimumOperations(nums));
    }
}