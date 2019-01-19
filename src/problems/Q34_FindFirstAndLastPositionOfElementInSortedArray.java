package problems;

public class Q34_FindFirstAndLastPositionOfElementInSortedArray {

    public static void main(String[] args) {
        int[] array = new int[]{5, 7, 7, 8, 8, 10};
        array = searchRange(array, 8);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] position = new int[]{-1, -1};
        if (nums.length == 0 || target < nums[0] || target > nums[nums.length - 1]) {
            return position;
        }

        int left = 0;
        int right = nums.length - 1;
        while (nums[left] < target) {
            left++;
        }
        while (nums[right] > target) {
            right--;
        }
        if (left <= right && nums[left] == target && nums[right] == target) {
            position[0] = left;
            position[1] = right;
        }

        return position;
    }

}
