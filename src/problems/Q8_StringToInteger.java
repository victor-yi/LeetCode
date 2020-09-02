package problems;

public class Q8_StringToInteger {

    public int myAtoi(String str) {
        boolean isNegative = false;
        int index = 0;
        int number = 0;
        str = str.trim();
        if (str.isEmpty()) {
            return 0;
        } else if (str.charAt(index) == '-') {
            isNegative = true;
            index++;
        } else if (str.charAt(index) == '+') {
            index++;
        }
        while (index < str.length() && Character.isDigit(str.charAt(index))) {
            int n = str.charAt(index) - '0';
            if (number > (Integer.MAX_VALUE - n) / 10) {
                return isNegative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
            number = 10 * number + n;
            index++;
        }

        return isNegative ? -number : number;
    }
}
