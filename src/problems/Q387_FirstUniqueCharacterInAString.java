package problems;

import java.util.HashMap;
import java.util.Map;

public class Q387_FirstUniqueCharacterInAString {

    public int firstUniqChar(String s) {
        Map<Character, Integer> letterMap = new HashMap<>();
        int length = s.length();
        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            letterMap.put(c, letterMap.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < length; i++) {
            if (letterMap.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        return -1;
    }

}
