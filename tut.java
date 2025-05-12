import java.util.*;

public class tut {
    public static int romanToInt(String s) {
        Map<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        int sum = 0;
        int prevValue = 0;

        for (int k = 0; k < s.length(); k++) {
            char roman = s.charAt(k);
            int currentValue = romanValues.get(roman);

            // If the previous value is less than the current value, it means we need to
            // subtract it twice (once from the sum and once because we previously added it)
            if (prevValue < currentValue) {
                sum += (currentValue - 2 * prevValue);
            } else {
                sum += currentValue;
            }

            prevValue = currentValue;
        }

        return sum;
    }

    public static void main(String[] args) {
        String str = "LVIII";
        System.out.println(romanToInt(str)); // Output: 58
    }
}
