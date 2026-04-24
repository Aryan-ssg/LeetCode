/*
 * @lc app=leetcode id=1901 lang=java
 *
 * [1901] Find a Peak Element II
 */

// @lc code=start
class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int row = mat.length;
        int col = mat[0].length;

        int low = 0;
        int high = col - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            int max = 0;
            for (int i = 0; i < row; i++) {
                if (mat[i][mid] > mat[max][mid]) {
                    max = i;
                }
            }
            int maxleft = (mid - 1 >= 0) ? mat[max][mid - 1] : -1;
            int maxright = (mid + 1 < col) ? mat[max][mid + 1] : -1;

            if (maxleft < mat[max][mid] && maxright < mat[max][mid]) {
                return new int[] { max, mid };

            } else if (maxleft > mat[max][mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return new int[]{-1,-1};
    }
}
// @lc code=end
