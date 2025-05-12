import java.util.*;

public class main1 {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int newarr[] = new int[m + n];
        int idx = 0;
        for (int i = 0; i < m; i++) {
            newarr[idx++] = nums1[i];
        }
        for (int i = 0; i < n; i++) {
            newarr[idx++] = nums2[i];
        }
        Arrays.sort(newarr);
        for (int i = 0; i < newarr.length; i++) {
            System.out.print(newarr[i] + " ");

        }

    }

    public static void main(String[] args) {
        int nums1[] = { 1, 2, 3, 0, 0, 0 };
        int m = 3;
        int nums2[] = { 2, 5, 6 };
        int n = 3;
        merge(nums1, m, nums2, n);
    }
}