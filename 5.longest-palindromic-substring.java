/*
 * @lc app=leetcode id=5 lang=java
 *
 * [5] Longest Palindromic Substring
 */

// @lc code=start
class Solution {
    public String longestPalindrome(String s) {

        int n=s.length();
        String longest= s.charAt(0)+"";
        String curr="";
        for(int i=0;i<n;i++){
            int high=i+1;
            int low=i-1;
            while(high<n && low>=0 && s.charAt(high)==s.charAt(low)){
                curr=s.substring(low,high+1);
                high++;
                low--;

            }
            if(curr.length()>longest.length()){
                longest=curr;
            }
             high=i+1;
             low=i;
             while(high<n && low>=0 && s.charAt(high)==s.charAt(low)  ){
                curr=s.substring(low,high+1);
                high++;
                low--;

            }
            if(curr.length()>longest.length()){
                longest=curr;
            }
        }
        
        return longest;
        
    }
}
// @lc code=end

