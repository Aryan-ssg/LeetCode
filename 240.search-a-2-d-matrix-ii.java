/*
 * @lc app=leetcode id=240 lang=java
 *
 * [240] Search a 2D Matrix II
 */

// @lc code=start
import java.util.*;

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int r = 0;
        int c = matrix[0].length-1;

       
        while(r<matrix.length && c>=0){
            if(matrix[r][c]==target){
                return true;
            }else if(matrix[r][c]>target){
                c--;
            }else{
                r++;
            }
        }
        return false;
    }
}
// @lc code=end
