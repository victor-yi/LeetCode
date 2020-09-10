package problems;

public class Q461_HammingDistance {

    public int hammingDistance(int x, int y) {
        int result = 0;
        int value = x ^ y;
        while (value != 0) {
            result += value & 1;
            value >>= 1;
        }
        return result;
    }

}
