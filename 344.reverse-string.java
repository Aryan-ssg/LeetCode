/*
 * @lc app=leetcode id=344 lang=java
 *
 * [344] Reverse String
 */

// @lc code=start
class Solution {
    public void reverseString(char[] s) {
        char c;
        for(int i=0;i<s.length/2;i++){
            c=s[i];
            s[i]=s[s.length-i-1];
            s[s.length-i-1]=c;

        }
        
    }
}
// @lc code=end

