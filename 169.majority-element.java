/*
 * @lc app=leetcode id=169 lang=java
 *
 * [169] Majority Element
 */

// @lc code=start
class Solution {
    public int majorityElement(int[] nums) {
        int currmax = nums[0];
        int count = 0;
        for (int i = 0; i < nums.length; i++) {

            if(currmax==nums[i]){
                count++;
            }else{
                count--;
            }
            if(count==0){
                currmax=nums[i];
                count++;
            }
        }
        return currmax;

    }
}
// @lc code=end
