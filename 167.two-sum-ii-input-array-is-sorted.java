/*
 * @lc app=leetcode id=167 lang=java
 *
 * [167] Two Sum II - Input Array Is Sorted
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int [] ans=new int[2];

        
        int l=0;
        int r=numbers.length-1;
        int num;
        while(l<r){
            num=numbers[l]+numbers[r];
            if(num>target){
                r--;
            }else if(num<target){
                l++;
            }else{
                ans[0]=l+1;
                ans[1]=r+1;
                break;
            }
        }
        return ans;
        
    }
}
// @lc code=end

