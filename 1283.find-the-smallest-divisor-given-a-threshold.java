/*
 * @lc app=leetcode id=1283 lang=java
 *
 * [1283] Find the Smallest Divisor Given a Threshold
 */

// @lc code=start
class Solution {
    public int smallestDivisor(int[] nums, int threshold) {

        int n = nums.length;
        int low = 1;
        int high = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] > high) {
                high = nums[i];
            }

        }

        while (low < high) {
            int mid = low + (high - low) / 2;
            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum += Math.ceilDiv(nums[i], mid);

            }
            if (sum > threshold) {
                low = mid + 1;

            } else {
                high = mid;
            }
        }
        return low;

    }
}
// @lc code=end
