public class findkey {
    public static int findkeys(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return findkeys(arr, key, i + 1);
    }

    public static void main(String args[]) {
        int arr[] = { 3, 5, 6, 11, 19, 31, 15, 76, 99, 3 };
        int key = 3;
        System.out.println(findkeys(arr, key, 0));
    }

}
