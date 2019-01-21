package problems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Q260_SingleNumberIII {

    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 2, 3};
        System.out.println(Arrays.toString(singleNumber(array)));
    }

    public static int[] singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) {
                set.remove(num);
            }
        }

        return set.stream().mapToInt(Integer::intValue).toArray();
    }
}
