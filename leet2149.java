public class leet2149 {
    public static void print(int nums[]) {
        // find length of postive and negative
        int n = nums.length / 2;
        int postive[] = new int[n];
        int negative[] = new int[n];
        int pIndex = 0, nIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                postive[pIndex++] = nums[i];
            } else {
                negative[nIndex++] = nums[i];
            }
        }
        int ans[] = new int[nums.length];
        int inx = 0;
        for (int k = 0; k < n; k++) {
            ans[inx++] = postive[k];
            ans[inx++] = negative[k];
        }
        for (int s = 0; s < ans.length; s++) {
            System.out.print(ans[s] + " ");
        }

    }

    public static void main(String[] args) {
        int nums[] = { 3, 1, -2, -5, 2, -4 };
        print(nums);
    }
}