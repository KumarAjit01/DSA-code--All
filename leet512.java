public class leet512 {

    public static int numIdenticalPairs(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j] && i < j) {
                    count++;
                }
            }
        }
        return count;

    }

    public static void main(String[] args) {
        int num[] = { 1, 2, 3, 1, 1, 3 };
        System.out.println(numIdenticalPairs(num));
    }

}
