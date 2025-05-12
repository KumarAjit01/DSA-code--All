public class leet3289 {

    public static int[] getSneakyNumbers(int[] nums) {
        int array[] = new int[2];
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j] && i != j) {
                    array[index] = nums[j];
                    index++;
                }
            }
        }
        return array;

    }

    public static void main(String[] args) {
        int nums[] = { 0, 1, 1, 0 };

        int result[] = getSneakyNumbers(nums);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

}
