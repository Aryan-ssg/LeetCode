/*
 * @lc app=leetcode id=128 lang=java
 *
 * [128] Longest Consecutive Sequence
 */

// @lc code=start

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int i :nums){
            set.add(i);
        }
        int longest=0;
        for(int i:set){
            if(!set.contains(i-1)){
                int currmax=1;
                int currnum=i;
                while(set.contains(currnum+1)){
                    currmax++;
                    currnum++;
                }
                longest=Math.max(currmax,longest);

            }
        }
        return longest;
        
        
    }
}
// @lc code=end

