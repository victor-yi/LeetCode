package problems;

public class IntegerToRoman {

    public static void main(String[] args) {
        System.out.println(intToRoman1(1994));
    }

    public static String intToRoman1(int num) {
        String M[] = {"", "M", "MM", "MMM"};
        String C[] = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String X[] = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String I[] = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        return M[num / 1000] + C[(num % 1000) / 100] + X[(num % 100) / 10] + I[num % 10];
    }

    public static String intToRoman(int num) {

        char[] chars = new char[]{'I', 'V', 'X', 'L', 'C', 'D', 'M'};
        StringBuilder sb = new StringBuilder();
        int quotient = num / 10;
        int remainder = num % 10;
        int level = 0;

        while (quotient > 0 || remainder > 0) {
            StringBuilder tmp = new StringBuilder();
            if (remainder == 9) {
                tmp.append(chars[level]);
                tmp.insert(0, chars[level + 2]);
            } else if (remainder > 4) {
                tmp.append(chars[level + 1]);
                for (int i = 0; i < remainder % 5; i++) {
                    tmp.insert(0, chars[level]);
                }
            } else if (remainder == 4) {
                tmp.append(chars[level]);
                tmp.insert(0, chars[level + 1]);
            } else {
                for (int i = 0; i < remainder; i++) {
                    tmp.append(chars[level]);
                }
            }

            sb.append(tmp);
            remainder = quotient % 10;
            quotient = quotient / 10;
            level += 2;
        }

        return sb.reverse().toString();
    }



}
