/*
 * @lc app=leetcode id=2260 lang=java
 *
 * [2260] Minimum Consecutive Cards to Pick Up
 */

// @lc code=start

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int minimumCardPickup(int[] cards) {
        Map<Integer,Integer> hm=new HashMap<>();
        int currmin=Integer.MAX_VALUE;
        for(int i=0;i<cards.length;i++){
            if(hm.containsKey(cards[i])){
                currmin=Math.min(i-hm.get(cards[i])+1,currmin);
                hm.put(cards[i],i);
            }else{
                hm.put(cards[i],i);
            }
        }
        if(currmin==Integer.MAX_VALUE){
            return -1;
        }else{
            return currmin;
        }
        
        
    }
}
// @lc code=end

