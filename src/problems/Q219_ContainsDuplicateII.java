package problems;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Viktor on 2019-02-26
 */
public class Q219_ContainsDuplicateII {

    public static void main(String[] args) {
        int[] array1 = new int[]{1, 2, 3, 1};
        System.out.println(containsNearbyDuplicate(array1, 3));
        int[] array2 = new int[]{1, 2, 3, 1, 2, 3};
        System.out.println(containsNearbyDuplicate(array2, 2));
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> integers = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (i > k) {
                integers.remove(nums[i - k - 1]);
            }
            if (!integers.add(nums[i])) {
                return true;
            }
        }

        return false;
    }

}
