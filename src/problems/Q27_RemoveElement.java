package problems;

public class Q27_RemoveElement {

    public static void main(String[] args) {
        int[] array = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
        System.out.println(removeElement(array, 2));
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " . ");
        }

    }

    public static int removeElement(int[] nums, int val) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index++] = nums[i];
            }
        }
        return index;
    }
}
