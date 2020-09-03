package problems;

public class Q38_CountAndSay {

    public String countAndSay(int n) {
        String tmp = "1";

        if (n == 1) {
            return tmp;
        }

        for (int i = 1; i < n; i++) {
            tmp = generateNextString(tmp);
        }
        return tmp;
    }

    public String generateNextString(String value) {
        StringBuilder str = new StringBuilder();
        int counter = 0;
        char c = value.charAt(0);

        for (int i = 0; i < value.length(); i++) {
            if (c == value.charAt(i)) {
                counter++;
            } else {
                str.append(counter);
                str.append(c);
                counter = 1;
                c = value.charAt(i);
            }
        }

        str.append(counter);
        str.append(c);
        return str.toString();
    }

}