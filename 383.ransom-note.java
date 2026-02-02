/*
 * @lc app=leetcode id=383 lang=java
 *
 * [383] Ransom Note
 */

// @lc code=start

import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        char[] arr = new char[26];

        for (char c : magazine.toCharArray()) {
            arr[c - 'a']++;
        }
        for (char c : ransomNote.toCharArray()) {
            if (arr[c-'a']!=0) {
                arr[c-'a']--;

            } else {
                return false;
            }
        }
        return true;

    }
}
// @lc code=end
