/*
 * @lc app=leetcode id=238 lang=java
 *
 * [238] Product of Array Except Self
 */

// @lc code=start
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        
        int [] arr=new int[n];
        arr[0]=1;
        for(int i=1;i<n;i++){
            arr[i]=arr[i-1]*nums[i-1];
        }
        int suffix=arr[n-1];
        for(int i=n-2;i>=0;i--){
            arr[i]=arr[i]*suffix;
            suffix*=nums[i];
        }
        return arr;
        
        
    }
}
// @lc code=end

