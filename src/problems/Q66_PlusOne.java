package problems;

public class Q66_PlusOne {

    public int[] plusOne(int[] digits) {
        boolean ascend = false;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i] = digits[i] + 1;
                break;
            } else {
                digits[i] = 0;
                if (i == 0) {
                    ascend = true;
                }
            }
        }

        if (ascend) {
            int[] newArray = new int[digits.length + 1];
            System.arraycopy(digits, 0, newArray, 1, newArray.length - 1);
            newArray[0] = 1;
            return newArray;
        }

        return digits;
    }

}
