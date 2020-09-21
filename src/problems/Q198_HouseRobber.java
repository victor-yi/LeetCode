package problems;

public class Q198_HouseRobber {

    public int rob(int[] nums) {
        int robbedLastOne = 0;
        int notRobbedLastOne = 0;
        for (int num : nums) {
            int tmp = notRobbedLastOne;
            notRobbedLastOne = Math.max(notRobbedLastOne, robbedLastOne);
            robbedLastOne = num + tmp;
        }

        return Math.max(notRobbedLastOne, robbedLastOne);
    }

}
