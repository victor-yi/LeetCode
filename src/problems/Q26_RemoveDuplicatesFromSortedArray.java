package problems;

public class Q26_RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {
        int[] array = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int count = removeDuplicates(array);
        System.out.println(count);
        for (int i = 0; i < count; i++) {
            System.out.println(array[i]);
        }

    }

    public static int removeDuplicates(int[] nums) {
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
