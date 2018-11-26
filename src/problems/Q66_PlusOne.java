package problems;

public class Q66_PlusOne {

    public static void main(String[] args) {
        int[] a1 = new int[]{9, 9};
        int[] a2 = new int[]{1, 2, 3};
        int[] result = plusOne(a1);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    public static int[] plusOne(int[] digits) {
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
