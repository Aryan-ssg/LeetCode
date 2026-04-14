/*
 * @lc app=leetcode id=875 lang=java
 *
 * [875] Koko Eating Bananas
 */

// @lc code=start
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n=piles.length;
        int max=0;
        for(int i=0;i<n;i++){
            if(piles[i]>max){
                max=piles[i];
            }
        }

        int low=1;
        int high=max;
        while(low<=high){
            int mid=low+(high-low)/2;
            long hours=0;
            for(int i=0;i<n;i++){
                hours+=Math.ceilDiv(piles[i], mid);
            }
            if(hours>h){
                low=mid+1;

            }else {
                high=mid-1;
            }
        }
        return low;
    }
}
// @lc code=end

