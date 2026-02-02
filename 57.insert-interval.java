/*
 * @lc app=leetcode id=57 lang=java
 *
 * [57] Insert Interval
 */

// @lc code=start

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {

        int [][] arr=new int[intervals.length][2]; 
        // for(int i=0;i<intervals.length;i++){
        //     for(int j=0;j<2;j++){

        //         if(intervals[i][j]>newInterval[0] && j==1){
        //             int[]


        //         }
        //     }
            

        // }
        List<int[]> lst=new ArrayList<>();
        int i=0;
        int n=intervals.length;
        while(i<n && intervals[i][1]<newInterval[0]){
            lst.add(intervals[i]);
            i++;
        }
        while(i<n && intervals[i][0]<=newInterval[1]){
            newInterval[0]=Math.min(newInterval[0],intervals[i][0]);
            newInterval[1]=Math.max(newInterval[1],intervals[i][1]);
            i++;
        }
        lst.add(newInterval);
        while(i<n){
            lst.add(intervals[i]);
            i++;

        }
        return lst.toArray(new int[lst.size()][]);

       

        
    
        







    }
}
// @lc code=end

