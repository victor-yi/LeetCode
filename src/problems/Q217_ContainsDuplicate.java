package problems;

import java.util.HashSet;
import java.util.Set;

public class Q217_ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> integers = new HashSet<>();
        for (int num : nums) {
            if (!integers.add(num)) {
                return true;
            }
        }

        return false;
    }

}
