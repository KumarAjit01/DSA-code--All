public class last {
    public static int findKey(int arr[], int i, int key) {
        if (i == arr.length)
            return -1;
        int found = findKey(arr, i + 1, key);
        if (found != -1) {
            return found;
        }
        if (arr[0] == key) {
            return 0;

        }

        return -1;

    }

    public static int key(int arr[], int i, int key) {
        if (i == arr.length) {
            return -1;

        }
        int find = key(arr, i + 1, key);
        if (find == -1 && arr[i] == key) {
            return i;
        }
        return find;
    }

    public static void main(String args[]) {
        int arr[] = { 2, 3, 4, 6, 7, 8 };
        int key = 5;
        System.out.println(findKey(arr, 1, key));
    }

}
