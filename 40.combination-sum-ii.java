/*
 * @lc app=leetcode id=40 lang=java
 *
 * [40] Combination Sum II
 */

// @lc code=start
import java.util.*;

class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
            Arrays.sort(candidates);
            List<List<Integer>> result=new ArrayList<>();
            backtrack(0,candidates,target,0,result,new ArrayList<>());
            return result;

        
    }
    static void backtrack(int index,int[] cand,int target,int sum,List<List<Integer>> result,List<Integer> nums){
        if(sum==target){
            
            result.add(new ArrayList<>(nums));
            return;

        }
        if(sum>target || index>=cand.length){
            
            return;
        }
        for(int i=index;i<cand.length;i++){
            if(i>index && cand[i]==cand[i-1]){
                continue;
            }
            if(sum+cand[i]>target)break;
            nums.add(cand[i]);
            backtrack(i+1,cand,target,sum+cand[i],result,nums);
            nums.removeLast();
        }

        
    
    } 
}
// @lc code=end

