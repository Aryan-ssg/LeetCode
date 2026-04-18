/*
 * @lc app=leetcode id=162 lang=java
 *
 * [162] Find Peak Element
 */

// @lc code=start
class Solution {
    public int bruteForce(int[] nums) {
        int index = 0;
        int n = nums.length;
        if (n == 1) {
            return 0;
        }
        for (int i = 0; i < n; i++) {
            if (i == 0 && nums[i] > nums[i + 1]) {

                index = 0;
                break;

            }
            if (i == n - 1 && nums[i] > nums[i - 1]) {

                index = n - 1;
                break;

            }
            if (nums[i] > nums[i + 1] && nums[i] > nums[i - 1]) {
                index = i;
                break;
            }

        }
        return index;

    }

    public int optimized(int[] nums) {
        int n = nums.length;
        int low = 0;
        int high = n - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] < nums[mid + 1]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;

    }

    public int revision(int[] nums) {
         int n = nums.length;
        int low = 0;
        int high = n - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] < nums[mid + 1]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return high;
    }

    public int findPeakElement(int[] nums) {
       
        // return bruteForce(nums);
        // return optimized(nums);
        return revision(nums);
        

    }
}
// @lc code=end
