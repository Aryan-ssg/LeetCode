/*
 * @lc app=leetcode id=51 lang=java
 *
 * [51] N-Queens
 */

// @lc code=start
import java.util.*;

class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result=new ArrayList<>();
        char[][] board = new char[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }
        backtrack(n,0,board,result);
        return result;

    }

    static void backtrack(int n, int row, char[][] board,List<List<String>> result) {

        if(row==n){
            
            List<String> temp=new ArrayList<>();
            for(int i=0;i<n;i++){
                StringBuilder s=new StringBuilder();
               
                for(int j=0;j<n;j++){
                    s.append(board[i][j]);
                }
                temp.add(s.toString());

            }
            result.add(temp);
            
            return;
        }
        for (int i = 0; i < n; i++) {

            if (check(n, i, row, board)) {
                board[row][i]='Q';
                backtrack(n,row+1,board,result);
                board[row][i]='.';
            }
        }

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













