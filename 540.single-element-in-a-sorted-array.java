/*
 * @lc app=leetcode id=540 lang=java
 *
 * [540] Single Element in a Sorted Array
 */

// @lc code=start
class Solution {
    public int singleNonDuplicate(int[] nums) {
        int low=0;
        int high=nums.length-1;
        int single=-1;
        while(low<high){
            int mid=low+(high-low)/2;
            

            if(nums[mid]==nums[mid-1]){
                int leftele=(mid-1)-low;
                int rightele=high-mid;
                if(leftele%2!=0){
                    high=mid-2;
                }
                else if(rightele%2!=0){
                    low=mid+1;
                }
            }else if(nums[mid]==nums[mid+1]){
                int leftele=mid-low;
                int rightele=high-(mid+1);
                 if(leftele%2!=0){
                    high=mid-1;
                }
                else if(rightele%2!=0){
                    low=mid+2;
                }


            }else{
                single=nums[mid];
                break;
            }

            
        }
        if(single!=-1){
            return single;
        }else{
            return nums[low];
        }
        
        
    }
}
// @lc code=end

