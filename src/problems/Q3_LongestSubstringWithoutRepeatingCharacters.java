package problems;

import java.util.HashSet;
import java.util.Set;

public class Q3_LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String s) {
        Set<Character> characters = new HashSet<>();
        int strLength = s.length();
        int length = 0;
        int i = 0;
        int j = 0;
        while (i < strLength && j < strLength) {
            if (!characters.contains(s.charAt(j))) {
                characters.add(s.charAt(j++));
                length = Math.max(length, j - i);
            } else {
                characters.remove(s.charAt(i++));
            }
        }

        return length;
    }

}
