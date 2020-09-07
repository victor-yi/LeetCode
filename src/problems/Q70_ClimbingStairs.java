package problems;

public class Q70_ClimbingStairs {

    public int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }

        int counter = 0;
        int twoStepBack = 1;
        int oneStepBack = 2;
        for (int i = 3; i <= n; i++) {
            counter = twoStepBack + oneStepBack;
            twoStepBack = oneStepBack;
            oneStepBack = counter;
        }

        return counter;
    }

}
