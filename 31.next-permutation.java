/*
 * @lc app=leetcode id=31 lang=java
 *
 * [31] Next Permutation
 */

// @lc code=start

import java.util.Arrays;

class Solution {
    public void nextPermutation(int[] nums) {
        boolean trig=true;
        int n = nums.length;
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                trig=false;
                for (int j = n - 1; j > i; j--) {
                    if (nums[j] > nums[i]) {
                        int temp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = temp;
                        break;
                    }

                }
                for(int j=i+1;j<(n+i+1)/2;j++){
                    int temp=nums[j];
                    nums[j]=nums[n+i-j];
                    nums[n+i-j]=temp;

                }
               
                break;

            }

        }
        if(trig){
            for(int i=0;i<n/2;i++){
                int temp=nums[i];
                nums[i]=nums[n-i-1];
                nums[n-i-1]=temp;
            }
        }

    }
}
// @lc code=end
