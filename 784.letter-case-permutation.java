/*
 * @lc app=leetcode id=784 lang=java
 *
 * [784] Letter Case Permutation
 */

// @lc code=start

import java.util.ArrayList;
import java.util.*;

class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> perm = new ArrayList<>();
        backtrack(s, new String(), 0, perm);
        return perm;

    }

    static void backtrack(String s, String curr, int index, List<String> perm) {
        if (curr.length() >= s.length()) {
            perm.add(new String(curr));
            return;
        }

        if (Character.isDigit(s.charAt(index))) {
            curr += s.charAt(index);
            backtrack(s, curr, index + 1, perm);

        } else {
            char temp = s.charAt(index);
            curr += Character.toUpperCase(temp);
            backtrack(s, curr, index + 1, perm);
            curr = curr.substring(0, curr.length() - 1);
            curr += Character.toLowerCase(temp);
            backtrack(s,curr,index+1,perm);

        } 
        return;

    }
}
// @lc code=end
