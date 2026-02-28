/*
 * @lc app=leetcode id=739 lang=java
 *
 * [739] Daily Temperatures
 */

// @lc code=start

import java.util.*;

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n=temperatures.length;
        int[] arr=new int[n];

        Deque<int[]> stack=new ArrayDeque<>();

        for(int i=0;i<n;i++){

            while( !stack.isEmpty() && stack.peek()[0]<temperatures[i]){
                int ind=stack.pop()[1];
                arr[ind]=i-ind;


            }

            stack.push(new int[]{temperatures[i],i});
        }
        return arr;


        
    }
}
// @lc code=end

