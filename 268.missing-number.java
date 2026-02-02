/*
 * @lc app=leetcode id=268 lang=java
 *
 * [268] Missing Number
 */

// @lc code=start
class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int sum1=(n*(n+1))/2;
        int sum2=0;
        for(int i:nums){
            sum2+=i;
        }
        return sum1-sum2;
        
    }
}
// @lc code=end

