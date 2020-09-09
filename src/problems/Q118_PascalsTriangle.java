package problems;

import java.util.ArrayList;
import java.util.List;

public class Q118_PascalsTriangle {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangles = new ArrayList<>();
        if (numRows == 0) {
            return triangles;
        }
        triangles.add(new ArrayList<>());
        triangles.get(0).add(1);

        for (int row = 1; row < numRows; row++) {
            List<Integer> currentRow = new ArrayList<>();
            List<Integer> previousRow = triangles.get(row - 1);
            currentRow.add(1);

            for (int position = 1; position < row; position++) {
                currentRow.add(previousRow.get(position) + previousRow.get(position - 1));
            }

            currentRow.add(1);
            triangles.add(currentRow);
        }

        return triangles;
    }

}
