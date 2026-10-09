class Solution {
    public void solveSudoku(char[][] board) {
        solve(board);
    }

    private boolean solve(char[][] board) {
        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                if (board[r][c] != '.') continue;

                for (char d = '1'; d <= '9'; d++) {
                    if (isValid(board, r, c, d)) {
                        board[r][c] = d;
                        if (solve(board)) return true;
                        board[r][c] = '.';  // that digit led nowhere, undo it
                    }
                }

                // no digit fits in this cell, so an earlier choice was wrong
                return false;
            }
        }
        // no empty cell left, puzzle is solved
        return true;
    }

    private boolean isValid(char[][] board, int row, int col, char d) {
        int boxRow = (row / 3) * 3;
        int boxCol = (col / 3) * 3;

        for (int i = 0; i < 9; i++) {
            if (board[row][i] == d) return false;
            if (board[i][col] == d) return false;
            if (board[boxRow + i / 3][boxCol + i % 3] == d) return false;
        }
        return true;
    }
}