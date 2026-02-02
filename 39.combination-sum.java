/*
 * @lc app=leetcode id=39 lang=java
 *
 * [39] Combination Sum
 */

// @lc code=start

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result=new ArrayList<>();
        comb(0,candidates,target,result,new ArrayList<>());
        return result;
        
    }
    static void comb(int index,int[] candidates,int target,List<List<Integer>> result,List<Integer> nums){
        if(target==0){
            result.add(new ArrayList<>(nums));
            return;
        }
        if(target<0){
            
            return;
        }
        for(int i=0;i<candidates.length;i++){
            
            nums.add(candidates[i]);
            comb(i,candidates,target-candidates[i],result,nums);
           
            nums.removeLast();

        }
        
    }
}
// @lc code=end

