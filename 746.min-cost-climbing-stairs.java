/*
 * @lc app=leetcode id=746 lang=java
 *
 * [746] Min Cost Climbing Stairs
 */

// @lc code=start

import java.util.List;

class Solution {
    public int minCostClimbingStairs(int[] cost) {


        return Math.min(climb(0,cost,0),climb(1,cost,0));

    }

    static int climb(int index, int[] cost, int sum) {
        if (index >= cost.length) {
            return sum;
        }

        sum+=cost[index];

        int onestep=climb(index+1,cost,sum);
        int twosteps=climb(index+2,cost,sum);

        sum-=cost[index];

        return Math.min(onestep,twosteps);
    }
}
// @lc code=end
