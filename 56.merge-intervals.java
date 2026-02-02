/*
 * @lc app=leetcode id=56 lang=java
 *
 * [56] Merge Intervals
 */

// @lc code=start
import java.util.*;
class Solution {
    public int[][] merge(int[][] intervals) {
        List<int []> result=new ArrayList<>(); 

        Arrays.sort(intervals,Comparator.comparingInt(a -> a[0]));
        int low=intervals[0][0];
        int high=intervals[0][1];

        for(int i=1;i<intervals.length;i++){

            if(high>=intervals[i][0] ){
                high=Math.max(intervals[i][1],high);

            }
            else{
                
                result.add(new int[]{low,high});

                low=intervals[i][0];
                high=intervals[i][1];

            }

        }

        result.add(new int[]{low,high});

        return result.toArray(new int[0][]);
        
    }
}
// @lc code=end

