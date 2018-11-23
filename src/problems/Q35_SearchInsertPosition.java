package problems;

public class Q35_SearchInsertPosition {

    public static void main(String[] args) {
        int[] array = new int[]{1,3,5,6};
        System.out.println(searchInsert(array, 0));
    }

    public static int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            } else if (nums[i] < target) {
                if (i == nums.length - 1) {
                    return nums.length;
                } else if (nums[i + 1] > target) {
                    return i + 1;
                }

            }
        }
        return 0;
    }
}
