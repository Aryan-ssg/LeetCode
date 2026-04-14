/*
 * @lc app=leetcode id=1482 lang=java
 *
 * [1482] Minimum Number of Days to Make m Bouquets
 */

// @lc code=start
class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        int max = 0;
        int min = Integer.MAX_VALUE;
        if(((long)m*(long)k)>n){
            return -1;
        }
        for (int i = 0; i < n; i++) {
            if (bloomDay[i] > max) {
                max = bloomDay[i];
            } else if (bloomDay[i] < min) {
                min = bloomDay[i];
            }
        }

        int low = min;
        int high = max;
        while(low<=high){
            int mid=low+(high-low)/2;
            
            int alt=0;
            int Bouque=0;
            for(int i=0;i<n;i++){
                if(bloomDay[i]<=mid){
                    alt++;
                    if(alt==k){
                        Bouque++;
                        alt=0;
                    }

                }else{
                    alt=0;
                }
            }

            if(Bouque>=m){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
}
// @lc code=end
