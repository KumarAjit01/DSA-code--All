public class binarysearch {
    public static int binary(int num[], int key) {
        int start = 0, end = num.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (num[mid] == key) {
                return mid;
            } else if (num[mid] > key) {
                end = mid - 1;
            } else {
                start = mid + 1;

            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int num[] = { 2, 4, 5, 6, 7, 9, 12, 13 };
        int key = 13;
        System.out.println(binary(num, key));
    }
}
