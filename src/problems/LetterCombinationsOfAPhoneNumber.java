package problems;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationsOfAPhoneNumber {

    public static char[][] chars;

    static {
        chars = new char[][] {
                {'a', 'b', 'c'},
                {'d', 'e', 'f'},
                {'g', 'h', 'i'},
                {'j', 'k', 'l'},
                {'m', 'n', 'o'},
                {'p', 'q', 'r', 's'},
                {'t', 'u', 'v'},
                {'w', 'x', 'y', 'z'}
        };
    }

    public static void main(String[] args) {
        System.out.println(letterCombinations("234"));
    }

    public static List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<>();

        if ("".equals(digits) || digits == null) {
            return list;
        }

        StringBuilder sb = new StringBuilder();
        recursion(sb, digits, 0, list);

        return list;
    }

    public static void recursion(StringBuilder sb, String digits, int count, List<String> list) {
        if (count == digits.length()) {
            list.add(sb.toString());
            return;
        }

        int indexOne = digits.charAt(count) - '2';
        int indexTwo = 0;

        while (indexTwo < chars[indexOne].length) {
            sb.append(chars[indexOne][indexTwo]);
            recursion(sb, digits, count + 1, list);
            indexTwo++;
            sb.delete(sb.length() - 1, sb.length());
        }

    }

}
