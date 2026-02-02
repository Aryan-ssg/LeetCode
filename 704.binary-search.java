/*
 * @lc app=leetcode id=704 lang=java
 *
 * [704] Binary Search
 */

// @lc code=start
class Solution {
    public int search(int[] nums, int target) {
        int l =0;
        int r=nums.length-1;
        while(l<=r){
            int check=l+((r-l)/2);
            if(target>nums[check]){
                l=check+1;
            }
            else if( target<nums[check]){
                r=check-1;
            }
            else{
                return check;
            }
        }
        return -1;
        
    
    
    
    
    
    }
}
// @lc code=end

