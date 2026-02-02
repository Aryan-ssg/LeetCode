/*
 * @lc app=leetcode id=498 lang=java
 *
 * [498] Diagonal Traverse
 */

// @lc code=start

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int r = mat.length;
        int c = mat[0].length;
        int[] arr=new int[r*c];

        int num = 0;
        for (int i = 0; i < r + c - 1; i++) {
            if (i % 2 == 0) {
                int row = Math.min(i, r - 1);
                int column = i - row;
                while (row >=0 && column < c) {

                    arr[num]=mat[row][column];
                    num++;
                    row--;
                    column++;
                }
            } else {
                int column = Math.min(i, c - 1);
                int row = i - column;
                while(row<r && column>=0){
                    arr[num]=mat[row][column];
                    num++;
                    row++;
                    column--;


                }

            }

        }
        return arr;

    }
}
// @lc code=end
