package problems;

public class PalindromeNumber {

    public static void main(String[] args) {
        System.out.println(isPalindrome(12321));
    }

    public static boolean isPalindrome(int x) {
        StringBuilder sb = new StringBuilder();
        sb.append(x);
        while (sb.length() > 1) {
            if (sb.charAt(0) != sb.charAt(sb.length() - 1)) {
                return false;
            } else {
                sb.deleteCharAt(0);
                sb.deleteCharAt(sb.length() - 1);
            }
        }
        return true;
    }

}
