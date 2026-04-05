/*
 * @lc app=leetcode id=18 lang=java
 *
 * [18] 4Sum
 */

import java.util.*;
// @lc code=start
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n=nums.length;
        Arrays.sort(nums);
        List<List<Integer>> list=new ArrayList<>();
        
        for(int i=0;i<n;i++){
            if(i>=1 && nums[i-1]==nums[i]){
                continue;
            }
            for(int j=i+1;j<n;j++){

                if(j-1!=i && nums[j-1]==nums[j]){
                    continue;
                }
                int left=j+1;
                int right=n-1;
                while(left<right){
                    long sum=(long)nums[i]+(long)nums[j]+(long)nums[left]+(long)nums[right];
                    if(sum<target){
                        left++;
                    }else if(sum>target){
                        right--;
                    }else{
                        list.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));
                        while(left<right && nums[left]==nums[left+1]){
                            left++;
                        }
                        while(left<right && nums[right]==nums[right-1]){
                            right--;
                        }
                        left++;
                        right--;
                    }
                }



            }
        }
        return list;
        
    }
}
// @lc code=end

