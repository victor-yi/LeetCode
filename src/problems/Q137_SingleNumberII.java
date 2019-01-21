package problems;

import java.util.Arrays;

public class Q137_SingleNumberII {

    public static void main(String[] args) {
        int[] array = new int[]{1, 1, 3, 1};
        System.out.println(singleNumber(array));
    }

    public static int singleNumber(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        Arrays.sort(nums);
        int current = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (current == nums[i] && nums[i] == nums[i + 1]) {
                current = nums[i + 2];
                i += 2;
            } else {
                break;
            }
        }

        return current;
    }

}
