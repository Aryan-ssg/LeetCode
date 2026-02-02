/*
 * @lc app=leetcode id=448 lang=java
 *
 * [448] Find All Numbers Disappeared in an Array
 */

// @lc code=start

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        List<Integer> lst=new ArrayList<>();
        int n=nums.length;
        
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                if(nums[nums[i]-1]>0){
                    nums[nums[i]-1]*=-1;
                }
                

            }
            if(nums[i]<0){
                int ind=(nums[i]*-1)-1;
                if(nums[ind]>0){
                    nums[ind]*=-1;
                }
                

            }
        }
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                lst.add(i+1);
            }
        }

        return lst;



        
    }
}
// @lc code=end

