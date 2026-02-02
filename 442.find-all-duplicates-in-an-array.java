/*
 * @lc app=leetcode id=442 lang=java
 *
 * [442] Find All Duplicates in an Array
 */

// @lc code=start

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        
        List<Integer> lst = new ArrayList<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int ind=Math.abs(nums[i])-1;
            if(nums[ind]<0){
                lst.add(ind+1);
            }
            else{
                nums[ind]=-nums[ind];
            }
        }

        return lst;

    }
}
// @lc code=end
