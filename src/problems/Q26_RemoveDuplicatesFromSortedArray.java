package problems;

public class Q26_RemoveDuplicatesFromSortedArray {

    public int removeDuplicates(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i - 1] == nums[i]) {
                continue;
            }

            nums[count++] = nums[i];
        }
        return count;
    }

}
