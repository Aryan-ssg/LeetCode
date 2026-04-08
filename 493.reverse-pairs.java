/*
 * @lc app=leetcode id=493 lang=java
 *
 * [493] Reverse Pairs
 */

// @lc code=start
class Solution {
    public int reversePairs(int[] nums) {
        int n = nums.length;
        int revpairs = 0;
        for (int i = 0; i < n; i++) {
            long numi = nums[i];
            for (int j = i + 1; j < n; j++) {
                if (numi > 2 * (long)nums[j]) {
                    revpairs++;
                }
            }
        }
        return revpairs;

    }
}
// @lc code=end
