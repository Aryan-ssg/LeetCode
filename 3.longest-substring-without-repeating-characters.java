/*
 * @lc app=leetcode id=3 lang=java
 *
 * [3] Longest Substring Without Repeating Characters
 */

// @lc code=start

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        int left=0;
        int right=0;
        int currlong=0;
        int n=s.length();
        while(right<n){
            if(hm.containsKey(s.charAt(right)) && hm.get(s.charAt(right))>=left){
                left=hm.get(s.charAt(right))+1;
                
                currlong=Math.max(currlong,right-left+1);

            }else{
                
                currlong=Math.max(right-left+1,currlong);

            }
            hm.put(s.charAt(right),right);
            right++;
        }
        return currlong;

    }
}
// @lc code=end
