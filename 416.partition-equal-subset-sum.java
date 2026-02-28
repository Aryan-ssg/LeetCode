/*
 * @lc app=leetcode id=416 lang=java
 *
 * [416] Partition Equal Subset Sum
 */

// @lc code=start
import java.util.*;

class Solution {
    public boolean canPartition(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
        }
        if (sum % 2 != 0) {
            return false;
        }

        sum = sum / 2;
        boolean[][] dp = new boolean[n + 1][sum + 1];
        // boolean ans = func(dp, nums, n, sum);

       
        for (int i = 0; i < n + 1; i++) {
            dp[i][0] = true;
        }

        // for (int i = 0; i < n + 1; i++) {
        // for (int j = 0; j < sum + 1; j++) {
        // if (j == 0) {
        // dp[i][j] = true;
        // } else if (i == 0) {
        // dp[i][j] = false;
        // }
        // }

        // }

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < sum + 1; j++) {

                if (nums[i - 1] <= j) {
                    dp[i][j] = dp[i - 1][j - nums[i - 1]] || dp[i - 1][j];

                } else {
                    dp[i][j] = dp[i - 1][j];
                }

            }
        }

        return dp[n][sum];

    }

    static boolean func(Boolean[][] dp, int[] nums, int n, int sum) {

        if (sum == 0) {

            return true;
        }
        if (n == 0) {
            return false;
        }
        if (dp[n][sum] != null) {
            return dp[n][sum];
        }

        if (nums[n - 1] <= sum) {
            return dp[n][sum] = func(dp, nums, n - 1, sum - nums[n - 1]) || func(dp, nums, n - 1, sum);
        } else {
            return dp[n][sum] = func(dp, nums, n - 1, sum);
        }
    }
}
// @lc code=end
