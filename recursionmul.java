public class recursionmul {
    // given a number num and a value k print k multiple of num
    public static void multipleofk(int num, int k) {
        if (k == 0)
            return;
        multipleofk(num, k - 1);
        System.out.println(num * k);
    }

    // given number n find the natural number till n but with alternate sign;
    public static int findNatural(int n) {
        if (n == 0) {
            return n;

        }
        if (n % 2 == 0) {
            return findNatural(n - 1) - n;
        } else {
            return findNatural(n - 1) + n;

        }

    }

    // sum of element
    public static int findsum(int array[], int idx) {
        if (idx == array.length) {
            return 0;
        }
        int result = findsum(array, idx + 1);
        return result + array[idx];
    }

    // find max elemnt in array

    // public static int maxelment(int arr[], int idx) {
    // if (idx == arr.length - 1) {
    // return arr[idx];
    // }
    // int result = maxelment(arr, idx + 1);
    // return Math.max(result, arr[idx]);
    // }

    public static void main(String args[]) {
        int array[] = { 1, 3, 4, 5 };
        System.out.println(findsum(array, 0));

    }

}
