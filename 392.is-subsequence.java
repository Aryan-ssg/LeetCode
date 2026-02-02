/*
 * @lc app=leetcode id=392 lang=java
 *
 * [392] Is Subsequence
 */

// @lc code=start
class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.length() > t.length()) {
            return false;
        }
        if(s.length()==0){
            return true;
        }
        int ind = 0;

        for (int j = 0; j < t.length(); j++) {

            if (t.charAt(j) == s.charAt(ind)) {
                ind++;
            }
            if (ind == s.length()) {
                break;
            }

        }
        if (ind == s.length()) {
            return true;
        } else {
            return false;
        }

    }
}
// @lc code=end
