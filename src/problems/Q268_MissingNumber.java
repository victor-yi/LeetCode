package problems;

public class Q268_MissingNumber {

    public int missingNumber(int[] nums) {
        int expectedValue = nums.length * (nums.length + 1) / 2;
        int actualValue = 0;
        for (int num : nums) {
            actualValue += num;
        }
        return  expectedValue - actualValue;
    }

}
