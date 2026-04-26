/*
 * @lc app=leetcode id=796 lang=java
 *
 * [796] Rotate String
 */

// @lc code=start
class Solution {
    public boolean rotateString(String s, String goal) {
        // char[] arr=s.toCharArray();
        int n=s.length();
        if(s.length()!=goal.length()){
            return false;
        }
        s+=s;
        if(s.contains(goal)){
            return true;
        }else{
            return false;
        }
        

    }

   
}
// @lc code=end
