package problems;

public class Q58_LengthOfLastWord {

    public static void main(String[] args) {
        String str = "Hello World  a  ";
        System.out.println(lengthOfLastWord(str));
    }

    public static int lengthOfLastWord(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        int length = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                if (length == 0) {
                    continue;
                } else {
                    break;
                }
            } else {
                length++;
            }
        }
        return length;
    }

}
