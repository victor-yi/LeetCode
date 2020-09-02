package problems;

import java.util.HashSet;
import java.util.Set;

public class Q36_ValidSudoku {

    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            Set<Character> rowSet = new HashSet<>();
            Set<Character> columnSet = new HashSet<>();
            Set<Character> subBoxSet = new HashSet<>();
            int topLeftRowIndex = 3 * (i / 3);
            int topLeftColumnIndex = 3 * (i % 3);
            for (int j = 0; j < 9; j++) {
                // check each row
                if (board[i][j] != '.' && !rowSet.add(board[i][j])) {
                    return false;
                }
                // check each column
                if (board[j][i] != '.' && !columnSet.add(board[j][i])) {
                    return false;
                }
                // check each sub-box
                if (board[topLeftRowIndex + j / 3][topLeftColumnIndex + j % 3] != '.'
                        && !subBoxSet.add(board[topLeftRowIndex + j / 3][topLeftColumnIndex + j % 3])) {
                    return false;
                }
            }
        }

        return true;
    }

}
