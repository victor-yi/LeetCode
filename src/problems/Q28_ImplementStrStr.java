package problems;

public class Q28_ImplementStrStr {

    public static void main(String[] args) {
        System.out.println(strStr("ABCDE", "BC"));
    }

    public static int strStr(String haystack, String needle) {
        if (needle.length() == 0) {
            return 0;
        }

        int searchLength = haystack.length() - needle.length();
        int searchIndex = 0;
        char firstSearchChar = needle.charAt(searchIndex);
        for (int i = 0; i <= searchLength; i++) {
            if (haystack.charAt(i) != firstSearchChar) {
                while (++i <= searchLength && haystack.charAt(i) != firstSearchChar) {

                }
            }

            int nextSearchPosition = i + 1;
            int currentMaxLength = nextSearchPosition + needle.length() - 1;

            if (i <= searchLength) {
                for (searchIndex = 1;
                     nextSearchPosition < currentMaxLength && haystack.charAt(nextSearchPosition) == needle.charAt(searchIndex);
                     nextSearchPosition++, searchIndex++) {
                }

                if (nextSearchPosition == currentMaxLength) {
                    return i;
                }
            }
        }

        return -1;
    }
}
