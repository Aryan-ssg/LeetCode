/*
 * @lc app=leetcode id=283 lang=java
 *
 * [283] Move Zeroes
 */

// @lc code=start

import java.util.ArrayList;

class Solution {
    public void moveZeroes(int[] nums) {

        int n = nums.length;
        int ind = n - 1;
        for (int i = n - 1; i >= 0; i--) {
            if (nums[i] != 0) {
                nums[ind--] = nums[i];
            }

        }
        for (int i = 0; i <= ind; i++) {
            nums[i] = 0;
        }

    }
}
// @lc code=end
