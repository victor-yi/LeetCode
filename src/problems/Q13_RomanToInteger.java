package problems;

import java.util.HashMap;
import java.util.Map;

public class Q13_RomanToInteger {

    public int romanToInt(String s) {
        Map<Character, Integer> definition = new HashMap<>();
        definition.put('I', 1);
        definition.put('V', 5);
        definition.put('X', 10);
        definition.put('L', 50);
        definition.put('C', 100);
        definition.put('D', 500);
        definition.put('M', 1000);

        s = new StringBuilder(s).reverse().toString();
        int sum = 0;
        int previous = -1;
        for (int i = 0; i < s.length(); i++) {
            int current = definition.get(s.charAt(i));
            if (current < previous) {
                sum -= current;
            } else {
                sum += current;
            }
            previous = current;
        }

        return sum;
    }

}
