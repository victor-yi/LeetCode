package problems;

public class Q509_FibonacciNumber {

    public int fib(int N) {
        int f0 = 0;
        if (N == 0) {
            return f0;
        }
        int f1 = 1;
        if (N == 1) {
            return f1;
        }
        int sum = 0;
        for (int i = 2; i <= N; i++) {
            sum = f0 + f1;
            f0 = f1;
            f1 = sum;
        }
        return sum;
    }

}
