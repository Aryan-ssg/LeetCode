/*
 * @lc app=leetcode id=410 lang=java
 *
 * [410] Split Array Largest Sum
 */

// @lc code=start
class Solution {
    public int splitArray(int[] nums, int k) {
        int n = nums.length;
        int low = 0;
        int high = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] > low) {
                low = nums[i];
            }
            high += nums[i];
        }
        while (low < high) {
            int mid = low + (high - low) / 2;
            int sum = 0;
            int splits=1;
            for (int i = 0; i < n; i++) {
                sum += nums[i];
                if (sum > mid) {
                    splits++;
                    sum = nums[i];
                }
                if(splits>k){
                    break;
                }

            }
            if(splits<=k){
                high=mid;
            }else{
                low=mid+1;
            }

        }
        return low;

    }
}
// @lc code=end
