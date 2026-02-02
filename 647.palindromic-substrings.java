/*
 * @lc app=leetcode id=647 lang=java
 *
 * [647] Palindromic Substrings
 */

// @lc code=start
class Solution {
    public int countSubstrings(String s) {
        int n = s.length();
        int nop = s.length();

        for (int i = 0; i < n; i++) {
            int high = i + 1;
            int low = i - 1;
            while (high < n && low >= 0 && s.charAt(high) == s.charAt(low)) {
                nop++;
                high++;
                low--;
            }
            high = i + 1;
            low = i;
            while (high < n && low >= 0 && s.charAt(high) == s.charAt(low)) {
                nop++;
                high++;
                low--;
            }
        }
        return nop;

    }
}
// @lc code=end
