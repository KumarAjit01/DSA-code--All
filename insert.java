import java.util.*;

public class insert {
    public static int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int hr = 0;
        for (int i = 0; i < hours.length; i++) {
            if ((target < hours[i]) || (target == hours[i])) {
                hr++;
            }
        }

        return hr;

    }

    public static void main(String args[]) {
        int hours[] = { 5, 1, 4, 2, 2 };
        int target = 6;
        int s = numberOfEmployeesWhoMetTarget(hours, target);
        System.out.println(s);
    }
}