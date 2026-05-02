/*
 * @lc app=leetcode id=1781 lang=java
 *
 * [1781] Sum of Beauty of All Substrings
 */

// @lc code=start
import java.util.*;

class Solution {
    public int beautySum(String s) {
        int n = s.length();
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int[] freq = new int[26];
            for (int j = i; j < n; j++) {

                freq[s.charAt(j) - 'a']++;

                int max = 0;
                int min = Integer.MAX_VALUE;
                for (int k = 0; k < freq.length; k++) {
                    if (freq[k] > max) {
                        max = freq[k];
                    }
                    if (freq[k] != 0 && freq[k] < min) {
                        min = freq[k];
                    }
                }
                ans += max - min;

            }
        }
        return ans;

    }
}
// @lc code=end
