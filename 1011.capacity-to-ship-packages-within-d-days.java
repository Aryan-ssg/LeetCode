/*
 * @lc app=leetcode id=1011 lang=java
 *
 * [1011] Capacity To Ship Packages Within D Days
 */

// @lc code=start
class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int n = weights.length;

       
        int low=0;
        int high=0;
        for(int i=0;i<n;i++){
            high+=weights[i];
            if(weights[i]>low){
                low=weights[i];
            }
        }
        while (low < high) {
            int mid = low + (high - low) / 2;
            int count = 0;
            int sum = 0;
            for (int i = 0; i < n; i++) {

                sum += weights[i];

                if (sum > mid) {
                    count++;
                    sum = weights[i];
                }
                if (i == n - 1 && sum <= mid) {
                    count++;
                }

            }

            if (count <= days) {
                high = mid;
            } else {
                low = mid + 1;

            }
        }

        return low;

    }
}
// @lc code=end
