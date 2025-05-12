public class merge_arr {
    public static void merge(int firstarr[], int secondarr[]) {

        // create new arr
        int thirdarr[] = new int[firstarr.length + secondarr.length];
        // adding value in new arr
        for (int i = 0; i < firstarr.length; i++) {
            thirdarr[i] = firstarr[i];
        }
        // adding second arr in third arr
        for (int k = 0; k < secondarr.length; k++) {
            thirdarr[firstarr.length + k] = secondarr[k];
        }
        // printing third arrr
        for (int j = 0; j < thirdarr.length; j++) {
            System.out.print(thirdarr[j] + " ");
        }
    }

    public static void main(String args[]) {
        int firstarr[] = { 1, 2, 3, 4, 5 };
        int secondarr[] = { 6, 7, 8, 9, 10 };
        merge(firstarr, secondarr);
    }

}
