package problems;

import java.util.ArrayList;
import java.util.List;

public class Q6_ZigZagConversion {

    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }

        List<StringBuilder> builders = new ArrayList<>(numRows);
        for (int i = 0; i < numRows; i++) {
            builders.add(new StringBuilder());
        }

        boolean down = false;
        int rowCount = 0;
        for (char c : s.toCharArray()) {
            builders.get(rowCount).append(c);
            if (rowCount == 0 || rowCount == numRows - 1) {
                down = !down;
            }
            rowCount += down ? 1 : -1;
        }

        StringBuilder resultBuilder = new StringBuilder();
        builders.forEach(resultBuilder::append);
        return resultBuilder.toString();
    }
}
