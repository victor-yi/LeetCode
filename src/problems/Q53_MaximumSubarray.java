package problems;

public class Q53_MaximumSubarray {

    public int maxSubArray(int[] nums) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            sum = sum > 0 ? sum + num : num;
            max = Math.max(sum, max);
        }
        return max;
    }

}
