public class single {
    public static int singlenum(int nums[]) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum ^ nums[i];

        }
        return sum;

    }

    public static int romantointeger(String s) {
        char i = 1, ii = 2, iii = 3;
        System.out.println(i + ii + iii);
        return 0;
    }

    public static void main(String args[]) {
        /*
         * int nums[] = { 1, 1, 2, 2, 3, 3, 4, 4, 5 };
         * int newsum = singlenum(nums);
         * System.out.println(newsum);
         */
        romantointeger(null);

    }

}
