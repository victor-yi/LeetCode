package problems;

public class Q1137_NthTribonacciNumber {

    public int tribonacci(int n) {
        int f0 = 0;
        if (n == 0) {
            return f0;
        }
        int f1 = 1;
        if (n == 1) {
            return f1;
        }
        int f2 = 1;
        if (n == 2) {
            return f2;
        }
        int sum = 0;
        for (int i = 3; i <= n; i++) {
            sum = f0 + f1 + f2;
            f0 = f1;
            f1 = f2;
            f2 = sum;
        }
        return sum;
    }

}
