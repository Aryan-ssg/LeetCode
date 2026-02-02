/*
 * @lc app=leetcode id=287 lang=java
 *
 * [287] Find the Duplicate Number
 */

// @lc code=start

import java.util.HashMap;

class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
            if(hm.get(nums[i])>1){
                return nums[i];
            }
        }
        return -1;
        // for(int i:hm.keySet()){
        //     if(hm.get(i)>1){
        //         return i;
        //     }
        // }
        // return -1;
        
        
    }
}
// @lc code=end

