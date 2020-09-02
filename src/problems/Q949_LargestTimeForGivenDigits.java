package problems;

public class Q949_LargestTimeForGivenDigits {

    public String largestTimeFromDigits(int[] A) {
        String res = "";
        int sum = -1;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i != j) {
                    for (int k = 0; k < 4; k++) {
                        if (i != k && j != k) {
                            int theFourthIndex = 6 - i - j - k;
                            int hour = A[i] * 10 + A[j];
                            int minute = A[k] * 10 + A[theFourthIndex];
                            if (hour < 24 && minute < 60) {
                                sum = Math.max(sum, hour * 60 + minute);
                            }
                        }
                    }
                }
            }
        }
        if (sum != -1) {
            res = String.format("%02d:%02d", sum / 60, sum % 60);
        }
        return res;
    }

}
