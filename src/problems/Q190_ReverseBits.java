package problems;

public class Q190_ReverseBits {

    public int reverseBits(int n) {
        int result = 0;
        int power = 31;
        while (n != 0) {
            result += (n & 1) << power--;
            n >>>= 1;
        }
        return result;
    }

}
