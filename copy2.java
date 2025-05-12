public class copy2 {

    public static int[] getConcatenation(int[] nums) { // Change return type to int[]
        int n = nums.length * 2;
        int[] arr = new int[n]; // Corrected syntax for declaring array

        // Copy nums to the first half of arr
        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[i];
        }

        // Copy nums to the second half of arr
        for (int i = 0; i < nums.length; i++) {
            arr[i + nums.length] = nums[i];
        }

        return arr; // Corrected return type
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3 };
        int[] result = getConcatenation(nums);

        // Print the elements of the result array
        for (int i : result) {
            System.out.print(i + " ");
        }
    }

}
