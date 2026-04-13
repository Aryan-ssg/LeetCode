/*
 * @lc app=leetcode id=162 lang=java
 *
 * [162] Find Peak Element
 */

// @lc code=start
class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        //BRUTE FORCE
        // int index = 0;
        // if (n == 1) {
        // return 0;
        // }
        // for (int i = 0; i < n; i++) {
        // if (i == 0 && nums[i] > nums[i + 1]) {

        // index=0;
        // break;

        // }
        // if (i == n - 1 && nums[i] > nums[i - 1]) {

        // index=n-1;
        // break;

        // }
        // if(nums[i]>nums[i+1] && nums[i]>nums[i-1]){
        // index=i;
        // break;
        // }

        // }
        // return index;
        // int index = 0;
        // int low = 0;
        // int high = n - 1;
        // if (n == 1) {
        //     return 0;
        // }
        // if (n == 2) {
        //     if (nums[0] > nums[1]) {
        //         return 0;
        //     } else {
        //         return 1;
        //     }
        // }
        // while (low < high) {
        //     int mid = low + (high - low) / 2;
        //     if((high-low)==1){
        //         if(nums[low]>nums[high]){
        //             index=low;
        //             break;
        //         }else{
        //             index=high;
        //             break;
        //         }
        //     }
        //     if (nums[mid] > nums[mid + 1] && nums[mid] > nums[mid - 1]) {
        //         index = mid;
        //         break;

        //     } else if (nums[mid] < nums[mid + 1]) {
        //         low = mid + 1;
        //     } else {
        //         high = mid - 1;
        //     }
        // }
        // if (high == low) {
        //     return low;
        // } else {
        //     return index;
        // }

        int low=0;
        int high=n-1;
        while(low<high){
            int mid=low+(high-low)/2;

            if(nums[mid]<nums[mid+1]){
                low=mid+1;
            }else{
                high=mid;
            }
        }
        return low;
        

    }
}
// @lc code=end
