package problems;

import java.util.Arrays;

public class Q14_LongestCommonPrefix {

    public static void main(String[] args) {
        String[] strs = new String[]{"flower", "flow", "flight"};
        String[] strs1 = new String[]{"dog", "racecar", "car"};

        System.out.println(longestCommonPrefix(strs1));
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0 || Arrays.asList(strs).contains("")) {
            return "";
        } else if (strs.length == 1) {
            return strs[0];
        }

        boolean needLooping = true;
        int i = 0;
        int j = 0;
        StringBuilder sb = new StringBuilder();
        sb.append(strs[0].charAt(j++));

        while (needLooping) {
            for (i = 0; i < strs.length; i++) {
                if (!strs[i].startsWith(sb.toString())) {
                    needLooping = false;
                    sb.deleteCharAt(sb.length() - 1);
                    break;
                }

                if (i == strs.length - 1) {
                    i = 0;
                    if (j < strs[0].length()) {
                        sb.append(strs[0].charAt(j++));
                    } else {
                        needLooping = false;
                        break;
                    }
                }
            }
        }

        return sb.toString();
    }

}
