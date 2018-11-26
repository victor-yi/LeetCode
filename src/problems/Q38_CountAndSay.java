package problems;

public class Q38_CountAndSay {
    public static void main(String[] args) {
        System.out.println(countAndSay(7));
    }

    public static String countAndSay(int n) {
        String tmp = "1";

        if (n == 1) {
            return tmp;
        }
        
        for (int i = 1; i < n; i++) {
            tmp = generateNextString(tmp);
        }
        return tmp;
    }

    public static String generateNextString(String value) {
        StringBuilder str = new StringBuilder(value);
        StringBuilder sb = new StringBuilder();
        int counter = 0;
        char c = str.charAt(0);

        while (str.length() != 0) {
            if (c == str.charAt(0)) {
                counter++;
            } else {
                sb.append(counter);
                sb.append(c);
                c = str.charAt(0);
                counter = 1;
            }
            str.deleteCharAt(0);
        }

        sb.append(counter);
        sb.append(c);

        return sb.toString();
    }

}