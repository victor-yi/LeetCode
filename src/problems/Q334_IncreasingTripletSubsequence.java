package problems;

public class Q334_IncreasingTripletSubsequence {

    public boolean increasingTriplet(int[] nums) {
        if (nums.length < 3) {
            return false;
        }

        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num <= min) {
                min = num;
            } else if (num <= secondMin) {
                secondMin = num;
            } else {
                return true;
            }
        }
        return false;
    }

}
