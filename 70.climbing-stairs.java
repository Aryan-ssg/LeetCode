/*
 * @lc app=leetcode id=70 lang=java
 *
 * [70] Climbing Stairs
 */

// @lc code=start
import java.util.*;

class Solution {
    public int climbStairs(int n) {
        // if(n<=2){return n;}
        int[] dp = new int[n + 1];

        // Arrays.fill(dp, -1);
        // func(n, dp);

        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<n+1;i++){
            dp[i]=dp[i-1]+dp[i-2];

        }
        return dp[n];
        // int first=1;
        // int second=2;
        // int result=0;
        // for(int i=3;i<=n;i++){
        // result=first+second;
        // first=second;
        // second=result;
        // }
        // return result;

    }

    static int func(int n, int[] dp) {
        if (n == 0 || n == 1) {
            dp[n]=1;
            return 1;
        }

        if (dp[n] != -1) {
            return dp[n];
        }

        return dp[n] = func(n - 1, dp) + func(n - 2, dp);

    }
}
// @lc code=end
