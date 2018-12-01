package problems;

import java.util.Arrays;

public class Q16_ThreeSumClosest {

    public static void main(String[] args) {
        int[] array = new int[]{-1, 2, 1, -4};
        System.out.println(threeSumClosest(array, 1));
    }

    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int delta = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length - 2; i++) {
            int value = target - nums[i];
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum = nums[left] + nums[right];
                if (sum > value) {
                    right--;
                } else if (sum < value) {
                    left++;
                } else {
                    return target;
                }
                if (Math.abs(delta) > Math.abs(sum - value)) {
                    delta = sum - value;
                }
            }
        }
        return delta + target;
    }
    
}