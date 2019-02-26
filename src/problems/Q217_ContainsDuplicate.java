package problems;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Viktor on 2019-02-26
 */
public class Q217_ContainsDuplicate {

    public static void main(String[] args) {
        int[] array1 = new int[]{1, 2, 3, 1};
        System.out.println(containsDuplicate(array1));
        int[] array2 = new int[]{1, 2, 3, 4};
        System.out.println(containsDuplicate(array2));
    }

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> integers = new HashSet<>();
        for (int num : nums) {
            if (!integers.add(num)) {
                return true;
            }
        }

        return false;
    }

}
