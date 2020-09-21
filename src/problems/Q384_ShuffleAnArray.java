package problems;

import java.util.Random;

public class Q384_ShuffleAnArray {

    int[] original;
    Random random;

    public Q384_ShuffleAnArray(int[] nums) {
        original = nums;
        random = new Random();
    }

    public int[] reset() {
        return original;
    }

    public int[] shuffle() {
        if (original == null) {
            return null;
        }
        int[] tmp = original.clone();
        for (int i = 1; i < tmp.length; i++) {
            int index = random.nextInt(i + 1);
            swap(tmp, i, index);
        }

        return tmp;
    }

    private void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

}
