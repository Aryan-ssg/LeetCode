/*
 * @lc app=leetcode id=52 lang=java
 *
 * [52] N-Queens II
 */

// @lc code=start
class Solution {
    public int totalNQueens(int n) {
        int sol=0;
        char[][] board = new char[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }
        
        return backtrack(n, 0, board, sol);

    }

    static int backtrack(int n, int row, char[][] board, int sol) {

        if (row == n) {

            sol++;

            return sol;
        }
        for (int i = 0; i < n; i++) {

            if (check(n, i, row, board)) {
                board[row][i] = 'Q';
                sol=backtrack(n, row + 1, board, sol);
                board[row][i] = '.';
            }

        }
        return sol;

    }

    static boolean check(int n, int col, int row, char[][] board) {
        for (int j = row; j >= 0; j--) {
            if (board[j][col] == 'Q') {
                return false;
            }
        }
        // check for left diagonal
        int r = row;
        int c = col;

        while (r >= 0 && c >= 0) {
            if (board[r][c] == 'Q') {
                return false;
            }
            r--;
            c--;
        }
        r = row;
        c = col;

        while (r >= 0 && c < n) {
            if (board[r][c] == 'Q') {
                return false;
            }
            r--;
            c++;
        }
        return true;

    }
}
// @lc code=end
