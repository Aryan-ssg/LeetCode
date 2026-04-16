/*
 * @lc app=leetcode id=1539 lang=java
 *
 * [1539] Kth Missing Positive Number
 */

// @lc code=start
class Solution {
    public int findKthPositive(int[] arr, int k) {
        // int n=arr.length;
        // int num=1;
        // int count=k;
        // int i=0;
        // int ans=0;
        // while(i<n){
        //     if(arr[i]==num){
        //         i++;
        //         num++;

        //     }else{
        //         count--;
        //         if(count==0){
        //             ans=num;
        //             break;
        //         }
        //         num++;
        //     }
            
        // }
        // if(count!=0){
        //     ans=arr[n-1]+count;
        // }
        // return ans;
        int n=arr.length;
        int low=0;
        int high=n-1;
        int miss=0;
        int mid=0;
        while(low<=high){
            mid=low+(high-low)/2;
            miss=arr[mid]-(mid+1);

            if(miss<k){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return k+high+1;



        
    }
}
// @lc code=end

