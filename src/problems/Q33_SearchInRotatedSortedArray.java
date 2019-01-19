package problems;

public class Q33_SearchInRotatedSortedArray {

    public static void main(String[] args) {
        int[] array = new int[]{1};
        System.out.println(search(array, 1));
    }

    public static int search(int[] nums, int target) {
        if (nums.length == 0) {
            return -1;
        }

        if (target >= nums[0]) {
            int left = 0;
            while (target > nums[left] && left < nums.length - 1) {
                left++;
            }
            if (target == nums[left]) {
                return left;
            }
        }

        if (target < nums[0] && target <= nums[nums.length - 1]) {
            int right = nums.length - 1;
            while (target < nums[right] && right > 0) {
                right--;
            }
            if (target == nums[right]) {
                return right;
            }
        }

        return -1;
    }

}
