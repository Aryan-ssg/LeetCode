/*
 * @lc app=leetcode id=73 lang=java
 *
 * [73] Set Matrix Zeroes
 */

// @lc code=start

import java.util.ArrayList;
import java.util.List;

class Solution {
    public void setZeroes(int[][] matrix) {
        List<int[]> lst=new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    int[] arr=new int[2];
                    arr[0]=i;
                    arr[1]=j;
                    lst.add(arr);

                }
            }

        }
        for(int i=0;i<lst.size();i++){
            int [] arr=lst.get(i);
           
            for(int j=0;j<matrix.length;j++){
                matrix[j][arr[1]]=0;

            }

            for(int j=0;j<matrix[0].length;j++){
                matrix[arr[0]][j]=0;

            }
        }
        









        
    }
}
// @lc code=end

