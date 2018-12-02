package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q18_FourSum {

    public static void main(String[] args) {
        int[] array = new int[]{-1,0,0,1,2,3};
        System.out.println(fourSum(array, 0));
    }

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> lists = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 3; i++) {
            if (i == 0 || nums[i] != nums[i - 1]) {
                for (int j = i + 1; j < nums.length - 2; j++) {
                    if (j == i + 1 || nums[j] != nums[j - 1]) {
                        int left = j + 1;
                        int right = nums.length - 1;
                        int value = nums[i] + nums[j];
                        int delta = target - value;
                        while (left < right) {
                            if (delta > nums[left] + nums[right]) {
                                left++;
                            } else if (delta < nums[left] + nums[right]) {
                                right--;
                            } else {
                                lists.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                                while (left < right && nums[left] == nums[left + 1]) {
                                    left++;
                                }
                                while (left < right && nums[right] == nums[right - 1]) {
                                    right--;
                                }
                                left++;
                                right--;
                            }
                        }
                    }
                }
            }
        }
        return lists;
    }

}
