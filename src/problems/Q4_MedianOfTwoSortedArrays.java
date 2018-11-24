package problems;

import java.util.Arrays;

public class Q4_MedianOfTwoSortedArrays {

    public static void main(String[] args) {
        int[] num1 = new int[]{1, 3};
        int[] num2 = new int[]{2};
        System.out.println(findMedianSortedArrays(num1, num2));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int[] array = new int[nums1.length + nums2.length];
        if (nums1.length != 0) {
            System.arraycopy(nums1, 0, array, 0, nums1.length);
        }
        if (nums2.length != 0) {
            System.arraycopy(nums2, 0, array, nums1.length, nums2.length);
        }
        Arrays.sort(array);
        if (array.length % 2 == 0) {
            return (double) (array[array.length / 2 - 1] + array[array.length / 2]) / 2;
        } else {
            return (double) array[array.length / 2];
        }
    }

}
