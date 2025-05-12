public class copy1 {
    public static int[] getConcatenation(int[] nums) {
        int n = nums.length * 2;
        int arr[] = new int[n];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            arr[i + nums.length] = nums[i];
        }

        return arr;

    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 3 };

        int result[] = getConcatenation(nums);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }

}
