package problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q350_IntersectionOfTwoArraysII {

    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> mapFromArray1 = new HashMap<>();
        for (int i : nums1) {
            mapFromArray1.put(i, mapFromArray1.getOrDefault(i, 0) + 1);
        }

        List<Integer> intersectionList = new ArrayList<>();
        for (int i : nums2) {
            if (mapFromArray1.containsKey(i) && mapFromArray1.get(i) > 0) {
                intersectionList.add(i);
                mapFromArray1.put(i, mapFromArray1.get(i) - 1);
            }
        }

        int[] result = new int[intersectionList.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = intersectionList.get(i);
        }
        return result;
    }

}
