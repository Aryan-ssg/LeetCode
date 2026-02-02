/*
 * @lc app=leetcode id=78 lang=java
 *
 * [78] Subsets
 */

// @lc code=start

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        SubSets(0,ans,nums,new ArrayList<>());
        return ans;
        
    }
    static void SubSets(int index,List<List<Integer>> ans,int[] nums,ArrayList<Integer> lst){
       if(index>=nums.length){
            ans.add(new ArrayList<>(lst));
            return;
       }


       
       lst.add(nums[index]);
       SubSets(index+1,ans,nums,lst);
       lst.removeLast();
       SubSets(index+1,ans,nums,lst);

        
    }
}
// @lc code=end

