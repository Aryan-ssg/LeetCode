/*
 * @lc app=leetcode id=11 lang=java
 *
 * [11] Container With Most Water
 */

// @lc code=start
class Solution {
    public int maxArea(int[] height) {

        int n=height.length;
        
        int max=0;
        int left=0;
        int right=n-1;
        while(left<right){
            int length=right-left;
            int breadth=Math.min(height[left],height[right]);
            max=Math.max(length*breadth,max);
            if(height[left]>=height[right]){
                right--;
            }
            else{
                left++;
            }
        }
        return max;
        
    }
}
// @lc code=end

