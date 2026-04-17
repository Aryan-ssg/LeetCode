/*
 * @lc app=leetcode id=74 lang=java
 *
 * [74] Search a 2D Matrix
 */

// @lc code=start
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r=matrix.length;
        int c=matrix[0].length;

        if(target<matrix[0][0] || target>matrix[r-1][c-1]){
            return false;

        }
        int low=0;
        int high=r-1;
        while(low<=high){
            int mid=low+(high-low)/2;

            if(matrix[mid][0]>target){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }

        int row=high;
        low=0;
        high=c-1;
        while(low<=high){
            int mid=low+(high-low)/2;

            if(matrix[row][mid]==target){
                return true;
            }else if(matrix[row][mid]<target){
                low=mid+1;

            }else{
                high=mid-1;
            }

        }
        return false;

        
    }
}
// @lc code=end

