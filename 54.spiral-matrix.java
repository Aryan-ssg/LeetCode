/*
 * @lc app=leetcode id=54 lang=java
 *
 * [54] Spiral Matrix
 */

// @lc code=start

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> lst = new ArrayList<>();
        int r = matrix.length;
        int c = matrix[0].length;
        int top = 0;
        int bottom = r - 1;
        int left = 0;
        int right = c - 1;

        while (left <= right && top <= bottom) {

            for (int i = left; i <= right; i++) {
                lst.add(matrix[top][i]);
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                lst.add(matrix[i][right]);
            }
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    lst.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    lst.add(matrix[i][left]);
                }
                left++;
            }

        }
        return lst;

    }
}
// @lc code=end
