package problems;

/**
 * Created by Viktor on 2019-03-01
 */
public class Q242_ValidAnagram {

    public static void main(String[] args) {
        System.out.println(isAnagram("abc", "acb"));
        System.out.println(isAnagram("abde", "abe"));
        System.out.println(isAnagram("abb", "bab"));
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] character = new int[26];
        for (char c : s.toCharArray()) {
            character[c - 'a']++;
        }
        for (char c : t.toCharArray()) {
            character[c - 'a']--;
        }
        for (int i : character) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }

}
