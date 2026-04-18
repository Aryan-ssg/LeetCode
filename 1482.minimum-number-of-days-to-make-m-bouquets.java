/*
 * @lc app=leetcode id=1482 lang=java
 *
 * [1482] Minimum Number of Days to Make m Bouquets
 */

// @lc code=start
class Solution {
    public int revision(int[] bloomDay,int m,int k){
       
        int n=bloomDay.length;

        if(((long)m*(long)k)>n){
            return -1;
        }
        int low=Integer.MAX_VALUE;
        int high=0;
        for(int i=0;i<n;i++){
            if(bloomDay[i]>high){
                high=bloomDay[i];
            }
            if(bloomDay[i]<low){
                low=bloomDay[i];
            }
        }

        while(low<high){
            int mid=low+(high-low)/2;

            int bouque=0;
            int adj=0;
            for(int i=0;i<n;i++){
                if(bloomDay[i]<=mid){
                    adj++;
                    if(adj==k){
                        bouque++;
                        adj=0;
                    }

                }else{
                    adj=0;
                }
            }
            if(bouque>=m){
                high=mid;

            }else{
                low=mid+1;
            }

        }
        return low;

    }
    public int minDays(int[] bloomDay, int m, int k) {


        return revision(bloomDay,m,k);

        // int n = bloomDay.length;
        // int max = 0;
        // int min = Integer.MAX_VALUE;
        // if(((long)m*(long)k)>n){
        //     return -1;
        // }
        // for (int i = 0; i < n; i++) {
        //     if (bloomDay[i] > max) {
        //         max = bloomDay[i];
        //     } else if (bloomDay[i] < min) {
        //         min = bloomDay[i];
        //     }
        // }

        // int low = min;
        // int high = max;
        // while(low<=high){
        //     int mid=low+(high-low)/2;
            
        //     int alt=0;
        //     int Bouque=0;
        //     for(int i=0;i<n;i++){
        //         if(bloomDay[i]<=mid){
        //             alt++;
        //             if(alt==k){
        //                 Bouque++;
        //                 alt=0;
        //             }

        //         }else{
        //             alt=0;
        //         }
        //     }

        //     if(Bouque>=m){
        //         high=mid-1;
        //     }else{
        //         low=mid+1;
        //     }
        // }
        // return low;
    }
}
// @lc code=end
