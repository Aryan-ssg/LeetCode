/*
 * @lc app=leetcode id=560 lang=java
 *
 * [560] Subarray Sum Equals K
 */

// @lc code=start

import java.util.HashMap;

class Solution {
    public int subarraySum(int[] nums, int k) {
        int total = 0;
        int n = nums.length;
        HashMap<Integer,Integer> hm=new HashMap<>();
        hm.put(0,1);
        int prefixsum=0;
        for(int i=0;i<n;i++){
            prefixsum+=nums[i];
            if(hm.containsKey(prefixsum-k)){
                total+=hm.get(prefixsum-k);
            }
            hm.put(prefixsum,hm.getOrDefault(prefixsum,0)+1);
            

        }

        
        
        return total;

    }
}
// @lc code=end
