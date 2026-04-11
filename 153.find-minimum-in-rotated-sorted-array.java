/*
 * @lc app=leetcode id=153 lang=java
 *
 * [153] Find Minimum in Rotated Sorted Array
 */

// @lc code=start
class Solution {
    public int findMin(int[] nums) {
        int low=0;
        int high=nums.length-1;
        while(low<high){
            int mid=low+(high-low)/2;
            
            int m=nums[mid];
            int h=nums[high];
            if(m>h){
                low=mid+1;
            }else if(m<h){
                high=mid;
            }
        }
        return nums[low];
        
    }
}
// @lc code=end

