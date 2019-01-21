package problems;

import java.util.Arrays;

public class Q136_SingleNumber {

    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 2, 1};
        System.out.println(singleNumber(array));
    }

    public static int singleNumber(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        Arrays.sort(nums);
        int current = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == current) {
                current = nums[i + 1];
                ++i;
            } else {
                break;
            }
        }

        return current;
    }

}
