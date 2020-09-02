package problems;

public class Q242_ValidAnagram {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] character = new int[26];
        int length = s.length();
        for (int i = 0; i < length; i++) {
            character[s.charAt(i) - 'a']++;
            character[t.charAt(i) - 'a']--;
        }
        for (int i : character) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }

}
