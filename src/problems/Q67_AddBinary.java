package problems;

public class Q67_AddBinary {

    public static void main(String[] args) {
        System.out.println(addBinary("11", "1"));
        System.out.println(addBinary("100", "110010"));
    }

    public static String addBinary(String a, String b) {
        if (a.length() < b.length()) {
            String tmp = a;
            a = b;
            b = tmp;
        }

        int carry = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < b.length(); i++) {
            int charA = a.charAt(a.length() - 1 - i) - '0';
            int charB = b.charAt(b.length() - 1 - i) - '0';
            int sum = charA + charB + carry;
            carry = calculate(sb, sum);
        }

        for (int i = 0; i < a.length() - b.length(); i++) {
            int c = a.charAt(a.length() - b.length() - 1 - i) - '0';
            int sum = c + carry;
            carry = calculate(sb, sum);
        }

        if (carry == 1) {
            sb.append(1);
        }

        return sb.reverse().toString();
    }

    private static int calculate(StringBuilder sb, int sum) {
        int carry;
        if (sum > 2) {
            carry = 1;
            sb.append(1);
        } else if (sum == 2) {
            carry = 1;
            sb.append(0);
        } else {
            carry = 0;
            sb.append(sum);
        }
        return carry;
    }

}
