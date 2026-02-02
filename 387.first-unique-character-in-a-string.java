/*
 * @lc app=leetcode id=387 lang=java
 *
 * [387] First Unique Character in a String
 */

// @lc code=start

import java.util.HashMap;

class Solution {
    public int firstUniqChar(String s) {
        int [] arr=new int[26];
        int ind=0;
        
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-97]+=1;
        }
        for(int i=0;i<s.length();i++){
            if(arr[s.charAt(i)-97]==1){
                return i;
            }
        }
        return -1;

    }
}
// @lc code=end
