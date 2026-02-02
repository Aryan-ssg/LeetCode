/*
 * @lc app=leetcode id=90 lang=java
 *
 * [90] Subsets II
 */

// @lc code=start

import java.util.*;
import java.util.List;

class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        subsets(nums, 0, new ArrayList<>(), result);
        return result;

    }

    static void subsets(int[] nums, int index, List<Integer> set, List<List<Integer>> result) {
        if (index >= nums.length) {
            result.add(new ArrayList<>(set));
            return;
        }
        set.add(nums[index]);
        subsets(nums, index + 1, set, result);
        set.removeLast();

        int next=index+1;
        while(next<nums.length && nums[index]==nums[next]){
            next++;

        }
        subsets(nums, next, set, result);

        
        return;
    }
}
// @lc code=end
