package problems;

/**
 * Created by Viktor on 2019-02-27
 */
public class Q231_PowerOfTwo {

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(3));
        System.out.println(isPowerOfTwo(4));
    }

    public static boolean isPowerOfTwo(int n) {
        return n > 0 && (n & n - 1) == 0;
    }

}
