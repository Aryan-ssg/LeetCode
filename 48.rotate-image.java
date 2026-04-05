/*
 * @lc app=leetcode id=48 lang=java
 *
 * [48] Rotate Image
 */

// @lc code=start
class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        // outerRotate(matrix,n,0,0);
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n/2;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[i][n-j-1];
                matrix[i][n-j-1]=temp;
            }
        }

    }
    

    public void outerRotate(int[][] matrix, int n, int row, int col) {

        if (n <= 1) {
            return;
        }

        for (int i = 0; i < n - 1; i++) {
            int temp = matrix[row][col + i];
            matrix[row][col + i] = matrix[n - 1 - i + row][col];
            matrix[n - 1 - i + row][col] = matrix[n - 1 + row][n - 1 - i + col];
            matrix[n - 1 + row][n - 1 - i + col] = matrix[i + row][n - 1 + col];
            matrix[i + row][n - 1 + col] = temp;

        }
        outerRotate(matrix, n - 2, row + 1, col + 1);

    }
}
// @lc code=end
